public class Car extends Automobile{
    
    public Car(){
        super();
    }
    
    public Car(String m, int y, String b){
        super(m,y,b);
    }
    
    public void accelerate(){
        System.out.println("The car accelerates!");
    }

    public void stop(){
        System.out.println("The car stops!");
    }
    
    public void reverse(){
        System.out.println("The car is put in reverse!");
    }
    
    public void honk(){
        System.out.println("The car honks!");
    }
}
