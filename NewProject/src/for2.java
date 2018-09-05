import java.util.Scanner;
public class for2 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        for(int i=a; i<=b; i++){
            if(i%d==c) System.out.print(i + " ");
        }
    }
}
