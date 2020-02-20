package exception;
public class DemoThrow {
void validate(int age){
	if(age<18){
		throw new ArithmeticException("inavalid");
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoThrow d=new DemoThrow();
d.validate(15);
System.out.println("enter age below 18");
	}}
