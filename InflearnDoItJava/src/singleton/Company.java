package singleton;

// singleton 패턴
public class Company {

    private static final Company instance = new Company();

    private Company(){}

    public static Company getInstance(){
        return instance;
    }
}
