/*:Write a class file – box with three data members(length, width, height)
and a method volume() . Also implement the application class Demo where an object of the
box class is created with user entered dimensions and volume is printed.

Input: length,width and height.
Output: Volume*/

public class Demo{
    public static void main(String[] args){
        Box obj = new Box();
        obj.length = Integer.parseInt(args[0]);
        obj.width = Integer.parseInt(args[1]);
        obj.height = Integer.parseInt(args[2]);
        System.out.println("Volume of the box is: "+obj.volume());
    }
}
class Box{
 int length;
    int width;
    int height;
    public int volume(){
        return length*width*height;
    }
}