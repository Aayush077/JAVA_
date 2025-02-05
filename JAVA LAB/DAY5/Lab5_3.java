/*Write a program in Java having three classes Apple, Banana and
Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
own member function show() . Using Dynamic Method Dispatch concept display all the show()
method of each class.
Input: Mention show function of each class.
Output: Display show function of each class accordingly.*/

public class Lab5_3 {
    public static void main(String[] args) {
        Apple a;
        a = new Apple();
        a.show();
        
        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}


class Apple{
    void show(){
        System.out.println("Apple class");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("Banana class");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("Cherry class");
    }
}