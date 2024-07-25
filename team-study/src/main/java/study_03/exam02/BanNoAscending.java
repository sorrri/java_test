package study_03.exam02;

import java.util.Comparator;

public class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        /* 알맞은 코드를 넣어 완성하시오 (1) . */
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            return s1.ban < s2.ban ? -1 : (s1.ban == s2.ban ? (s1.no < s2.no ? -1 : 1) : 1);
        }
        return -1;
    }
}

