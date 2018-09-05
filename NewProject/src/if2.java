import java.util.Scanner;

public class if2 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a%4==0 && a%100!=0) System.out.println("YES");
        else if(a%400==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
