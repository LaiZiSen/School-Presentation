//explain class variables
import java.io.*; 
import java.util.*; 

class Student{
    static String schoolName = "SMK SK";//this is a class variable
    String name; //this is a instance variable
}

public class Version2{
    static void message(Student student1, Student student2){
        Stack<String> stack = new Stack<String>();
        stack.add("-----------------------------------------------------");
        stack.add("From stuent1");
        stack.add(String.format("Name: %s", student1.name));
        stack.add(String.format("School: %s", student1.schoolName));
        stack.add("-----------------------------------------------------");
        stack.add("From student2");
        stack.add(String.format("Name: %s", student2.name));
        stack.add(String.format("School: %s", student2.schoolName));
        stack.add("-----------------------------------------------------");
        stack.add("From Student class");
        stack.add(String.format("School: %s", Student.schoolName));
        stack.add("-----------------------------------------------------");
        
        Object[] output = stack.toArray();

        int i = 0;
        for(i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }



    public static void main(String args[]) {
        Student student1 = new Student(); //student1 is an instance
        Student student2 = new Student(); //student2 is an instance

        student1.name = "Ali";
        student2.name = "Abu";

        message(student1 = student1, student2 = student2);

        student1.schoolName = "SEKOLAH MENENGAH KEMBANGAN SERI KEMBANGAN";
        System.out.println("////////////////////AFTER CHANGES////////////////////");
        message(student1 = student1, student2 = student2);
    }
}