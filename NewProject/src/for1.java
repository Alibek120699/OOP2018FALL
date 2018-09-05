import java.util.Scanner;

public class for1 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2==0) System.out.print(i + " ");
        }
    }
}
