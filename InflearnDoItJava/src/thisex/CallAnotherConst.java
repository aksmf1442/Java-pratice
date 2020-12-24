package thisex;

class Person{

    String name;
    int age;

    // 다른 생성자 호출 this, this가 가장 먼저 나와야하고
    public Person(){
        this("이름없음", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    // 자기 주소 반환
    public Person returnSelf(){
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
    }
}
