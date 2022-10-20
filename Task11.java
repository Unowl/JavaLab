
public class Task11
{
    static class TestException extends Exception {
    public TestException(String message) {
        super(message);
    }
    
    @Override
    public String getMessage() {
        return super.getMessage();
    } 
    
    }
    static void test(boolean a) throws TestException{
	   if(a)  System.out.println("TRUE");
	   else throw new TestException("FALSE");
    }

	public static void main(String[] args) throws TestException{
	    test(true);
	}
}
