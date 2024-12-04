import  java.io.File;
import  java.io.IOException;

class  Main{
    public  static  void  main(String [] args){

        try{
            File obj= new File("ram.txt");
            if(obj.createNewFile()){
                System.out.println("file are created :" +obj.getName());
            }else {
                System.out.println("file are already exixt");
            }
        }catch (IOException e){
            System.out.println("error");
        }
    }
}