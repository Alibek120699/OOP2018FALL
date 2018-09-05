import java.util.Scanner;
public class while2 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int i=2;
        while(i<=a){
            if(a%i==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}