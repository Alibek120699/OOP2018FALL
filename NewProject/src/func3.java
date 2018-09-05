import java.util.Scanner;
public class func3 {
    static int Xor(int a, int b){
        if(a==0 && b==1) return 1;
        if(a==1 && b==0) return 1;
        return 0;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        System.out.print(Xor(a, b));
    }
}
