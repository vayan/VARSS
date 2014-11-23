import java.awt.*;
import com.vayan.rss.GUI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI gui = new GUI();

                gui.setVisible(true);
            }
        });
    }
}
