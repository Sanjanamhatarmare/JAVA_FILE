import java.util.Scanner;
public class table{
    public static void printmultiplicationTable(int number){
        int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        for(i;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
        public static void main(String s[]){
            printmultiplicationTable(5);
        }
    }
