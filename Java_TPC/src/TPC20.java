import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        // Animal 부모클래스를 사용하지 않음.
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // Dog.class, Cat.class
        Animal ani = new Dog(); // upcasting(자동형변환)
        ani.eat();

        ani = new Cat();
        ani.eat();
        // ani.night();
        ((Cat)ani).night(); // downcasting(강제형변환)

    }
}
