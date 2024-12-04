public class Main {
    public static void main(String[] args) {

        String str="Roshan";
        System.out.println("lower : " + str.toLowerCase());
        System.out.println("upper : " + str.toUpperCase());
        System.out.println("lenght : " + str.length());
        System.out.println("trim :"  + str.trim());

        System.out.println("sub:"  + str.substring(5));




        String str1="Roshan";
        String str2="Patil";
        System.out.println("CompareTo: " + str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        System.out.println("Replace 'o' with 'a': " + str.replace('o', 'a'));
        System.out.println("Replace 'Patil' with 'Roshan': " + str.replace("Patil", "krishana"));


    }
    }