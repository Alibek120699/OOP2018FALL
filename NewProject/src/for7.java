import java.util.Scanner;
public class for7 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int [] a;
        a = new int[100];
        for(int i=0; i<100; i++){
            a[i]=inp.nextInt();
            sum = sum + a[i];
        }

        System.out.print(sum);
    }
}
