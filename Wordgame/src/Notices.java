import java.time.temporal.ChronoUnit;


public class Notices {

    Notices() {

        /*Nutzung von LocalTime
         *
         * Mit Anwendung dieser Methodik, kann eine Aktion für eine bestimmte Zeit ausgeführt werden
         */
        java.time.LocalTime start = java.time.LocalTime.now();
        int counter3 = 0;

        while (start.until(java.time.LocalTime.now(), ChronoUnit.SECONDS) < 3) {
            System.out.println("hallo");
            counter3++;
        }
        System.out.println("3s are over\n" + counter3);

        /*Veränderung Schriftgrösse
         *

        JLabel welcome = new JLabel("Welcome to the one and only wordsgame");
        welcome.setFont(welcome.getFont().deriveFont(18f)); //Veränderung der Schriftgrösse

         */


    }

    public static void main(String[] args) {
        Notices notice = new Notices();
    }

}
