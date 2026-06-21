package collectionDemo;

import java.util.*;
public class TestTwo {



	    public static int lastStone(int[] stones) {

	        PriorityQueue<Integer> pq =
	                new PriorityQueue<>(Collections.reverseOrder());

	        for (int stone : stones) {
	            pq.add(stone);
	        }

	        while (pq.size() > 1) {

	            int first = pq.poll();   // biggest
	            int second = pq.poll();  // second biggest

	            if (first != second) {
	                pq.add(first - second);
	            }
	        }

	        return pq.isEmpty() ? 0 : pq.poll();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("size of bag: ");
	        int n = sc.nextInt();

	        int[] stones = new int[n];

	        for (int i = 0; i < n; i++) {
	        	System.out.println("element for index : " + i);
	            stones[i] = sc.nextInt();
	        }

	        System.out.println(lastStone(stones));

	        sc.close();
	    }
	
}
