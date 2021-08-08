import javax.swing.*;
import java.awt.*;

public class WordgameGUI extends JFrame {



    WordgameGUI() {

        /*
         *Display 1
         */
    }

    public static void main(String[] args) {
        WordgameGUI gui = new WordgameGUI();
        gui.setTitle("Wörterspiel");
        gui.d1Introduction();
    }

    public void d1Introduction(){
        D1_Introduction d1_introduction = new D1_Introduction();
    }

    public void d2Gamescreen(int level, int round, int points){
        D2_Gamescreen d2_gamescreen = new D2_Gamescreen(level, round, points);
    }

}
