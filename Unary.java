package all;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		// ++ Increment 
		
		
		int a=6;
		int b=7;
		System.out.println(++a);     // prefix
		System.out.println(++b);   
		
		//or string method
		
		int a1=6, b1=7;
		System.out.println(++a1 +" "+ ++b1); // prefix
		
		int a2=a1+b1;
		System.out.println(++a2);
		
		
		int c=9;
		int d=8;
		System.out.println(c++);  // post fix
		System.out.println(d++);
		
		//or string method
		
		int c1=9, d1=8;
		System.out.println(c1++ +" "+ d1++); // post fix
		int d2=c1+d1;
		System.out.println(d2++);
		
		
		
		// -- decrement
		
		int e=4;
		int f=9;
		System.out.println(--e);  // prefix
		System.out.println(--f);
		
		// or string method
		
		int e1=4, f1=9;
		System.out.println(--e1 +" "+ --f1);  // prefix
		
		int g=e1+f1;
		System.out.println(--g);
		
		
		int h=4;
		int i=1;
		System.out.println(h--); // post fix
		System.out.println(i--);
		
		// or string method
		
		int h1=4, i1=1;
		System.out.println(h1-- +" "+ i1--);  // post fix
		
		int k=h1+i1;
		System.out.println(k--);
		
		
		
		
		
		
	}

}
