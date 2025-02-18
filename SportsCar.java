public class SportsCar extends Automobile{
   
    public SportsCar(){
        super();
    }
    
    public SportsCar(String m, int y, String b){
        super(m,y,b);
    }
    
    public void accelerate(){
        System.out.println("The Sports Car accelerates!");
    }

    public void stop(){
        System.out.println("The Sports Car stops!");
    }
    
    public void reverse(){
        System.out.println("The Sports Car is put in reverse!");
    }
    
    public void honk(){
        System.out.println("The Sports Car honks!");
    }
}
