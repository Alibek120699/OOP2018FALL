import java.util.Scanner;
public class while1{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int i=1;
        while(i*i<=a){
            System.out.println(i*i);
            i++;
        }
    }
}
