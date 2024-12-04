class outer{
    int x=10;
    class  inner{
        public  int fun(){
            return x;
        }
    }
}

class  Main{
    public  static  void main(String [] args)
    {
        outer out= new outer();
        outer.inner in= out.new inner();
        System.out.println(in.fun());
    }
}