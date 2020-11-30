import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myValues = getInteger(5);
        int[] sorted = sortIntegers(myValues);
        printArray(sorted);
    }

    public static void printArray(int[] arrayValue){
        for(int i=0; i<arrayValue.length; i++){
            System.out.println("Value "+i+" : " + arrayValue[i] );
        }
    }

    public static int[] sortIntegers(int[] arrayToSort){
        int[] sortedArray = new int[arrayToSort.length];
        for(int i=0; i<arrayToSort.length; i++){
            sortedArray[i] = arrayToSort[i];
        }
        boolean flag =true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
        }


    public static int[] getInteger(int input) {
        System.out.println("Enter " + input + " integers.");
        int[] inputArray = new int[input];
        for(int i=0; i<inputArray.length;i++){
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }
}