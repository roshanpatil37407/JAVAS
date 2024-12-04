interface frist{
    public  void cat();
}

interface second{
    public  void dog();
}

class  demo  implements  frist, second{
    public  void cat(){
        System.out.println("cat says : mow mow");
    }
    public  void dog(){
        System.out.println("dog says : bow bow");
    }
}
class  Main{
    public  static  void  main(String[]args){
        demo obj=new demo();
        obj.cat();
        obj.dog();
    }
}