class animal{
    public  void  animalsound()
    {
        System.out.println("animal sounds :");
    }
}
class cat extends  animal{
    public  void  animalsound()
{
    System.out.println(" cat say : moww moww");
}
}

class dog extends  cat{
    public  void  animalsound()
    {
        System.out.println(" dog say : boww boww");
    }
    public  static  void main(String [] args){
        animal animals=new animal();
        cat cats=new cat();
        dog dogs = new dog();

        animals.animalsound();
        cats.animalsound();
        dogs.animalsound();
    }
}
