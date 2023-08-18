import java.util.Scanner;

public class MaxValueAfterOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int[] arr = new int[X + 1]; // Initializing the array of size X+1 with 0s
        
        for (int index = 0; index < Y; index++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            
            arr[i] += k; // Increment the k at index i
            if (j + 1 <= X) {
                arr[j + 1] -= k; // Decrement the k at index j+1
            }
        }

        scanner.close();
        
        int max = 0;
        int current = 0;
        for (int value : arr) {
            current += value;
            max = Math.max(max, current);
        }
        
        System.out.println(max);
    }
}
