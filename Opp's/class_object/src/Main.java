class  person{
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        void info(){
            System.out.println("name :"+ name);
            System.out.println("age :"+ age);

    }
}
public  class Main{
public  static  void main(String [] args){
    person p1=new person("ram",20);
    person p2=new person("sham",25);

    p1.info();
    p2.info();


}

}
