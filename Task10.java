/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface Transport_Vehicle{
    public void start_the_engine();
    
}
abstract class Public_Transport implements Transport_Vehicle{
    private String model;

    public abstract void gas();
   

    public abstract void brake();

    public String getModel() {
       return model;
    }

    public void setModel(String model) {
       this.model = model;
    }
}
class Tram extends Public_Transport{
    @Override
    public void start_the_engine(){
        System.out.println("Заводим двигатель...");
    }
    @Override
    public void gas() {
       System.out.println("Трамвай газует!");
    }

    @Override
    public void brake() {
        System.out.println("Трамвай тормозит!");
    }
}
public class Task10
{
	public static void main(String[] args) {
		Tram T = new Tram();
		T.start_the_engine();
		T.gas();
		T.brake();
	}
}
