public class Task13
{
    public static class C implements AutoCloseable { 
        boolean a;
 
        @Override 
        public void close() throws Exception { 
            System.out.println("close"); 
        } 
        
        public void doing() throws Exception{ 
            if(a) System.out.println("TRUE");
		    else throw new Exception("NOT TRUE");
        } 
    } 
 
    public static void main(String[] arguments) throws Exception { 
  
	   try(C test = new C())
	   {
		   test.doing();
	   }
	   catch (Exception e) 
	   {
		   System.out.println(e.getMessage());
	   }
         
    } 
}

