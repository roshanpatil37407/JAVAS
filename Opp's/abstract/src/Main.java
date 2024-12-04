abstract  class  animal{
    public     abstract  void  animalsound();

    void sleep(){
        System.out.println("zzzz");
    }


}
class  pig extends  animal{
    public  void animalsound(){
        System.out.println("pig say : wee wee");

    }

}
 class  Main{
    public  static  void  main(String[]args){
        pig pigs= new pig();
        pigs.sleep();
        pigs.animalsound();

    }
 }