package bridge_pattern;

public class VivoPhone extends Phone{

    @Override
    public void playMusic() {
        shellImplementor.wearShell();
        System.out.println("this is vivo");
    }

}
