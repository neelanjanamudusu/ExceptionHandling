package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandlingChecked {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	System.out.println(a);
}
catch(IOException ie){
	System.out.println("checked exception");
}
	}}
