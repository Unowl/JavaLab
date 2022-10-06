public class Task12
{
    public static void main(String[] args)
    {
      test();
      GetMethod();
    }

    public static void test()
    {
        GetMethod();
    }

	public static void GetMethod(){
    Thread current = Thread.currentThread();
    StackTraceElement[] methods = current.getStackTrace();
    if(methods.length>3)
    System.out.println(methods[3].getMethodName());
    else System.out.println("NaN");
    }
}