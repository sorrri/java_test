package study_03.exam03;

import java.util.PriorityQueue;

public class Application1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(2);

        System.out.println(pq);
    }
}
