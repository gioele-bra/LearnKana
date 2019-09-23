package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    public static List<String> hiragana  = new ArrayList<String>();
    public static List<String> katakana  = new ArrayList<String>();
    public static List<String> romaji = new ArrayList<String>();

    private Parent root;
    public Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        scene = new Scene(root, 750, 500);
        primaryStage.setTitle("Learn Kana");
       initialize();
        primaryStage.setScene(scene);
        primaryStage.show();
        fillHiragana();
        fillRomaji();

    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void fillHiragana(){
        hiragana.add("あ");
        hiragana.add("い");
        hiragana.add("う");
        hiragana.add("え");
        hiragana.add("お");
        hiragana.add("か");
        hiragana.add("き");
        hiragana.add("く");
        hiragana.add("け");
        hiragana.add("こ");
        hiragana.add("さ");
        hiragana.add("し");
        hiragana.add("す");
        hiragana.add("せ");
        hiragana.add("そ");
        hiragana.add("た");
        hiragana.add("ち");
        hiragana.add("つ");
        hiragana.add("て");
        hiragana.add("と");
        hiragana.add("な");
        hiragana.add("に");
        hiragana.add("ぬ");
        hiragana.add("ね");
        hiragana.add("の");
        hiragana.add("は");
        hiragana.add("ひ");
        hiragana.add("ふ");
        hiragana.add("へ");
        hiragana.add("ほ");
        hiragana.add("ま");
        hiragana.add("み");
        hiragana.add("む");
        hiragana.add("め");
        hiragana.add("も");
        hiragana.add("や");
        hiragana.add("ゆ");
        hiragana.add("よ");
        hiragana.add("ら");
        hiragana.add("り");
        hiragana.add("る");
        hiragana.add("れ");
        hiragana.add("ろ");
        hiragana.add("わ");
        hiragana.add("ゐ");
        hiragana.add("ゑ");
        hiragana.add("を");
        hiragana.add("ん");
        hiragana.add("が");
        hiragana.add("ぎ");
        hiragana.add("ぐ");
        hiragana.add("げ");
        hiragana.add("ご");
        hiragana.add("ざ");
        hiragana.add("じ");
        hiragana.add("ず");
        hiragana.add("ぜ");
        hiragana.add("ぞ");
        hiragana.add("だ");
        hiragana.add("ぢ");
        hiragana.add("づ");
        hiragana.add("で");
        hiragana.add("ど");
        hiragana.add("ば");
        hiragana.add("び");
        hiragana.add("ぶ");
        hiragana.add("べ");
        hiragana.add("ぼ");
        hiragana.add("ぱ");
        hiragana.add("ぴ");
        hiragana.add("ぷ");
        hiragana.add("ぺ");
        hiragana.add("ぽ");
        hiragana.add("きゃ");
        hiragana.add("きゅ");
        hiragana.add("きょ");
        hiragana.add("しゃ");
        hiragana.add("しゅ");
        hiragana.add("しょ");
        hiragana.add("ちゃ");
        hiragana.add("ちゅ");
        hiragana.add("ちょ");
        hiragana.add("にゃ");
        hiragana.add("にゅ");
        hiragana.add("にょ");
        hiragana.add("ひゃ");
        hiragana.add("ひゅ");
        hiragana.add("ひょ");
        hiragana.add("みゃ");
        hiragana.add("みゅ");
        hiragana.add("みょ");
        hiragana.add("りゃ");
        hiragana.add("りゅ");
        hiragana.add("りょ");
        hiragana.add("ぎゃ");
        hiragana.add("ぎゅ");
        hiragana.add("ぎょ");
        hiragana.add("じゃ");
        hiragana.add("じゅ");
        hiragana.add("じょ");
        hiragana.add("びゃ");
        hiragana.add("びゅ");
        hiragana.add("びょ");
        hiragana.add("ぴゃ");
        hiragana.add("ぴゅ");
        hiragana.add("ぴょ");

    }

    public void fillRomaji(){
        romaji.add("a");
        romaji.add("i");
        romaji.add("u");
        romaji.add("e");
        romaji.add("o");
        romaji.add("ka");
        romaji.add("ki");
        romaji.add("ku");
        romaji.add("ke");
        romaji.add("ko");
        romaji.add("sa");
        romaji.add("shi");
        romaji.add("su");
        romaji.add("se");
        romaji.add("so");
        romaji.add("ta");
        romaji.add("chi");
        romaji.add("tsu");
        romaji.add("te");
        romaji.add("to");
        romaji.add("na");
        romaji.add("ni");
        romaji.add("nu");
        romaji.add("ne");
        romaji.add("no");
        romaji.add("ha");
        romaji.add("hi");
        romaji.add("fu");
        romaji.add("he");
        romaji.add("ho");
        romaji.add("ma");
        romaji.add("mi");
        romaji.add("mu");
        romaji.add("me");
        romaji.add("mo");
        romaji.add("ya");
        romaji.add("yu");
        romaji.add("yo");
        romaji.add("ra");
        romaji.add("ri");
        romaji.add("ru");
        romaji.add("re");
        romaji.add("ro");
        romaji.add("wa");
        romaji.add("wi");
        romaji.add("we");
        romaji.add("wo");
        romaji.add("n");
        romaji.add("ga");
        romaji.add("gi");
        romaji.add("gu");
        romaji.add("ge");
        romaji.add("go");
        romaji.add("za");
        romaji.add("ji");
        romaji.add("zu");
        romaji.add("ze");
        romaji.add("zo");
        romaji.add("da");
        romaji.add("dji");
        romaji.add("dzu");
        romaji.add("de");
        romaji.add("do");
        romaji.add("ba");
        romaji.add("bi");
        romaji.add("bu");
        romaji.add("be");
        romaji.add("bo");
        romaji.add("pa");
        romaji.add("pi");
        romaji.add("pu");
        romaji.add("pe");
        romaji.add("po");
        romaji.add("kya");
        romaji.add("kyu");
        romaji.add("kyo");
        romaji.add("sha");
        romaji.add("shu");
        romaji.add("sho");
        romaji.add("cha");
        romaji.add("chu");
        romaji.add("cho");
        romaji.add("nya");
        romaji.add("nyu");
        romaji.add("nyo");
        romaji.add("hya");
        romaji.add("hyu");
        romaji.add("hyo");
        romaji.add("mya");
        romaji.add("myu");
        romaji.add("myo");
        romaji.add("rya");
        romaji.add("ryu");
        romaji.add("ryo");
        romaji.add("gya");
        romaji.add("gyu");
        romaji.add("gyo");
        romaji.add("ja");
        romaji.add("ju");
        romaji.add("jo");
        romaji.add("bya");
        romaji.add("byu");
        romaji.add("byo");
        romaji.add("pya");
        romaji.add("pyu");
        romaji.add("pyo");
    }

    final ComboBox kanaChoice = new ComboBox();

    private void initialize(){
        kanaChoice.getItems().addAll("Hiragana", "Katakana");
    }

}
