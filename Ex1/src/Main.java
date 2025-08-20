import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number element of array: ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int temp =0;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Search item in array: ");
        int key = scanner.nextInt();
        System.out.println("Key at location "+binarySearch(array, key));
    }
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length-1;
        while(high >= low){
            int mid = (low + high)/2;
            if(key < array[mid]){
                high = mid-1;
            }else if(key == array[mid]){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}