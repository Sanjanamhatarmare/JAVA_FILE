public class bintodec {
    public static void bintodec(int n){
        int pow=0;
        int binnum=0;
        while(n>0){
            int rem =n%2;
            binnum=binnum+(rem*(10));
            pow++;
            n=n/2;
        }
        System.out.println("binary from of"+"="+binnum);
    }
    public static void main(String args[]){
        bintodec(80);
    }
}
