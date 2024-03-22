import java.util.Scanner;

//Abstraction
public class Abstraction{
    public static void main(String[] args){
        PerformAction performAction = new PerformAction();
        performAction.perform();
    }
}

//abstract class
abstract class Animal{
    public abstract String sound();
}

//concrete class
class Lion extends Animal{

    @Override
    public String sound(){
        return "Sound of Lion.";

    }
}

class Tiger extends Animal{

    @Override
    public String sound(){
        return "Sound of Tiger.";
    }
}

//abstract class
abstract class Shape{
    public abstract void area();
    public abstract void perimeter();
}

class Circle extends Shape{
    @Override
    public void area(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");

        int radius = Integer.parseInt(in.nextLine());
        in.close();
        System.out.println("Area of Circle: " + 3.14 * radius * radius);
    }

    @Override
    public void perimeter(){

    }
}

class Triangle extends Shape{
    @Override
    public void area(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base of Triangle: ");
        int base = Integer.parseInt(in.nextLine());
        in.close();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter height of Triangle: ");
        int height = Integer.parseInt(in2.nextLine());
        in2.close();
        System.out.println("Area of Triangle: " + 0.5 * base * height);
    }

    @Override
    public void perimeter(){

    }
}

class PerformAction{

    public void perform(){
        System.out.println("Choose input for specific task:");
        System.out.println("1 -- To get sound of Lion and Tiger");
        System.out.println("2 -- To get area and perimeter of Circle and Triangle");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your choice: ");

        String input = userInput.nextLine();
        userInput.close();

        switch(input){
            case "1":
                Animal a = new Lion();
                System.out.println(a.sound());
                Animal b = new Tiger();
                System.out.println(b.sound());
                break;
            case "2":
                Shape s = new Circle();
                s.area();
                Shape s1 = new Triangle();
                s1.area();
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}