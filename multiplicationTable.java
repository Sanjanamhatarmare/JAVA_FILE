import java.util.*;
public class multiplicationTable{
    public static void printmultiplicationTable(int number){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        for(int i;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
        public static void main(String s[]){
            printmultiplicationTable(5);
        }
    }
