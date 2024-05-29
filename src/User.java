import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -647560428174098473L;
	String name;
	String password;
	
	public void sayHello() {
		System.out.println("Hello "+name);
		
	}

}
