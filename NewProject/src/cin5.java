import java.util.Scanner;
public class cin5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        double t = input.nextDouble();
        double n = v * t;
        System.out.println((int)(n - Math.floor(n/109)*109));
        /*if(n>0){
            System.out.println(n%109);
        }
        if(n<0){
            n = n-(n/109-1)*109;
            if(n<109){
                System.out.println(n);
            }
            else{
                System.out.println(n%109);
            }
        }*/
    }
}
