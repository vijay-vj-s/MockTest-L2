package test;
import java.util.Scanner;

public class StringReverse {
    public void reverseString(String str){

        String[] stringArray=str.split(" ");
        int len=stringArray.length;
        String temp=stringArray[0];
        stringArray[0]=stringArray[len-1];
        stringArray[len-1]=temp;
       String ans="";
       for(int i=len-2;i>0;i--){
           String tempNew=stringArray[i];
           for(int j=tempNew.length()-1;j>=0;j--){
               ans+=tempNew.charAt(j);

           }

       }
        System.out.println(stringArray[0]+" "+ans+ " "+stringArray[len-1]);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        StringReverse s=new StringReverse();
        s.reverseString(str);
    }
}
