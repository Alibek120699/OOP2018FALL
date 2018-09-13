import java.util.Scanner;
import java.lang.*;
class Array{
    Integer ar[];

    Array(Integer... ar){
        this.ar = ar;
    }

    void makeArray(){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " " + ar[i] + " ");
        }
    }
}
public class problem_5 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        Array a = new Array(5, 7, 6, 8);
        a.makeArray();
    }
}
