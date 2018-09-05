import java.util.Scanner;
public class for8 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = 0, sum = 0;
        for(int i=0; i<n; i++){
            a = inp.nextInt();
            sum =  sum + a;
        }

        System.out.println(sum);
    }
}
