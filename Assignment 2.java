// Assignment 2 set 1
// Addition of floating points using inheritance
class one{
    float s=5.4f;
    
}
public class two extends one{
    float b=37.21f;
    public static void main(String args[]){
        two o=new two();
        
        System.out.println(o.s+o.b);
        
    }
}
output
42.61
// Addition of floating numbers using abstract class
abstract class Sum{  
	  abstract void add();  
	}  
	  	 public class MyClass extends Sum{  
	void add()
      {
          float s=20.4f,d=31.54f;
          System.out.println(s+d);
          
      }  
	  
	public static void main(String args[]){  
	 Sum obj = new MyClass();  
	 obj.add();  
	 }  
}  

ouput
51.94

// Adiition of floating numbers using interface
interface Sum{  
	void add();  
	}  
	  
	public class MyClass implements Sum{  
	public void add(){
	    float s=5.53f, t=22.31f;
	    System.out.println(s+t);
	    
	}  
	  
	public static void main(String args[]){  
	MyClass obj = new MyClass();  
	obj.add();  
	 }  
	}  
output
27.84
