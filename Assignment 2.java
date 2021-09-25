// Assignment 2 set 1
// Addition of floating points using inheritance
class one{
    float s=7.5f;
    
}
public class two extends one{
    float b=2.3f;
    public static void main(String args[]){
        two o=new two();
        
        System.out.println(o.s+o.b);
        
    }
}
output
9.8
// Addition of floating numbers using abstract class
abstract class Sum{  
	  abstract void add();  
	}  
	  	 public class MyClass extends Sum{  
	void add()
      {
          float s=33.4f,d=23.5f;
          System.out.println(s+d);
          
      }  
	  
	public static void main(String args[]){  
	 Sum obj = new MyClass();  
	 obj.add();  
	 }  
}  

ouput
56.9

// Adiition of floating numbers using interface
interface Sum{  
	void add();  
	}  
	  
	public class MyClass implements Sum{  
	public void add(){
	    float s=32.43f, t=22.3f;
	    System.out.println(s+t);
	    
	}  
	  
	public static void main(String args[]){  
	MyClass obj = new MyClass();  
	obj.add();  
	 }  
	}  
output
54.73
