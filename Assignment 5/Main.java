
class Animal {
    
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }

    
    void showHabit() {
        System.out.println("Dogs are loyal and love to play fetch.");
    }
}


class Parrot extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("The parrot chirps: Squawk! Hello!");
    }

   
    void showHabit() {
        System.out.println("Parrots can mimic human speech and love fruits.");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Animal a1 = new Dog();
        a1.makeSound();  

        
        Animal a2 = new Parrot();
        a2.makeSound();  

       
        Dog d = new Dog();
        d.showHabit();

        Parrot p = new Parrot();
        p.showHabit();
    }
}
