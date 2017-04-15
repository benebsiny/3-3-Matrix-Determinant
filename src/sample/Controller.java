package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;

public class Controller {
    public TextField a1str;
    public TextField a2str;
    public TextField a3str;
    public TextField b1str;
    public TextField b2str;
    public TextField b3str;
    public TextField c1str;
    public TextField c2str;
    public TextField c3str;
    public Label answer;

    public void determinant(ActionEvent actionEvent) {
        try{
            int a1 = Integer.valueOf(a1str.getText());
            int a2 = Integer.valueOf(a2str.getText());
            int a3 = Integer.valueOf(a3str.getText());
            int b1 = Integer.valueOf(b1str.getText());
            int b2 = Integer.valueOf(b2str.getText());
            int b3 = Integer.valueOf(b3str.getText());
            int c1 = Integer.valueOf(c1str.getText());
            int c2 = Integer.valueOf(c2str.getText());
            int c3 = Integer.valueOf(c3str.getText());

            int ans = (a1*b2*c3)+(a2*b3*c1)+(a3*b1*c2)-(a3*b2*c1)-(a2*b1*c3)-(a1*b3*c2);
            answer.setText(Integer.toString(ans));

        }catch (Exception e){
            answer.setText("錯誤啦");
        }
    }
}
