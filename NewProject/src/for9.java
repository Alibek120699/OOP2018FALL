import java.util.Scanner;
public class for9 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = 0, c = 0;
        for(int i=0; i<n; i++){
            m = inp.nextInt();
            if(m==0) c++;
        }

        System.out.println(c);
    }
}
