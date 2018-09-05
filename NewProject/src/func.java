import java.util.Scanner;
public class func {
    static int Min(int a, int b, int c, int d){
        if(a<=b && a<=c && a<=d) return a;
        if(b<=a && b<=c && b<=d) return b;
        if(c<=a && c<=b && c<=d) return c;
        return d;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        System.out.print(Min(a, b, c, d));

    }
}
