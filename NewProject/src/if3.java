import java.util.Scanner;
public class if3 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if(a==1 && b==1) System.out.println("YES");
        else if(a!=1 && b!=1) System.out.println("YES");
        else System.out.println("NO");
    }
}
