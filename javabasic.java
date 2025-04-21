import java.util.Scanner;
public class javabasic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil =sc.nextFloat();
        float pen=sc.nextFloat();
        float eresar=sc.nextFloat();
        float total=pencil+pen+eresar;
        System.out.println("Bill is :"+total);
        float newtotal=total+(0.18f*total);
        System.out.println("the total tax GST is:"+newtotal);
    }

}
    