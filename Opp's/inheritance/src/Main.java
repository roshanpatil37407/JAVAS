class vehicle{
    protected  String brand="thar";
    public void honk(){
        System.out.println("color is black");
    }
}
 class  car extends  vehicle{
    private  String model="bmw";
    public  static  void  main(String [] args){
        car c=new car();
        c.honk();

        System.out.println(c.brand +""+ c.model);
    }
 }