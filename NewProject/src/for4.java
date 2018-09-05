import java.util.Scanner;
public class for4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}
