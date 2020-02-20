package exception;

public class HandlingUnchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=10,b=0,c;  
		/*try{
			String s=null;//NullPointerException
			System.out.println(s.length());
		try{
			String s2="neeluramya";//StringIndexOutOfBoundsException
		System.out.println(s2.charAt(11));
		try{
			int arr[]=new int[5];
			arr[6]=10;//ArrayIndexOutOfBoundsException
			
		try{
			c=h/b;   //ArithmeticException
	
		}
		catch(ArithmeticException d){
			System.out.println("ArithmeticException");//printed only when try block can access it
		}}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");//printed only when try block can access it
		}}
		catch(StringIndexOutOfBoundsException f){
			System.out.println("StringIndexOutOfBoundsException");//printed only when try block can access it
		}}
		catch(NullPointerException g){
			System.out.println("NullPointerException");//printed only when try block can access it  
		}
	*/	
		try{
			String s=null;//NullPointerException
			System.out.println(s.length());}
		catch(NullPointerException g){
			System.out.println("NullPointerException");//printed only when try block can access it  
		}
		try{
			c=h/b;   //ArithmeticException
	
		}
		catch(ArithmeticException d){
			System.out.println("ArithmeticException");//printed only when try block can access it
		}
		try{
			String s2="neeluramya";//StringIndexOutOfBoundsException
		System.out.println(s2.charAt(11));}
		catch(StringIndexOutOfBoundsException f){
			System.out.println("StringIndexOutOfBoundsException");//printed only when try block can access it
		}
		try{
			int arr[]=new int[5];
			arr[6]=10;//ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");//printed only when try block can access it
		}
		finally{
		System.out.println("Exception handled successfully");//this will print all the time
		}}}
