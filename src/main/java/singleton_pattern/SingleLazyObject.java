package singleton_pattern;

public class SingleLazyObject {

    private static volatile SingleLazyObject instance;

    private SingleLazyObject() {}

    public static SingleLazyObject getInstance() {
        if (instance == null) {
            synchronized (SingleLazyObject.class) {
                if (instance == null) {
                    instance = new SingleLazyObject();
                }
            }
        }
        return instance;
    }

}
