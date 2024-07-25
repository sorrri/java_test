package com.ohgiraffers.section03.map.run;

/* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        Map<Object, Object> hMap = new HashMap<>();
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println("키가 \"one\"인 value 값: " + hMap.get("one"));
        System.out.println("Map의 toString(): " + hMap);

        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), "허균의 홍길동전이면 오케이!");
        System.out.println("map의 키 값으로 활용되는 객체를 활용: " + hMap.get(
                new BookDTO(2, "홍길동전", "허균", 56000)));

        /* 설명. key 값은 중복되면 안되지만 중복될 경우 나중의 key와 value가 기존의 값을 덮어 씌운다. */
        hMap.put(12, "purple banana");
        System.out.println("hMap = " + hMap);

        /* 설명. value 값은 중복되어도 상관없이 추가 된다. */
        hMap.put(34, 123);
        System.out.println("hMap = " + hMap);

        System.out.println("Map이 지닌 entry의 수: " + hMap.size());

        System.out.println("34번 키와 관련된 entry 삭제: " + hMap.remove(34));
        System.out.println("삭제 후 entry의 수: " + hMap.size());

        /* 설명. Map을 반복하여 활용 */
        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java 17");
        hMap2.put("two", "mariaDB 10");
        hMap2.put("three", "sevlet/jsp");
        hMap2.put("four", "springboot 3.0");
        hMap2.put("five", "vue.js");

        /* 목차. 1. keySet()을 활용한 iterator 반복 (feat.key 값만 set으로 변환) */
        Set<String> keys = hMap2.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println("key: " + key + ", value: " + hMap2.get(key));
        }

        /* 목차. 2. entrySet()을 활용한 iterator 반복 (feat.key + value set으로 반환) */
        Set<Map.Entry<String, String>> set = hMap2.entrySet();
        Iterator<Map.Entry<String, String>> iterEntry = set.iterator();
        while(iterEntry.hasNext()) {
            Map.Entry<String, String> entry = iterEntry.next();

            System.out.println("key 값: " + entry.getKey() + ", value 값: " + entry.getValue());
        }
    }
}
