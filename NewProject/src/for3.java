import java.util.Scanner;
public class for3 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double a = inp.nextInt();
        double b = inp.nextInt();
        double j = a;
        for(double i=a; i<=b; i++){
            j = i;
            j = Math.sqrt(j);
            j = Math.floor(j);
            if(j*j==i) System.out.print((int)i + " ");
        }
    }
}
