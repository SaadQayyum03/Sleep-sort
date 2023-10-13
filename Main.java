import java.util.*;

public class Main {

    public static ArrayList<Integer> sortedArr = new ArrayList<Integer>();
    public static void main(String[] args) {
        ArrayList<Integer> unsortedArr = createArray(6, 10);
        for (Integer i: unsortedArr){
            Number num = new Number(i, unsortedArr.size());
            num.start();
        }
        printArray(unsortedArr, "Unsorted Array");
    }
    
    public static ArrayList<Integer> createArray(int size, int max){
        ArrayList<Integer> output = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < size; i++){
            int num = rand.nextInt(max);
            output.add(num);
        }

        return output;
    }

    public static void printArray(ArrayList<Integer> arr, String name){
        System.out.print(name + ": ");
        for (Integer integer : arr) {
            System.out.print(integer + ", ");
        }
        System.out.println("");
    }
}