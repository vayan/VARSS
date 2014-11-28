import java.awt.*;
import com.vayan.rss.Gui;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcom to vayan's RSS Reader!");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               Gui gui = new Gui();
            }
        });
    }
}
