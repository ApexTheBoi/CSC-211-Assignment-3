public class Automobile{
    
    private String model;
    private int year;
    private String brand;
    
    public Automobile(){
    this.model = "Ultima";
    this.year = 2012;
    this.brand = "Kia";
    }
    
    public Automobile(String m, int y, String b){
        this.model = m;
        this.year = y;
        this.brand = b;
    }
    
    public int compareTo(Automobile o){
        if (this.getYear() > o.getYear()){
            return 1;
        }
        
        else if(this.getYear() < o.getYear()){
            return -1;
        }
        else{
            return 0; //showing they're equal.
        }
    }
    
    @Override
    public String toString(){
        return "Model : " + this.model + " | Year : " + this.year + " | Brand : " + this.brand;
    }
    
    public boolean equals(Automobile o){
        if(this.getModel() == o.getModel()){
            if(this.getYear() == o.getYear()){
                if(this.getBrand() == o.getBrand()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void honk(){
        System.out.println("The automobile honks!");
    }
    
    public String getModel(){
        return this.model;
    }
    
