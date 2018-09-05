import java.util.Scanner;
public class if4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a>0) System.out.println(1);
        else if(a<0) System.out.println(-1);
        else System.out.println(0);
    }
}
