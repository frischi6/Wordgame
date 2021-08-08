import java.util.ArrayList;
import java.util.HashMap;

public class Data {

    private ArrayList<String> wordList6letters;
    private HashMap<String, String> tip1_L1;
    private HashMap<String, String> tip2_L1;

    private ArrayList<String> wordList9letters;
    private HashMap<String, String> tip1_L2;
    private HashMap<String, String> tip2_L2;

    private ArrayList<String> wordList12letters;
    private HashMap<String, String> tip1_L3;
    private HashMap<String, String> tip2_L3;

    public Data() {
        //Level 1
        wordList6letters = new ArrayList<>();
        wordList6letters.add("EIGELB");
        wordList6letters.add("BAGGER");
        wordList6letters.add("RADWEG");
        wordList6letters.add("PALMEN");
        wordList6letters.add("VULKAN");
        wordList6letters.add("SALAMI");
        wordList6letters.add("MONTAG");
        wordList6letters.add("DATTEL");
        wordList6letters.add("INGWER");
        wordList6letters.add("INDIEN");
        wordList6letters.add("BERLIN");


        tip1_L1 = new HashMap<>();
        tip1_L1.put("EIGELB", "Es ist essbar");
        tip1_L1.put("BAGGER", "Es ist eine Maschine");
        tip1_L1.put("RADWEG", "Es ist eine spezielle Art von Strasse");
        tip1_L1.put("PALMEN", "Es ist eine Pflanze");
        tip1_L1.put("VULKAN", "Der Ätna ist einer von ihnen");
        tip1_L1.put("SALAMI", "Es ist essbar");
        tip1_L1.put("MONTAG", "Es ist ein Wochentag");
        tip1_L1.put("DATTEL", "Es ist essbar");
        tip1_L1.put("INGWER", "Es wird oft als Shot getrunken");
        tip1_L1.put("INDIEN", "Es ist ein Land");
        tip1_L1.put("BERLIN", "Es ist eine Ortschaft");

        tip2_L1 = new HashMap<>();
        tip2_L1.put("EIGELB", "Es kommt vom Huhn");
        tip2_L1.put("BAGGER", "Sie braucht einen Chauffeur");
        tip2_L1.put("RADWEG", "Sie wird gebraucht von Velofahrern");
        tip2_L1.put("PALMEN", "Sie wird typischerweise auf einer einsamen Insel im Ozean, oder am Strand gezeichnet");
        tip2_L1.put("VULKAN", "Stichwort Krater, Magma, Lava");
        tip2_L1.put("SALAMI", "Es ist ein Fleischprodukt");
        tip2_L1.put("MONTAG", "Er beginnt mit M");
        tip2_L1.put("DATTEL", "Es ist eine Frucht, die einen Stein in ihrem Innern hat");
        tip2_L1.put("INGWER", "Es ist eine Pflanzenart");
        tip2_L1.put("INDIEN", "Es liegt in Asien");
        tip2_L1.put("BERLIN", "Es ist die Hauptstadt von Deutschland");

        //Level 2
        wordList9letters = new ArrayList<>();
        wordList9letters.add("ABENDMAHL");
        wordList9letters.add("ACKERLAND");
        wordList9letters.add("BACKWAREN");
        wordList9letters.add("BADEWANNE");
        wordList9letters.add("BADMINTON");
        wordList9letters.add("CHARAKTER");
        wordList9letters.add("DACHBODEN");
        wordList9letters.add("DSCHUNGEL");
        wordList9letters.add("EHEGATTIN");
        wordList9letters.add("EISENBAHN");
        wordList9letters.add("EISZAPFEN");
        wordList9letters.add("FEDERKOHL");
        wordList9letters.add("TIERSCHAU");
        wordList9letters.add("SCHACHTEL");


        tip1_L2 = new HashMap<>();
        tip1_L2.put("ABENDMAHL", "Es ist eine Mahlzeit");
        tip1_L2.put("ACKERLAND", "Es ist Teil der Landwirtschaft");
        tip1_L2.put("BACKWAREN", "Es ist der Oberbegriff einer bestimmten Lebensmittelgruppe");
        tip1_L2.put("BADEWANNE", "Es ist oft in einem Haus/Wohnung eingebaut");
        tip1_L2.put("BADMINTON", "Es ist eine Sportart");
        tip1_L2.put("CHARAKTER", "Es bildet das moralische Verhalten eines Menschen");
        tip1_L2.put("DACHBODEN", "Es wird oft als Abstellplatz benutzt");
        tip1_L2.put("DSCHUNGEL", "Es ist ein dichter, undurchdringbarer Wald");
        tip1_L2.put("EHEGATTIN", "Es ist eine Person");
        tip1_L2.put("EISENBAHN", "Es ist ein Verkehrsmittel");
        tip1_L2.put("EISZAPFEN", "Es besteht aus Wasser");
        tip1_L2.put("FEDERKOHL", "Es ist ein Gemüse");
        tip1_L2.put("TIERSCHAU", "Es wird oft von einem Zirkus veranstaltet");
        tip1_L2.put("SCHACHTEL", "Es ist ein dreidimensionales Objekt");

        tip2_L2 = new HashMap<>();
        tip2_L2.put("ABENDMAHL", "Es war das letzte feierliche Essen, das Jesus vor seinem Tod mit seinen 12 Aposteln gegessen hat");
        tip2_L2.put("ACKERLAND", "Es ist eine bestimmte Fläche");
        tip2_L2.put("BACKWAREN", "Diese werden meisten von Bäckereien/Konditoreien hergestellt");
        tip2_L2.put("BADEWANNE", "Es wird für die Körperhygiene benutzt");
        tip2_L2.put("BADMINTON", "Das dazugehörige Spielobjekt wird Shuttle genannt");
        tip2_L2.put("CHARAKTER", "Eigenschaften davon können z.B. spontan, herzlich oder ernst sein");
        tip2_L2.put("DACHBODEN", "Es befindet sich im Haus ganz zuoberst");
        tip2_L2.put("DSCHUNGEL", "Er befindet sich in den Tropen");
        tip2_L2.put("EHEGATTIN", "Es ist eine Person, die verheiratet ist");
        tip2_L2.put("EISENBAHN", "Es fährt auf Schienen");
        tip2_L2.put("EISZAPFEN", "Es hat den Aggregatzustand fest");
        tip2_L2.put("FEDERKOHL", "Es ist auch als Grünkohl, Krauskohl oder Kale bekannt");
        tip2_L2.put("TIERSCHAU", "Es ist eine Ausstellung von Tieren");
        tip2_L2.put("SCHACHTEL", "Es kann durch einen Deckel geschlossen werden");


        //Level 3
        wordList12letters = new ArrayList<>();
        wordList12letters.add("ABBLENDLICHT");
        wordList12letters.add("BEIFALLSRUFE");
        wordList12letters.add("BEISPIELSATZ");
        wordList12letters.add("BERUFSUNFALL");
        wordList12letters.add("DACHTERRASSE");
        wordList12letters.add("DAUMENMUSKEL");
        wordList12letters.add("FAHRRADKETTE");
        wordList12letters.add("PANORAMABILD");


        tip1_L3 = new HashMap<>();
        tip1_L3.put("ABBLENDLICHT", "Es wird bei Dämmerung und Dunkelheit benutzt");
        tip1_L3.put("BEIFALLSRUFE", "Es ist ein Zeichen der Wertschätzung");
        tip1_L3.put("BEISPIELSATZ", "Es wird gebraucht, um eine Sache verständlicher darzustellen");
        tip1_L3.put("BERUFSUNFALL", "Es ist ein Ereignis, das während der Arbeit passiert");
        tip1_L3.put("DACHTERRASSE", "Es ist eine bestimmte Fläche und gehört zu einem Haus/Wohnung");
        tip1_L3.put("DAUMENMUSKEL", "Es ist ein bestimmtes Organ eines menschlichen Körper");
        tip1_L3.put("FAHRRADKETTE", "Es wird benötigt für den Antrieb eines bestimmten Fahrzeuges");
        tip1_L3.put("PANORAMABILD", "Es ist eine grafische Darstellung");

        tip2_L3 = new HashMap<>();
        tip2_L3.put("ABBLENDLICHT", "Es ist ein bestimmtes Licht");
        tip2_L3.put("BEIFALLSRUFE", "Es erfolgt oft während eines Applauses");
        tip2_L3.put("BEISPIELSATZ", "Es kann entweder mündlich oder schriftlich widergegeben werden");
        tip2_L3.put("BERUFSUNFALL", "In der Schweiz ist jeder Arbeitnehmer dagegen versichert");
        tip2_L3.put("DACHTERRASSE", "Sie befindet sich zuoberst auf einem Gebäude");
        tip2_L3.put("DAUMENMUSKEL", "Es befindet sich an der Hand");
        tip2_L3.put("FAHRRADKETTE", "Das Fahrzeug wird durch Muskelkraft angetrieben");
        tip2_L3.put("PANORAMABILD", "Meistens ist diese breiter als andere Fotos");


    }

    public ArrayList<String> getWordList6Letters() {
        return wordList6letters;
    }

    public ArrayList<String> getWordList9Letters() {
        return wordList9letters;
    }

    public ArrayList<String> getWordList12Letters() {
        return wordList12letters;
    }


    public HashMap<String, String> getTip1_L1() {
        return tip1_L1;
    }

    public HashMap<String, String> getTip2_L1() {
        return tip2_L1;
    }

    public HashMap<String, String> getTip1_L2() {
        return tip1_L2;
    }

    public HashMap<String, String> getTip2_L2() {
        return tip2_L2;
    }

    public HashMap<String, String> getTip1_L3() {
        return tip1_L3;
    }

    public HashMap<String, String> getTip2_L3() {
        return tip2_L3;
    }


}
