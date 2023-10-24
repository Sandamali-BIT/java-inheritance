public class Dog {
    int legs = 4;
    int tail = 1;
    void eat(){
        System.out.println("eating");
    }
}
class babyDog extends Dog{
    int eyes = 2;
    void drink(){
        System.out.println("Drinking");
    }
    void bark(){
        System.out.println("Barking");
    }
}
class inhTest{
    public static void main(String[] args) {
        babyDog bd = new babyDog();
        bd.bark();
        bd.eat();
        bd.drink();
        System.out.println("Dog has " + bd.eyes + "eyes.");
        System.out.println("Dog has " + bd.legs + "legs.");
        System.out.println("Dog has " + bd.tail + "tail.");
    }
}
