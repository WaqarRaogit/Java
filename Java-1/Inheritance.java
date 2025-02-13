public class Inheritance {
    public static void main(String args[]){

        Dog exp = new Dog();
    
        exp.swim();
        exp.legs = 4;
        
    }
    class Animal{
        String color;
    
        void eats(){
            System.out.println("Eats Food ");
        }
    
        void swim(){
            System.out.println("swim in water ");
        }
    }
    
    class Mammals extends Animal{
        int legs;
    }
    
    class Dog extends Mammals{
        String breed;
    }
}
