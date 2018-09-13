import java.util.Scanner;
class Student{
    String name;
    String id;
    int year = 2017;
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    void show(){
        System.out.println(name + " " + id + " " + year);
    }

    void update(){
        year++;
    }
}
public class Student_1 {
    public static void main(String args[]){
        Student s1 = new Student("Alibek", "17bd110307");
        s1.show();
        s1.update();
        s1.show();
    }
}
