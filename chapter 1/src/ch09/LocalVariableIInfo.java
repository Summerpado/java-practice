package ch09;

public class LocalVariableIInfo {

	public static void main(String[] args) {
		var i =10; 
		var D = 10.0; 
		var str="Test";
		var A_str=str; 
		str ="hello";
		
		System.out.println(i);
		System.out.println(D); 
		System.out.println(str);
		System.out.println(A_str);

	}

}
 