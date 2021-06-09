
package oopjava;

class Human{
    String name;
    int age;
    
    //overloading
    
    public void walk(int km){
        System.out.println("walk distents"+ " "+km);  
    }
    public void walk(int km,int h)
    {
          System.out.println("walk distents"+ " "+km + " "+ "within "+ h+"hours");  
    }
    
}

class Abdhu extends Human{
    // override here we can write same method or other things same as we have writen in above class
    //and also we can modify
    public void walk(String km)
    {
         System.out.println("walk distents"+ " "+km+"km" );  
    }
    
     public void walk(int km,int h,int min)
    {
          System.out.println("walk distents"+ " "+km +"km" +" "+ "within "+ h+" hours "+"and "+min+ "minutes");  
    }
}

public class Polymorphism {
     public static void main(String[] args){
     
     Abdhu ab=new Abdhu();
     ab.name="Abdalla";
     ab.age=20;
     ab.walk(10);
     ab.walk(10,5, 30);
     
     }
}
