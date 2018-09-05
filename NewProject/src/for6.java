import java.util.Scanner;
public class for6 {
    public static boolean check(int x){
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int d = 2;
        int p = 1;
        int ans = 1;
        while(n!=1){
            if(check(n))
            {
                if(n == d)
                {
                    p++;
                }
                else
                {
                    ans *= p;
                    p=2;
                }
                break;
            }
            //System.out.println(p);
            if(n%d==0){
                n = n/d;
                p++;
            }
            else{
                ans *= p;
                p = 1;
                d++;

            }
        }
        System.out.print(ans * p);
    }
}
