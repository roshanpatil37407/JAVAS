public  class Main {
    public  static  void  main(String [] args){
        try {
            int [] num={1,2,3,4};
            System.out.println(num[2]);
        }catch (Exception e){
            System.out.println("something weth wrong");
        }
        finally {
            System.out.println("error");
        }

    }
}