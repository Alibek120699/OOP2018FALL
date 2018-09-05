import java.util.Scanner;
public class func2 {
    static double Power(double a, double n){
        double ans = 1;
        while(n>0){
            ans = ans*a;
            n--;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double n = inp.nextDouble();
        System.out.print(Power(a, n));
    }
}
