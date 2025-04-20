public class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }


    void displayDetail(){
        System.out.println( " Animal name = " + name);
        System.out.println( " Animal age = " + age);
    }
}

class Dog extends Animal{

    Dog( String name, int age ){
        super(name,age);
    }

    void displayDetail(){
        System.out.println( " Dog name = " + name);
        System.out.println( " Age = " + age);
    }

}

class Cat extends Animal{

    Cat( String name, int age){
    super(name, age );
    }

    void displayDetail(){

        System.out.println( " Cat name = " + name);
        System.out.println( " Age = " + age);
    }


}

class main4{
    public static void main (String [] args ){
        Animal object = new Animal("LION", 7);
        object.displayDetail();

        Dog object2 = new Dog("Hund", 6);
        object2.displayDetail();

        Cat object3= new Cat (" Katze ", 3);
        object3.displayDetail();
    }


}