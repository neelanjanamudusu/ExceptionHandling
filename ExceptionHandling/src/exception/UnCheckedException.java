package exception;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0,c;
c=a/b;   //ArithmeticException
System.out.println(c);
		String s=null;//NullPointerException
		System.out.println(s.length());
		String s1="neeluramya";//StringIndexOutOfBoundsException
		int a1=Integer.parseInt(s1);
		System.out.println(s1);
		int arr[]=new int[5];
		arr[6]=10;//ArrayIndexOutOfBoundsException
		System.out.println();
		String s2="neeluramya";//StringIndexOutOfBoundsException
		System.out.println(s2.charAt(11));
	}}
