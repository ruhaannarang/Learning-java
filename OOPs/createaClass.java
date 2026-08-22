package OOPs;
class Student{
    String name;
    int rollNo;
    float marks=100.0f;
    //way to add values of teh aboovr properties object by object
    Student(String name,int roll,float marks){
        this.name=name;
        this.rollNo=roll;
        this.marks=marks;
    }
    Student(Student other){
        this.name=other.name;
        this.marks=other.marks;
        this.rollNo=other.rollNo;
    }
    Student(){
        this("User",0,100.0f);
    }
    void greet(){
        System.out.println("Hello everyone,My name is "+ this.name);
    }
    void changeName(String name){
        this.name=name;
    }
}
public class createaClass {
    public static void main(String[] args) {
        Student a= new Student("ruhaan",161,9.5f);
//        a.name="Ruhaan";
//        a.marks=66.6f;
//        a.rollNo=262;
        System.out.println(a);
        System.out.println(a.name);
        System.out.println(a.rollNo);
        System.out.println(a.marks);
        a.greet();
        a.changeName("Daaku");
        System.out.println(a.name);
        Student b= new Student(a);
        System.out.println(b.name);
        System.out.println(b.rollNo);
        System.out.println(b.marks);
        Student x= new Student();
        System.out.println(x.name);
    }
}
