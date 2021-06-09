
package oopjava;

class student{
    String name;
    int age;
    
    public void fluentLanguage(String lang)
    {
        System.out.println("i am very fluent with"+" "+lang);
    }
}

class st1 extends student{
    public void extrawork(String exWork)
    {
         System.out.println("i am always playing"+" "+exWork);
    }

}

public class Inheritance {
     public static void main(String[] args){
         st1 newst=new st1();
         newst.name="Abdhu";
         newst.age=23;
         
         System.out.println(newst.name);
          System.out.println(newst.age);
         newst.fluentLanguage("english");
         newst.extrawork("playing cricket");
     }
}
