package bridge_pattern;

public class XiaomiPhone extends Phone{

    @Override
    public void playMusic() {
        shellImplementor.wearShell();
        System.out.println("this is Xiaomi");
    }

}
