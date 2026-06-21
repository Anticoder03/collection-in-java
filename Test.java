package collectionDemo;

import java.util.*;


public class Test {

    public static int minimumTime(int mango, int orange, int pineapple) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        if (mango > 0) pq.add(mango);
        if (orange > 0) pq.add(orange);
        if (pineapple > 0) pq.add(pineapple);

        int seconds = 0;

        while (!pq.isEmpty()) {

            if (pq.size() >= 2) {

                int first = pq.poll();
                int second = pq.poll();

                first--;
                second--;

                seconds++;

                if (first > 0)
                    pq.add(first);

                if (second > 0)
                    pq.add(second);

            } else {

                int remaining = pq.poll();

                seconds += remaining;
            }
        }

        return seconds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number of mangos:");
        int mango = sc.nextInt();
        
        System.out.println("Number of oranges:");
        int orange = sc.nextInt();
        
        System.out.println("Number of pineapple:");
        int pineapple = sc.nextInt();

        System.out.println("The minimum time is: " + minimumTime(mango, orange, pineapple));

      
    }
}



//if we have a bag of ston so we have to colide them and add remaining to the bag continue until np stone found or show last ston