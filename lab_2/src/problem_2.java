class StarTriangle{
    String s = "[*]";
    int width;
    StarTriangle(int width){
        this.width = width;
    }
    public String toString(){
        String output = "";
        for(int i=0; i<width; i++){
            for(int j=0; j<=i; j++){
                output = output + s;
            }
            output = output + "\n";
        }
        return output;
    }
}
public class problem_2 {
    public static void main(String args[]){
        StarTriangle st = new StarTriangle(5);
        System.out.print(st.toString());
    }
}
