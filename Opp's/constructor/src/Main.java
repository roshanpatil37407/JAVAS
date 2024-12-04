class car{
    String name;
    String color;

    car(){
      name="Thar"  ;
      color="black";
    }
    car(String name, String color){
        this.name=name;
        this.color=color;

    }
    void info(){
        System.out.println("name :"  +name);
        System.out.println("color :"   +color);
    }
}
public  class Main {
    public  static  void main(String [] args){
        car c1=new car();
        System.out.println("car1 deatils :");
        c1.info();

        car c2=new car("bmw",  "white");
        System.out.println("\ncar2 deatils :");
        c2.info();
    }
}