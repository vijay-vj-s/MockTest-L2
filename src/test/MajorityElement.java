package test;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " Elements :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        MajorityElement m = new MajorityElement();
        int ans = m.majorityOne(array);
        if (ans == -1) {
            System.out.println("No Majority Element in the Array");
        }
        System.out.println("Majority Element is :" + ans);
    }

    public int majorityOne(int[] array) {
        int len = array.length;
        int count = 1;
        int candidate = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            } else {
                count--;

                if (count == 0) {
                    candidate = array[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            }
            if (count > array.length / 2) {
                return candidate;
            }
        }
        return -1;


    }
}
