public class Student {
    int x = 10; // instance variable
    void display(){
        int x = 20; // local variable
        System.out.println(x);
    }
    public static void main(String[] args) {
        Student a = new Student();
        a.display();
        System.out.print(a.x);
    }
}

