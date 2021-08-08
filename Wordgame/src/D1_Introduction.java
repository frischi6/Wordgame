import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D1_Introduction extends JFrame{

    private JLabel footerBySarah = new JLabel("by Sarah Frischknecht");

    private JLabel welcome = new JLabel("Willkommen zum one and only Wörterspiel");
    private JLabel regeln = new JLabel("Die Regeln:");

    private JLabel rule1 = new JLabel("- Jeder angezeigte Buchstaben wird fürs Lösungswort gebraucht");
    private JLabel rule2 = new JLabel("- Jeder Buchstabe kann nur einmal gebraucht werden");
    private JLabel rule3 = new JLabel("- Pro Wort können zwei Tipps eingeholt werden, dies hat jedoch jeweils einen " +
            "Verlust um 3 Punkte zur Folge");
    private JLabel rule4 = new JLabel("- Nach zwei Tipps kann die Lösung angezeigt werden, dies bedeutet ebenfalls " +
            "einen Punkteverlust");
    private JLabel rule5 = new JLabel("- ä -> ae");
    private JLabel rule6 = new JLabel("- ö -> oe");
    private JLabel rule7 = new JLabel("- ü -> ue");

    private JButton losGehts = new JButton("Verstanden, los gehts!");

    private JPanel bodyPanel = new JPanel();

    D1_Introduction(){

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(Color.red);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(10,10));
        getRootPane().setDefaultButton(losGehts);

        welcome.setFont(welcome.getFont().deriveFont(28f)); //Veränderung der Schriftgrösse
        regeln.setFont(regeln.getFont().deriveFont(20f));

        bodyPanel.setLayout(new GridLayout(9, 1));
        bodyPanel.add(regeln);
        bodyPanel.add(rule1);
        bodyPanel.add(rule2);
        bodyPanel.add(rule3);
        bodyPanel.add(rule4);
        bodyPanel.add(rule5);
        bodyPanel.add(rule6);
        bodyPanel.add(rule7);
        bodyPanel.add(losGehts);
        bodyPanel.setBackground(Color.decode("#c44949"));

        getContentPane().add(welcome, BorderLayout.NORTH);
        getContentPane().add(bodyPanel, BorderLayout.CENTER);
        getContentPane().add(footerBySarah, BorderLayout.SOUTH);

        losGehts.addActionListener(new changeWindowListener());


        setVisible(true);

    }

    public void closeDisplay1(){
        setVisible(false);
    }

    class changeWindowListener implements ActionListener{
        WordgameGUI guiMain = new WordgameGUI();

        @Override
        public void actionPerformed(ActionEvent e) {
            guiMain.d2Gamescreen(1, 1, 0);
            closeDisplay1();
        }
    }


}
