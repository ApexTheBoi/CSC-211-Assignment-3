public class JunkCar extends Automobile{
    
    public JunkCar(){
        super();
    }
    
    public JunkCar(String m, int y, String b){
        super(m,y,b);
    }
    
    public void accelerate(){
        System.out.println("The Junk Car accelerates!");
    }

    public void stop(){
        System.out.println("The Junk Car stops!");
    }
    
    public void reverse(){
        System.out.println("The Junk Car is put in reverse!");
    }
    
    public void honk(){
        System.out.println("The Junk Car honks!");
    }
}
