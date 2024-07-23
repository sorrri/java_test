package com.ohgiraffers.section03.filterstream;

/* 수업목표. 표준입출력(콘솔을 통한 입출력)을 이해하고 활용할 수 있다. */

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열 입력: ");
        try {
            String input = br.readLine();
            System.out.println("input = " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println이 좋은거구만");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
