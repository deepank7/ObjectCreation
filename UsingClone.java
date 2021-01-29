// Creating an object using the clone method does not invoke any constructor.
// To use clone() method on an object we need to implement Cloneable and define the clone() method in it.
public class UsingClone implements Cloneable{
	@Override
    protected Object clone() throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
    String name = "Clone Method"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingClone obj1 = new UsingClone(); 
        try
        { 
        	UsingClone obj2 = (UsingClone) obj1.clone(); 
            System.out.println(obj2.name); 
        } 
        catch (CloneNotSupportedException e) 
        { 
            e.printStackTrace(); 
        } 
	}

}
