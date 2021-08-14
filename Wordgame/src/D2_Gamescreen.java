import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class D2_Gamescreen extends JFrame {

    private Data data;
    private ModalWindows modalWindows;

    private ArrayList<String> wordList6lettersClone;    //diese List wird während des Spiels bearbeitet, bereits dargestellte Wörter werden aus der Liste entfernt, damit kein Wort in einem Spiel mehrmals vorkommt
    private HashMap<String, String> tip1_L1;
    private HashMap<String, String> tip2_L1;

    private ArrayList<String> wordList9lettersClone;
    private HashMap<String, String> tip1_L2;
    private HashMap<String, String> tip2_L2;

    private ArrayList<String> wordList12lettersClone;
    private HashMap<String, String> tip1_L3;
    private HashMap<String, String> tip2_L3;

    private String currentWord; //aktuelles Wort, das der User am herausfinden ist
    private int tipCounter = 0;
    private int level;
    private int round;
    private int point;

    private JLabel levelsLabel;
    private JLabel roundsLabel;
    private JLabel pointsLabel;
    private JLabel tip1Label;
    private JLabel tip2Label;
    private JLabel footerBySarah;

    private JTextField wordField;

    private JButton tipButton;
    private JButton checkButton;
    private JButton clearButton;
    private JButton showAnswerButton;

    private ImageIcon backgroundKeyImage;

    private JButton key1 = new JButton("");
    private JButton key2 = new JButton("");
    private JButton key3 = new JButton("");
    private JButton key4 = new JButton("");
    private JButton key5 = new JButton("");
    private JButton key6 = new JButton("");
    private JButton key7 = new JButton("");
    private JButton key8 = new JButton("");
    private JButton key9 = new JButton("");
    private JButton key10 = new JButton("");
    private JButton key11 = new JButton("");
    private JButton key12 = new JButton("");


    private JPanel headerPanel = new JPanel(new GridLayout(1, 3));
    private JPanel keyPanel = new JPanel(new GridLayout(4, 3));
    private JPanel bodyPanel = new JPanel(new BorderLayout());
    private JPanel tipPanel = new JPanel(new GridLayout(3, 1)); //oder GridLayout?
    private JPanel buttonPanel = new JPanel(new GridLayout(1, 4));


    D2_Gamescreen(int levels, int round, int points) {
        //initialisation
        this.level = levels;
        this.round = round;
        this.point = points;


        modalWindows = new ModalWindows();

        data = new Data();
        //Level 1
        wordList6lettersClone = data.getWordList6Letters();
        tip1_L1 = data.getTip1_L1();
        tip2_L1 = data.getTip2_L1();

        //Level 2
        wordList9lettersClone = data.getWordList9Letters();
        tip1_L2 = data.getTip1_L2();
        tip2_L2 = data.getTip2_L2();

        //Level 3
        wordList12lettersClone = data.getWordList12Letters();
        tip1_L3 = data.getTip1_L3();
        tip2_L3 = data.getTip2_L3();


        levelsLabel = new JLabel("Level " + level + "/3");
        roundsLabel = new JLabel("Round " + round + "/9");
        pointsLabel = new JLabel("Points: " + point);
        tip1Label = new JLabel();
        tip2Label = new JLabel();
        footerBySarah = new JLabel("by Sarah Frischknecht");
        wordField = new JTextField();
        wordField.setEditable(false);
        tipButton = new JButton("Tipp");
        checkButton = new JButton("Lösung überprüfen");
        clearButton = new JButton("Antwort löschen");
        showAnswerButton = new JButton("Lösung anzeigen");


        //standard
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(Color.lightGray);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());

        getRootPane().setDefaultButton(checkButton);

        //organisation
        wordField.setPreferredSize((new Dimension(150, 150)));
        wordField.setFont(new Font("Arial", 1, 70));
        wordField.setHorizontalAlignment(JTextField.CENTER);

        tip1Label.setVisible(false);
        tip2Label.setVisible(false);


        key1.setFont(new Font("Dialog", Font.PLAIN, 65));
        key2.setFont(new Font("Dialog", Font.PLAIN, 65));
        key3.setFont(new Font("Dialog", Font.PLAIN, 65));
        key4.setFont(new Font("Dialog", Font.PLAIN, 65));
        key5.setFont(new Font("Dialog", Font.PLAIN, 65));
        key6.setFont(new Font("Dialog", Font.PLAIN, 65));
        key7.setFont(new Font("Dialog", Font.PLAIN, 65));
        key8.setFont(new Font("Dialog", Font.PLAIN, 65));
        key9.setFont(new Font("Dialog", Font.PLAIN, 65));
        key10.setFont(new Font("Dialog", Font.PLAIN, 65));
        key11.setFont(new Font("Dialog", Font.PLAIN, 65));
        key12.setFont(new Font("Dialog", Font.PLAIN, 65));
        key1.addActionListener(new letterListener());
        key2.addActionListener(new letterListener());
        key3.addActionListener(new letterListener());
        key4.addActionListener(new letterListener());
        key5.addActionListener(new letterListener());
        key6.addActionListener(new letterListener());
        key7.addActionListener(new letterListener());
        key8.addActionListener(new letterListener());
        key9.addActionListener(new letterListener());
        key10.addActionListener(new letterListener());
        key11.addActionListener(new letterListener());
        key12.addActionListener(new letterListener());

        //background keys
        backgroundKeyImage = new ImageIcon("Wordgame/background_key.jpg");

        key1.setIcon(backgroundKeyImage);
        key2.setIcon(backgroundKeyImage);
        key3.setIcon(backgroundKeyImage);
        key4.setIcon(backgroundKeyImage);
        key5.setIcon(backgroundKeyImage);
        key6.setIcon(backgroundKeyImage);
        key7.setIcon(backgroundKeyImage);
        key8.setIcon(backgroundKeyImage);
        key9.setIcon(backgroundKeyImage);
        key10.setIcon(backgroundKeyImage);
        key11.setIcon(backgroundKeyImage);
        key12.setIcon(backgroundKeyImage);

        key1.setHorizontalTextPosition(JButton.CENTER);
        key1.setVerticalTextPosition(JButton.CENTER);
        key2.setHorizontalTextPosition(JButton.CENTER);
        key2.setVerticalTextPosition(JButton.CENTER);
        key3.setHorizontalTextPosition(JButton.CENTER);
        key3.setVerticalTextPosition(JButton.CENTER);
        key4.setHorizontalTextPosition(JButton.CENTER);
        key4.setVerticalTextPosition(JButton.CENTER);
        key5.setHorizontalTextPosition(JButton.CENTER);
        key5.setVerticalTextPosition(JButton.CENTER);
        key6.setHorizontalTextPosition(JButton.CENTER);
        key6.setVerticalTextPosition(JButton.CENTER);
        key7.setHorizontalTextPosition(JButton.CENTER);
        key7.setVerticalTextPosition(JButton.CENTER);
        key8.setHorizontalTextPosition(JButton.CENTER);
        key8.setVerticalTextPosition(JButton.CENTER);
        key9.setHorizontalTextPosition(JButton.CENTER);
        key9.setVerticalTextPosition(JButton.CENTER);
        key10.setHorizontalTextPosition(JButton.CENTER);
        key10.setVerticalTextPosition(JButton.CENTER);
        key11.setHorizontalTextPosition(JButton.CENTER);
        key11.setVerticalTextPosition(JButton.CENTER);
        key12.setHorizontalTextPosition(JButton.CENTER);
        key12.setVerticalTextPosition(JButton.CENTER);

        //building
        headerPanel.add(levelsLabel);
        headerPanel.add(roundsLabel);
        headerPanel.add(pointsLabel);

        keyPanel.add(key1);
        keyPanel.add(key2);
        keyPanel.add(key3);
        keyPanel.add(key4);
        keyPanel.add(key5);
        keyPanel.add(key6);
        keyPanel.add(key7);
        keyPanel.add(key8);
        keyPanel.add(key9);
        keyPanel.add(key10);
        keyPanel.add(key11);
        keyPanel.add(key12);
        key7.setVisible(false);
        key8.setVisible(false);
        key9.setVisible(false);
        key10.setVisible(false);
        key11.setVisible(false);
        key12.setVisible(false);

        buttonPanel.add(checkButton);
        buttonPanel.add(tipButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(showAnswerButton);

        tipPanel.add(tip1Label);
        tipPanel.add(tip2Label);
        tipPanel.add(buttonPanel);

        bodyPanel.add(wordField, BorderLayout.NORTH);
        bodyPanel.add(keyPanel, BorderLayout.CENTER);
        bodyPanel.add(tipPanel, BorderLayout.SOUTH);


        getContentPane().add(headerPanel, BorderLayout.NORTH);
        getContentPane().add(bodyPanel, BorderLayout.CENTER);
        getContentPane().add(footerBySarah, BorderLayout.SOUTH);

        //Listener
        checkButton.addActionListener(new checkAnswerListener());
        tipButton.addActionListener(new tipListener());
        clearButton.addActionListener(new clearAnswerListener());
        showAnswerButton.addActionListener(new showAnswerListener());

        //start
        setLettersInField6(createRandomNrBetween0andMax(wordList6lettersClone.size()));
        setVisible(true);

    }

    public void setLettersInField6(int index) {
        setback();
        System.out.println(currentWord = wordList6lettersClone.get(index));
        System.out.println(index);
        currentWord = wordList6lettersClone.get(index);

        ArrayList<String> letterList6letters = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            letterList6letters.add(String.valueOf(wordList6lettersClone.get(index).charAt(i)));
        }

        Collections.shuffle(letterList6letters);

        key1.setText(letterList6letters.get(0));
        key2.setText(letterList6letters.get(1));
        key3.setText(letterList6letters.get(2));
        key4.setText(letterList6letters.get(3));
        key5.setText(letterList6letters.get(4));
        key6.setText(letterList6letters.get(5));


        wordList6lettersClone.remove(index);    //dieses Wort wird in dieser Runde nicht mehr vorkommen
    }

    public void setLettersInField9(int index) {
        setback();
        System.out.println(currentWord = wordList9lettersClone.get(index));
        System.out.println(index);
        currentWord = wordList9lettersClone.get(index);

        ArrayList<String> letterList9letters = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            letterList9letters.add(String.valueOf(wordList9lettersClone.get(index).charAt(i)));
        }

        Collections.shuffle(letterList9letters);

        key1.setText(letterList9letters.get(0));
        key2.setText(letterList9letters.get(1));
        key3.setText(letterList9letters.get(2));
        key4.setText(letterList9letters.get(3));
        key5.setText(letterList9letters.get(4));
        key6.setText(letterList9letters.get(5));
        key7.setText(letterList9letters.get(6));
        key8.setText(letterList9letters.get(7));
        key9.setText(letterList9letters.get(8));

        wordList9lettersClone.remove(index);    //dieses Wort wird in dieser Runde nicht mehr vorkommen
    }

    public void setLettersInField12(int index) {
        setback();
        System.out.println(currentWord = wordList12lettersClone.get(index));
        System.out.println(index);
        currentWord = wordList12lettersClone.get(index);

        ArrayList<String> letterList12letters = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            letterList12letters.add(String.valueOf(wordList12lettersClone.get(index).charAt(i)));
        }

        Collections.shuffle(letterList12letters);

        key1.setText(letterList12letters.get(0));
        key2.setText(letterList12letters.get(1));
        key3.setText(letterList12letters.get(2));
        key4.setText(letterList12letters.get(3));
        key5.setText(letterList12letters.get(4));
        key6.setText(letterList12letters.get(5));
        key7.setText(letterList12letters.get(6));
        key8.setText(letterList12letters.get(7));
        key9.setText(letterList12letters.get(8));
        key10.setText(letterList12letters.get(9));
        key11.setText(letterList12letters.get(10));
        key12.setText(letterList12letters.get(11));

        wordList12lettersClone.remove(index);    //dieses Wort wird in dieser Runde nicht mehr vorkommen
    }

    public int createRandomNrBetween0andMax(int max) {
        int random = (int) (Math.random() * (max));
        return random;
    }

    public void setback() {

        wordField.setText("");

        key1.setEnabled(true);
        key2.setEnabled(true);
        key3.setEnabled(true);
        key4.setEnabled(true);
        key5.setEnabled(true);
        key6.setEnabled(true);

        if (key7.isVisible() == true) {
            key7.setEnabled(true);
            key8.setEnabled(true);
            key9.setEnabled(true);
        }
        if (key12.isVisible() == true) {
            key10.setEnabled(true);
            key11.setEnabled(true);
            key12.setEnabled(true);
        }
    }

    /**
     * Aktualisiert das Pointlabel nach einer Änderung der Punktzahl
     *
     * @param updatedPoints neue, aktualisierte Punktzahl
     */
    public void updatePointsAndRound(int updatedPoints, int updatedRound) {
        pointsLabel.setText("Points: " + updatedPoints);
        if (level == 1) {
            roundsLabel.setText("Round " + updatedRound + "/9");
        } else if (level == 2) {
            roundsLabel.setText("Round " + updatedRound + "/12");
        } else {
            roundsLabel.setText("Round " + updatedRound + "/6");
        }
    }

    /**
     * wird gebraucht wenn die Lösung eines Wortes korrekt ist und das nächste Wort dargestellt werden soll
     * Die Methode überprüft welche Methode als nächstes gebraucht wird (Anzahl Buchstaben)
     * und aktualisiert den Runden- und Levelwert und entfernt die sichtbaren Tips
     * Die Punkte werden nicht hier behandelt sondern vor Aufruf dieser Methode via updatePoints
     */
    public void installNextWord() {
        tip1Label.setText("");
        tip2Label.setText("");

        if (level == 1 && round <= 9) {
            setLettersInField6(createRandomNrBetween0andMax(wordList6lettersClone.size()));
        } else if (level == 1 && round > 9) {
            modalWindows.correctAnswerNextLevelModal();
            setLettersInField9(createRandomNrBetween0andMax(wordList9lettersClone.size())); //Wechsel von Level 1 in Level 2
            key7.setVisible(true);
            key8.setVisible(true);
            key9.setVisible(true);
            level++;
            levelsLabel.setText("Level " + level + "/3");
            round = 1;
            updatePointsAndRound(point, round);
        } else if (level == 2 && round <= 12) {
            setLettersInField9(createRandomNrBetween0andMax(wordList9lettersClone.size()));
        } else if (level == 2 && round > 12) {
            setLettersInField12(createRandomNrBetween0andMax(wordList12lettersClone.size())); //Wechsel von Level 2 in Level 3
            key10.setVisible(true);
            key11.setVisible(true);
            key12.setVisible(true);
            level++;
            levelsLabel.setText("Level " + level + "/3");
            round = 1;
            updatePointsAndRound(point, round);
        } else if (level == 3 && round <= 6) {
            setLettersInField12(createRandomNrBetween0andMax(wordList12lettersClone.size()));
        } else if (level == 3 && round > 6) {
            modalWindows.gameFinishedModal(getJFrame());
            //Spielende -> congrats you're a master
        }
    }

    public JFrame getJFrame() {
        return this;
    }

    //Actionlistener

    class letterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String text = e.getActionCommand();
            wordField.setText(wordField.getText() + text);

            //jeder Buchstabe kommt nur einmal vor
            JButton sender = (JButton) e.getSource();
            sender.setEnabled(false);
        }
    }

    class tipListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (tipCounter == 0) {
                if (level == 1) {
                    tip1Label.setText(tip1_L1.get(currentWord));
                } else if (level == 2) {
                    tip1Label.setText(tip1_L2.get(currentWord));
                } else {
                    tip1Label.setText(tip1_L3.get(currentWord));
                }
                tip1Label.setVisible(true);
                tipCounter++;
                point -= 3;
                updatePointsAndRound(point, round);
            } else if (tipCounter == 1) {
                if (level == 1) {
                    tip2Label.setText(tip2_L1.get(currentWord));
                } else if (level == 2) {
                    tip2Label.setText(tip2_L2.get(currentWord));
                } else {
                    tip2Label.setText(tip2_L3.get(currentWord));
                }
                tip2Label.setVisible(true);
                tipCounter++;
                point -= 3;
                updatePointsAndRound(point, round);
                tipButton.setEnabled(false);
            }
        }
    }

    class checkAnswerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (wordField.getText().equalsIgnoreCase(currentWord)) {//Antwort stimmt
                tipCounter = 0;
                tipButton.setEnabled(true);

                modalWindows.gameFinishedModal(getJFrame());
                //modalWindows.correctAnswerModal();
                //modales Fenster -  Ihre Antwort ist korrekt!

                //Punkteverteilung
                if (level == 1) {
                    point += 5;
                } else if (level == 2) {
                    point += 8;
                } else {
                    point += 15;
                }
                round++;
                updatePointsAndRound(point, round);

                //neues Wort anzeigen
                installNextWord();

            } else { //Antwort stimmt nicht
                modalWindows.wrongAnswerModal();
                setback();
            }
        }
    }

    class clearAnswerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setback();
        }
    }

    class showAnswerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tipCounter = 0;
            tipButton.setEnabled(true);

            modalWindows.showAnswerModal(currentWord);
            // -> in TextField einfüllen geht nicht, weil es zu schnell wieder weg ginge

            //Punkteabzug
            if (level == 1) {
                point -= 10;
            } else {
                point -= 5;
            }
            round++;
            updatePointsAndRound(point, round);
            installNextWord();
        }
    }
}