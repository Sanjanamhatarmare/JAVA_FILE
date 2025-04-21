import java.util.*;
 public class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int week =sc.nextInt();
        switch (week) {
            case '1':System.out.println("monday");
                      break;
            case '2':System.out.println("tuesday");
                      break;
            case '3':System.out.println("wenesday");
                      break;
            case '4':System.out.println("thusday");
                      break;
            case '5':System.out.println("friday");
                      break;
            case '6':System.out.println("saturday");
                      break;
            case '7':System.out.println("sunday");
                      break;
            default:System.out.println("wrong choice");
                      break;
        }
    }
}