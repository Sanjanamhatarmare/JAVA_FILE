import java.util.*;
    public class cost {
    public static void main(String Args[]){
    Scanner sc=new Scanner(System.in);
    int pencil=sc.nextInt();
    int pen=sc.nextInt();
    int eraser=sc.nextInt();
   int total_cost= pencil + pen + eraser;
   int GST=(total_cost)*18/100;
   int total_bill=total_cost*GST;
   System.out.println("total cost is"+total_cost);
   System.out.println("total GST is"+GST);
   System.out.println("total bill is"+total_bill);
    }
}
