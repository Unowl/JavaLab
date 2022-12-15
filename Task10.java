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
