import zero.App;
import zero.ui.Label;

public class Main extends App {
    @Override public void settings() { padding(20); }

    @Override public void setup() {
        Label greeting = new Label("Hello, world!");
        show(greeting);
    }

    public static void main(String[] args) { launch(args); }
}
