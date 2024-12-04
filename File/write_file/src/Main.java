import  java.io.FileWriter;
import  java.io.IOException;

class  Main{
    public  static  void  main(String [] args){

        try{
            FileWriter obj= new FileWriter("ram.txt");
            obj.write("this is the file writer");
            obj.close();
            System.out.println("competed writing");

        }catch (IOException e){
            System.out.println("error");
        }
    }
}