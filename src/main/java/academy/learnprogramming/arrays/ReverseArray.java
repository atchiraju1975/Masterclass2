package academy.learnprogramming.arrays;

import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Array Size 1-10 :");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        int[] sortedArray = new int[size];

        for(int i=0;i< originalArray.length;i++){
            originalArray[i]=sortedArray[i]=0;
        }

        System.out.println("Enter "+size+" Integers one after another");
        for(int i=0;i<originalArray.length; i++){
        originalArray[i] = scanner.nextInt();
        }

        for(int i=0;i<originalArray.length;i++){
            System.out.println("Original Array Elements no "+(i+1)+ " : "+originalArray[i]);
        }

        for(int j=0;j<sortedArray.length;j++) {
            int maxIndex=0;
            int maxValue=0;
            for (int i = j; i < originalArray.length; i++) {
                if(originalArray[i]>=maxValue){
                maxIndex=i;
                maxValue=originalArray[i];}
            }
            sortedArray[j]=maxValue;
            int tempInteger = originalArray[maxIndex];
            originalArray[maxIndex]=originalArray[j];
            originalArray[j]=tempInteger;
        }

        for(int i=0;i<sortedArray.length;i++){
            System.out.println("Sorted Array Elements no "+(i+1)+ " : "+sortedArray[i]);
        }
    }

}
