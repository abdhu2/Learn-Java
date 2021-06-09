
package oopjava;

class Abstraction{
      String name;
      int age;
      public void Sleep(){
          System.out.println("zzzzz");
      }
      
}

public class OopJava {
    public static void main(String[] args) {
      Abstraction student = new Abstraction();
      student.age=10;
      student.name="Abdhu";
      System.out.println(student.name);
      System.out.println(student.age);
      student.Sleep();
    }
    
}
