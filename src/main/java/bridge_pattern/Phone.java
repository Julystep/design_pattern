package bridge_pattern;

public abstract class Phone {

    protected ShellImplementor shellImplementor;

    public void setShellImplementor(ShellImplementor shellImplementor) {
        this.shellImplementor = shellImplementor;
    }

    public void call() {
        System.out.println("call");
    }

    public abstract void playMusic();

}
