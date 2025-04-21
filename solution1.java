//import java.util.*;
//public class solution1{
    //public static void main(String Args[]){
        //Scanner sc=new Scanner(System.in);
        //int num;
       // int fact=1;
        //System.out.println("enter your number");
        //num=sc.nextInt();
       // for(int i;i<=num;i++){
      //  }
       // System.out.println("factorial is"+fact);
    //}
//}
import java.util.Scanner;
public class solution1{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int num;// To hold numberintfact=1;// To hold factorial
        int fact=1;
        System.out.print("Enter any positive integer:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}