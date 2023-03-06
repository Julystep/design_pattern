package singleton_pattern;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello world");
    }

}
