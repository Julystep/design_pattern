package bridge_pattern;

public class OppoPhone extends Phone{

    @Override
    public void playMusic() {
        shellImplementor.wearShell();
        System.out.println("this is oppo");
    }

}
