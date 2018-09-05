import java.util.Scanner;
public class while4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean ok = true;
        while(n!=1){
            if(n%2==1){
                ok = false;
                break;
            }
            n /= 2;
        }
        if(ok==false) System.out.print("NO");
        else System.out.print("YES");

    }
}
