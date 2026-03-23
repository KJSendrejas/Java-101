public class OOP_Inheritance{
    public static void main(String[]args){

        Animal_Dog dog = new Animal_Dog();
        Animal_Cat cat = new Animal_Cat();
        dog.walk();
        dog.bark();
        dog.sleep();
        dog.drinking();
        dog.fetch();

        cat.walk();
        cat.sleep();
        cat.drinking();
        cat.hissing();
        cat.meow();
        cat.purring();
        
        print();

    }

    static void print(){
        System.out.println("Thank you");
    }

}