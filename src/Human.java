abstract class Human {
    Human(){
        System.out.println("Constructor is Running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing!");
    }
}
class Man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any Knid of Walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dub!!!!!");
    }
}
class Gawesh extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Gawesh Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Foods!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Gawesh();
        Man m = new Gawesh();
        h.walk();
        h.eat();
        h.breathing();
        h1.walk();
        h1.eat();
        h1.breathing();
        m.eat();
        m.walk();
        m.breathing();
    }
}