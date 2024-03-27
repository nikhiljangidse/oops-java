package MethodOverriding;

public class Overriding {
    public static void main(String[] args){
        Child obj = new Child();
        obj.show();
    }
}

class Parent{
    public void show(){
        System.out.println("Parent's show");
    }
}

class Child extends Parent{
    @Override
    public void show(){
        System.out.println("Child's show");
    }
}
