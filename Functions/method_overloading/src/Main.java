public class Main {
    static  int add(int x,int y){
        return  x+y;
    }

    static  double sub(double a,double b){
        return  a-b;
    }

    public  static  void  main(String[] args){

        int num1= add(20,30);
        double num2 = sub (14.50, 6.50);
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);
    }
}