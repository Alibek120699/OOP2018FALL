import java.util.Scanner;
public class hack2 {
    public static void main(String agrs[]){
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        int a = inp.nextInt();
        int b = inp.nextInt();
        s = s.substring(a, b);
        System.out.print(s);

        // https://www.hackerrank.com/challenges/java-substring/problem
    }
}
