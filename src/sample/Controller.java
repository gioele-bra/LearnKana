package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;

public class Controller {

    private int extr = 1;
    private int total = 0;
    private int right = 0;

    @FXML
    private Button startBtn;
    @FXML
    private Button stopBtn;
    @FXML
    private ComboBox kanaChoice;
    @FXML
    private ComboBox numChoice;
    @FXML
    private Label kanaLbl;
    @FXML
    private Label totalLbl;
    @FXML
    private Label rightLbl;
    @FXML
    private Label wrongLbl;
    @FXML
    private TextField answerField;

    @FXML
    public void start(){
        if(!kanaChoice.getSelectionModel().isEmpty()){
            if(!numChoice.getSelectionModel().isEmpty()){
                kanaLbl.setText(Main.hiragana.get((int)(Math.random()*Integer.parseInt(numChoice.getSelectionModel().getSelectedItem().toString()))));
                answerField.setDisable(false);
                kanaChoice.setDisable(true);
                numChoice.setDisable(true);
                startBtn.setDisable(true);
                stopBtn.setDisable(false);
            }else{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Attention!");
                alert.setContentText("Check the second box!\nYou left it empty!");
                alert.showAndWait();
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Attention!");
            alert.setContentText("Check the first box!\nYou left it empty!");
            alert.showAndWait();
        }
    }

    @FXML
    public void stop(){
        total = 0;
        right = 0;
        extr = 1;
        answerField.setText("");
        kanaLbl.setText("______");
        answerField.setDisable(true);
        kanaChoice.setDisable(false);
        numChoice.setDisable(false);
        stopBtn.setDisable(true);
        startBtn.setDisable(false);
        update();
    }

    @FXML
    public void extract(){
        answerField.setOnKeyReleased(event -> {
            if(event.getCode() == KeyCode.ENTER){
                if(extr == 0){
                    kanaLbl.setText(Main.hiragana.get((int)(Math.random()*Integer.parseInt(numChoice.getSelectionModel().getSelectedItem().toString()))));
                }else if(extr == 1){
                    if(kanaChoice.getSelectionModel().getSelectedItem().equals("Hiragana")){
                        if(answerField.getText().equalsIgnoreCase(Main.romaji.get(Main.hiragana.indexOf(kanaLbl.getText())))){
                            right++;
                            total++;
                        }else{
                            total++;
                        }
                        extr = 0;
                        extractOnce();
                        update();
                        answerField.setText("");
                    }else if(kanaChoice.getSelectionModel().getSelectedItem().equals("Katakana")){
                        if(answerField.getText().equalsIgnoreCase(Main.romaji.get(Main.katakana.indexOf(kanaLbl.getText())))){
                            right++;
                            total++;
                        }else{
                            total++;
                        }
                        extr = 0;
                        update();
                        extractOnce();
                        answerField.setText("");
                    }
                }
            }
        });
    }

    @FXML
    public void kanaChoiceMeth(){
        kanaChoice.getItems().addAll("Hiragana", "Katakana");
        kanaChoice.show();
    }

    @FXML
    public void numChoice(){
        if(kanaChoice.getSelectionModel().isEmpty()){
            numChoice.setAccessibleText("Select kana first!");
        }else if (kanaChoice.getSelectionModel().getSelectedItem().equals("Hiragana")){
            for(int i = 0; i < Main.hiragana.size(); i++){
                numChoice.getItems().add(i);
            }
        }else if (kanaChoice.getSelectionModel().getSelectedItem().equals("Katakana")){
            for(int i = 0; i < Main.katakana.size(); i++){
                numChoice.getItems().add(i);
            }
        }
        numChoice.show();
    }

    public void update(){
        totalLbl.setText("Total: " + total);
        rightLbl.setText("Right: " + right);
        wrongLbl.setText("Wrong: " + (total-right));
    }

    public void extractOnce(){
        kanaLbl.setText(Main.hiragana.get((int)(Math.random()*Integer.parseInt(numChoice.getSelectionModel().getSelectedItem().toString()))));
        extr = 1;
    }

}
