
package oopjava;

class Student{
    private String name;
    private int age;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        this.name=newName;
    }
}



public class Encapsulation {
     public static void main(String[] args){
         Student newSt = new Student();
         newSt.setName("Abdhu");
         System.out.println(newSt.getName());
         
     }
}
