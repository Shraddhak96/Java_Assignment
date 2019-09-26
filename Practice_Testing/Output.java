class A 
   {
        String i="hi";
		int j;
        A() 
        {
        //    i = 1;
            j = 2;
        }
   }
   class Output 
   {
        public static void main(String args[])
        {
			A obj1 = new A();
			 
		//	System.out.println(obj1.i);
			
			System.out.print(obj1.i.toString());
        }
   }