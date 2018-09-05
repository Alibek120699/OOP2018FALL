import java.util.Scanner;
public class while3 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i + " ");
            i *= 2;
        }
    }
}
