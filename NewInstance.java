
public class NewInstance {

	 String name = "NewInstance"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        { 
            Class cls = Class.forName("NewInstance"); 
            NewInstance obj = 
                    (NewInstance) cls.newInstance(); 
            System.out.println(obj.name); 
        } 
        catch (ClassNotFoundException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (InstantiationException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (IllegalAccessException e) 
        { 
            e.printStackTrace(); 
        } 

	}

}
