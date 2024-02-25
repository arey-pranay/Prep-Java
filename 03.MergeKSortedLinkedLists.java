import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
      
        LinkedList<Integer>[] LA = new LinkedList[k];
        for (int j = 0; j < k; j++) {
            LA[j] = new LinkedList<Integer>();
        }
        int i = 0;
        while (i < k) {
            int temp = sc.nextInt();
            if (temp == -1) {
                i++;
            } else {
                LA[i].add(temp);
            }
        }
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int m = 0; m < k; m++) {
            if (!LA[m].isEmpty()) {
                minHeap.offer(new int[]{LA[m].poll(), m});
            }
        }
        
        LinkedList<Integer> mergedList = new LinkedList<>();
        while (!minHeap.isEmpty()) {
            int[] entry = minHeap.poll();
            int value = entry[0];
            int listIndex = entry[1];
            mergedList.add(value);
            if (!LA[listIndex].isEmpty()) {
                minHeap.offer(new int[]{LA[listIndex].poll(), listIndex});
            }
        }
        
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
