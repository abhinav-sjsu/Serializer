import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		//Serialization = 	The process of converting an object into a byte stream.
		   //					Persists (saves the state) the object after program exits
		   //					This byte stream can be saved as a file or sent over a network
		   //					Byte stream can be saved as a file (.ser) which is platform independent
		   //					(Think of this as if you're saving a file with the object's information)
		   
		   //					Steps to Serialize
		   //					---------------------------------------------------------------
		   //					1. Your class should implement Serializable interface
		   //					2. add import java.io.Serializable;
		   //					3. FileOutputStream fileOut = new FileOutputStream(file path)
		   //					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		   //					5. out.writeObject(objectName)
		   //					6. out.close(); fileOut.close();
		   //					---------------------------------------------------------------
		   
		   		
		User user = new User();
		user.name = "Bro";
		user.password = "Password!234";
		
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object Info saved! :)");

	}

}
