

public class ArithmeticOperators{
    public static void main(String[] args){
        int a=14, b=5;
        float c =(float)a/b;  // type casting to float from int
        int r=a%b;
        System.out.println(c);
        System.out.println(r);

        float d = 14.3f, e = 3.2f; // type casting to float from double
        float f = d%e;
        System.out.println(f);

       /*  byte g = 10;
        short h = 20;

        byte i=g+h; // error: incompatible types: possible lossy conversion from int to byte
        */
        
    }
}