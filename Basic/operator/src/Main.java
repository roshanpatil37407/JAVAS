public class Main {
    public static void main(String[] args) {


         int a=60;
         int b=40;
         if(a < 50 && b < 50){
             System.out.println( "both are same");
         }
         else if(a < 50 || b < 50){
            System.out.println( "both are same diff ");
        }
        else  if (a < 50 ^ b < 50){
            System.out.println( "both are same");
        }
    }
}