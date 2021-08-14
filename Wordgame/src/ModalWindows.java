import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalWindows {

    private JDialog currentJDialog;
    private JFrame mainFrame;

    private JButton gotIt;
    private JLabel content;
    private JLabel background;

    private JPanel buttonPanel;

    public ModalWindows() {
        currentJDialog = new JDialog();
        currentJDialog.setModal(true);
        currentJDialog.setSize(550, 400);
        currentJDialog.setLocationRelativeTo(null);

        ImageIcon iconA = new ImageIcon("Wordgame/background_key.jpg");

        gotIt = new JButton("Weiter");
        gotIt.addActionListener(new gotItButtonListener());

        content = new JLabel("", JLabel.CENTER);
        content.setFont(new Font("Goudy Old Style", 1, 30));

        buttonPanel = new JPanel(new GridLayout());
        buttonPanel.add(gotIt);

        background = new JLabel(new ImageIcon("Wordgame/background_modal.jpg"));//Hintergrundbild
        background.setLayout(new BorderLayout());
        background.add(content, BorderLayout.CENTER);
        background.add(buttonPanel, BorderLayout.SOUTH);

        currentJDialog.add(background);
    }

    public void correctAnswerModal() {

        this.content.setText("Super, diese Antwort ist korrekt!");
        currentJDialog.getRootPane().setDefaultButton(gotIt);
        currentJDialog.setVisible(true);
    }

    public void wrongAnswerModal() {
        currentJDialog.getRootPane().setDefaultButton(gotIt);
        this.content.setText("<html><center>Diese Antwort ist nicht korrekt,<br>versuche es noch ein Mal!</center></html>");
        currentJDialog.setVisible(true);
    }

    public void correctAnswerNextLevelModal() {
        currentJDialog.getRootPane().setDefaultButton(gotIt);
        this.content.setText("<html><center>Super, diese Antwort ist korrekt!<br><br>" +
                "Du bist jetzt ins nächste Level aufgestiegen!</center></html>");
        currentJDialog.setVisible(true);
    }

    public void showAnswerModal(String answer) {
        currentJDialog.getRootPane().setDefaultButton(gotIt);
        this.content.setText("<html><center>Das gesuchte Wort lautet " + answer + ".<br><br>" +
                "Das nächste Wort schaffst du!</center></html>");
        currentJDialog.setVisible(true);
    }


    // zwei eigene Buttons inkl. Listener erstellen
    public void gameFinishedModal(JFrame jFrame) {
        mainFrame = jFrame;
        gotIt = null;

        JButton newGame = new JButton("Erneut spielen");
        newGame.addActionListener(new playAgainButtonListener());
        JButton finishGame = new JButton("Spiel beenden");
        finishGame.addActionListener(new finishGameListener());

        this.buttonPanel.add(newGame);
        this.buttonPanel.add(finishGame);
        this.content.setText("<html>Gratulation, du hast es geschafft!!<br><br>Das Spiel ist beendet, auf Wiedersehen!</html>");
        currentJDialog.setVisible(true);
    }

    public static void main(String[] args) {
        ModalWindows w = new ModalWindows();
    }


    class gotItButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentJDialog.dispose();
        }
    }

    class playAgainButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            currentJDialog.dispose();
            mainFrame.dispose();
            WordgameGUI gui = new WordgameGUI();
            gui.d2Gamescreen(1,1,0);
        }
    }

    class finishGameListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }


}
