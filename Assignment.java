package all;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment operator
		
		/*assignment operators are used to assign values to variables......
		 * 
		 *  =  
		 *  +=
		 *  -=
		 *  *=
		 *  %=
		 *  &=
		 *  |=
		 *  ^=
		 *  >>=
		 *  <<=
		 *   
		 *  */
		
				int a=5;
				int b=8;
				System.out.println(a+=b); // a=a+b
				
				int c=5;
				int d=8;
				System.out.println(c-=d); // c=c-d
				
				int e=5;
				int f=8;
				System.out.println(f+=e); // f=f+e
				
				int g=5;
				int h=8;
				System.out.println(h-=g);  //h=h-g
				
				
				
			
				//Write a Java program that calculates the total cost of buying three books, 
				//each priced at $15.50, with a 10% discount.
				
				double priced=15.50;
				int books=3;
				double discount=0.10;
				
				double totalcost=priced*books*(1-discount);
				
				System.out.println("the total cost is:"+totalcost+" "+"$");
				
				//Write a Java program that calculates the total cost of buying five items, 
				//each priced at $10.99, with a 5% sales tax.
				
				double price=10.99;
				int buying=5;
				double tax=0.5;
				double total=price*buying*(1+tax);
				System.out.println("the total cost is:"+total+" "+"$");
				
				//Write a Java program that calculates the total cost of buying two pizzas, each priced at $12.99, with a 15% tip.
				 
				double pric=10.99;
				int pizzas=2;
				double salestax=0.5;
				double to=pric*pizzas*(1+salestax);
				System.out.println("the total cost is:"+to+" "+"$");
				
				
				
				
		
		
		
		
		
	}

}
