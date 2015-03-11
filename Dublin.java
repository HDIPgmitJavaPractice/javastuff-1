package gmit;





	public class Dublin
		{

	        int a = 1;
	        void method ()
	        {
	           Dublin d = new Dublin();
	           d.a = 2; 
	           System.out.println(d.a);//2 will be displayed because it is accessed by d.a
	           System.out.println(a);//instance variable will be displayed with the modified value of 4 (an object which invokes the method makes changes to its variables)
	           method1();
	        }
	        void method1()
	        {
	               System.out.println(a);// 4 will be displayed because this method is in invocation chain created by the object which invoked method() from main. 
	                                     //So it will access the instanve variable from the same object which first invoked its calling method.
	        }

	        public static void main (String [] args)
	        {
	            Dublin d = new Dublin();
	            d.a = 4;
	            System.out.println(d.a);//obvious
	            d.method();
	            System.out.println(d.a);// 2 won't be printed because that modification was only to the local object of that method
	        }
	}

	
	
