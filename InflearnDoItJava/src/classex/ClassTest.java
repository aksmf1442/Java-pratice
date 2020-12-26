package classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person person = new Person();

//        Class pClass1 = person.getClass();
//        System.out.println(pClass1.getName());
//
//        Class pClass2 = Person.class;
//        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("java.lang.String");
        System.out.println(pClass3.getName());

        Person p = new Person();

        Class pClass = Class.forName("classex.Person");

        Person p2 = (Person)pClass.newInstance();
        System.out.println(p);
        System.out.println(p2);
    }
}
