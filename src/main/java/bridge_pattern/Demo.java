package bridge_pattern;

public class Demo {

    public static void main(String[] args) {
        Phone phone = new VivoPhone();
        ShellImplementor shellImplementor = new CuteShellImplementor();
        phone.setShellImplementor(shellImplementor);
        phone.playMusic();
    }

}
