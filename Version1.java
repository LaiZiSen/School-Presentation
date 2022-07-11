//Explain what is an instance, 
//then explain how classes and instances are different
class Student{
    static String schoolName = "SMK SK";
    String name;
}

public class Version1{
    public static void main(String args[]) {
        Student student1 = new Student(); //student1 is an instance
        Student student2 = new Student(); //student2 is an instance
    }
}
