

//Deep & Shallow Copy    &   Inheritance 

    // public static void main(String args[]){
    
    //     Student s1 = new Student();
    
    //         s1.name = "Waqar";
    //         s1.roll = 123;
    //         s1.Password = "abcyz";
    //         s1.marks[0] =  50;
    //         s1.marks[1] = 60;
    //         s1.marks[2] = 80;
    
    //     Student s2 = new Student(s1);
    
    //     s2.Password = "xyzab";
    //     s2.marks[2] = 200;
    
    //     for(int i = 0; i < 3; i++){
    //         System.out.println(s2.marks[i]);
    //     }
    
    // }
    // }
    // class Student{
    //     String name;
    //     int roll;
    //     String Password;
    //     int marks[];
    
    // // Shallow  Copy Constructor
    
    //     // Student(Student s1){
    
    //     //     marks = new int[3];
    //     //     this.name = s1.name;
    //     //     this.roll = s1.roll;
    //     //     this.Password = s1.Password;
    //     //     this.marks = s1.marks;
    //     // }
    
    // //Deep Copy Constructor
    
    //     Student(Student s1){
    
    //             marks = new int[3];
    //             this.name = s1.name;
    //             this.roll = s1.roll;
    //             for(int i = 0; i < marks.length; i++){
    //                 this.marks[i]= s1.marks[i];
    //             }
    // }
    
    //     Student(){
    
    //         marks = new int[3];
    //     }
    //-----------------------------------------------------------------------------------------------------
    

    //Inheritance & types





    // public static void main(String args[]){

    //     Dog bubby = new Dog();
    
    //     bubby.eats();
    //     bubby.breed();
    //     bubby.legs = 4;
    //     System.out.println(bubby.legs);
        
    // }
    // class Animal{
    //     String color;
    
    //     void eats(){
    //         System.out.println("Eats Food ");
    //     }
    
    //     void swim(){
    //         System.out.println("swim in water ");
    //     }
    // }
    
    // class Mammals extends Animal{
    //     int legs;
    // }
    
    // class Dog extends Mammals{
    //     void breed(){

    //         System.out.println("German Shaphard ");
    //     }
    // }

    //-------------------------------------------------------------------------------------------------------

                                        //Hybrid Inheritance 

                                
    // public static void main(String args[]){

    //     Fish sh = new Fish();
    //     sh.breathe();
    //     sh.swim();


    //     peacock a1 = new peacock();
    //     a1.color();
    //     a1.fly();

    //     human a2 = new human();
    //     a2.brain();
    //     a2.legs();
    //     a2.breathe();
    //     a2.eats();
    // }
    // class Animal{
    //         String color;
        
    //         void eats(){
    //             System.out.println("Eats Food ");
    //         }
        
    //         void breathe(){
    //             System.out.println("breathe ");
    //         }
    //     }

    // class Fish extends Animal{
        
    //     void swim(){
    //         System.out.println("swim in water");
    //     }
    // }
    //         class tuna extends Fish{

    //             void color(){
    //                 System.out.println("Tuna has black color ");
    //             }
    //         }
    //         class shark extends Fish{
    //                 void size(){
    //                     System.out.println("shark has massive large size  ");
    //                 }
    //         }
    // class  bird extends Animal{
    //     void fly(){
    //         System.out.println("fly in air");
    //     }
    // }
    //         class peacock extends bird{
    //                 void color(){
    //                     System.out.println("peacock has multiple colors");
    //                 }
    //         }

    // class Mammals extends Animal{
    //         void legs(){
    //             System.out.println("Mammals has 4 legs ");
    //         }
    //     }

    //         class dog extends Mammals{
    //             void breed(){
    //                 System.out.println("it's german shaphard ");
    //             }
    //         }

    //         class human extends Mammals{
    //             void brain(){
    //                 System.out.println("human has smart mind ");
    //             }
    //         }
        
    //         class cat extends Mammals{
    //             void fast(){ 
    //                 System.out.println("it's fast ");
    //             }
    //         }

    //----------------------------------------------------------------------------------------------------

                            // Method OverLoading
    // public static void main(String  args[]){

    //     Calculator calc = new Calculator();
    //     System.out.println(calc.sum(6, 7));
    //     System.out.println(calc.sum((float)2.5, (float)4.5));
    //     System.out.println(calc.sum(9, 10, 45));
    // }
    // class Calculator{

    //    int sum (int a, int b){
    //             return a + b;
    //     }

    //     float sum(float a, float b){
    //         return a + b;
    //     }

    //     int sum (int a, int b, int c){
    //         return a + b +  c;
    //     }
    // }

    //-------------------------------------------------------------------------------------------------------
                            // Method OverRiding


    // public static void main(String args[]){

    //     Deer de = new Deer();
    //     de.eat();
    // }

    //     class Animal{

    //         void eat(){
    //             System.out.println("Animals can Eat Anyything ");
    //         }
            
    //     }

    //     class Deer extends Animal{

    //         void eat(){
    //             System.out.println("Deer eats Grass ");
    //         }
    //     }

    //-----------------------------------------------------------------------------------------------------

                            //   Abstraction

    
    // public static void main(String args[]){



    //     Mustang myHorse = new Mustang();

    //      //Animal -> Horse -> Mustang


    //     // Horse h = new Horse();

    //     // h.walk();
    //     // h.eat();
    //     // System.out.println(h.color);
        

    //     // Chicken ch = new Chicken();

    //     // ch.walk();
    //     // ch.eat();
    // }
    //     abstract class Animal{

    //         Animal(){
    //                 System.out.println("Animal Constructor called ");
    //         }
    //         void eat(){
    //             System.out.println("Animal eats ");
    //         }

    //         abstract void walk();
    //     }

    //     class Horse extends Animal{

    //         Horse(){
    //             System.out.println("Horse Constructor called ");
    //         }
    //         void walk(){
    //             System.out.println("Horse walks on 4 legs ");
    //         }
    //     }
        
    //     class Mustang extends Horse{

    //         Mustang(){
    //             System.out.println("Mustang Constructor Called ");
    //         }
    //     }
    //     class Chicken extends Animal{

    //         void walk(){
    //             System.out.println("Chicken walks on 2 legs ");
    //         }
    //     }

    //---------------------------------------------------------------------------------------------------

                                 // INTERFACES
                                 /// Chess Player Moves



public interface arr {
        public static void main(String args[]){

            Rook r = new Rook(); 
            r.moves();

            }
        

    interface ChessPlayer{
        void moves();

    class Queen implements ChessPlayer{

        public void moves(){
            System.out.println("Up, down, Left, Right, Diagonal(in all 4 dirns )");
        }
    }

    class Rook implements ChessPlayer{
        public void moves(){
            System.out.println("Up, Down, Left , Right ");
        }
    }

    class King implements ChessPlayer{
        public void moves(){
            System.out.println("Up, Down, Left, Right, Diagonal( by 1 step )");
        }
    }
    }
    }
