import java.util.Scanner;
public class if5 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if(a>b) System.out.println(1);
        else if(a<b) System.out.println(2);
        else System.out.println(0);
    }
}
