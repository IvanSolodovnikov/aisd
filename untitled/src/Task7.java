import java.util.Scanner;
import java.util.HashMap;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер");
        int n = scanner.nextInt();
        int[] arr =  new int[n];
        System.out.println("введите элементы");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        int cur_max = 0;
        for (int count: countMap.values()){
            if(count > cur_max){ cur_max = count;}
        }
        System.out.print(cur_max);
    }
}
