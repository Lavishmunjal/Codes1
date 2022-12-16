import javax.annotation.processing.SupportedSourceVersion;

public class Inheritance {
    public static void main(String[] args) {
        // fish shark  =  new fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat() ;
        dobby.legs = 4;
        System.out.println(dobby.legs); 
        
        
    }
    
}

class animal{
    String color;
    void eat() {
        System.out.println("eats");

    }
    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends animal {
    // for multi level inheritance int legs ; 
    // for hierarchial inheritance
    void walk() {
        System.out.println("walks");

    } 
}
class Bird extends animal {
    void fly() {
        System.out.println("fly");

    }


}
class Fish extends animal {
    void swim() {
        System.out.println("swim");
    }


}
// class Dog extends Mammal {
//     String breed;
// }

// class fish extends animal{
//     int fins;
//     void swims() {
//         System.out.println("swims in water");

//     }
//     public void color(String string) {
//     }
//}
