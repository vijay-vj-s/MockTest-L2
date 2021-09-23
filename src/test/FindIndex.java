package test;

import java.util.Scanner;

public class FindIndex {
    public int findIndex(int [] array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter "+size+" Elements :");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the key :");
        int key=sc.nextInt();
        FindIndex f=new FindIndex();
       int ans= f.findIndex(array,key);
       if(ans==-1){
           System.out.println("Key is not in the array");
       }
       else {
           System.out.println("Index of the Given Element is :" + ans);
       }
    }
}
