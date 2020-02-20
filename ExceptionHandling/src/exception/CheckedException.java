package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) //throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a value");
try {
	int a=Integer.parseInt(br.readLine());
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}//checked exception
	}

}
//we will get an error for this line br.readLine()
//when we place a cursor on this br.readLine() we get throws
//click on add throws then ---> public static void main(String[] args) throws NumberFormatException, IOException 
//it follows or included after the main
//buffer reader is a monitor related class which prints the value
//InputStream is a keyboard related class which takes the value