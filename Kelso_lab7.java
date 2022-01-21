/*
Noah Kelso
4/20/2021
Lab 7
This is a simple calculator
 */
package kelso_lab7;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class Kelso_lab7 extends Application {
    private TextField textfield1 = new TextField();
    private TextField textfield2 = new TextField();
    private TextField textfield3 = new TextField();
    private Button Add = new Button("Add");  
    private Button Subtract = new Button("Subtract");
    private Button Multiply= new Button("Multiply");
    private Button Divide = new Button("Divide");
    @Override
public void start(Stage Stage) throws Exception {
    GridPane pane = new GridPane();
    pane.add(textfield1, 0, 0);
    pane.add(textfield2, 0, 1);
    pane.add(textfield3, 0, 2);
    pane.add(Add, 0, 3);
    pane.add(Subtract, 0, 4);
    pane.add(Multiply, 0, 5);
    pane.add(Divide, 0, 6);
pane.setAlignment(Pos.CENTER);
textfield1.setAlignment(Pos.CENTER);
textfield2.setAlignment(Pos.CENTER);
textfield3.setAlignment(Pos.CENTER);
textfield3.setEditable(false);
Add.setPrefWidth(150);
Subtract.setPrefWidth(150);
Multiply.setPrefWidth(150);
Divide.setPrefWidth(150);
pane.setPadding(new Insets(20, 20, 20, 20));
Add.setOnAction(e -> Add());
Subtract.setOnAction(e -> Subtract());
Multiply.setOnAction(e -> Multiply());
Divide.setOnAction(e -> Divide());
Scene scene = new Scene(pane);
Stage.setTitle("Kelso Calculator");
Stage.setScene(scene);
Stage.show();
}
//Each if statment checks if the field has a proper numeric value. If it does not, an error message shows.
Alert errorAlert = new Alert(AlertType.ERROR);
private void Add() {
    try{
    int number1=Integer.parseInt(textfield1.getText());
    int number2=Integer.parseInt(textfield2.getText());
    int result=number1+number2;
    textfield3.setText(String.valueOf(result));
    }
    catch(NumberFormatException e){
        errorAlert.setHeaderText("Input not valid. Please enter a number");
        errorAlert.showAndWait();
    }
}
private void Subtract() {
    try{
        int number1=Integer.parseInt(textfield1.getText());
        int number2=Integer.parseInt(textfield2.getText());
        int result=number1-number2;
        textfield3.setText(String.valueOf(result));
    }
    catch(NumberFormatException e){
        errorAlert.setHeaderText("Input not valid. Please enter a number");
        errorAlert.showAndWait();
    }
}

private void Multiply() {
    try{
        int number1=Integer.parseInt(textfield1.getText());
        int number2=Integer.parseInt(textfield2.getText());
        int result=number1*number2;
        textfield3.setText(String.valueOf(result));
    }
    catch (NumberFormatException e){
        errorAlert.setHeaderText("Input not valid. Please enter a number");
        errorAlert.showAndWait();
    }
}
private void Divide() {
    try{
        int number1=Integer.parseInt(textfield1.getText());
        int number2=Integer.parseInt(textfield2.getText());
        int result=number1/number2;
        textfield3.setText(String.valueOf(result));
    }
    catch (NumberFormatException e){
        errorAlert.setHeaderText("Input not valid. Please enter a number");
        errorAlert.showAndWait();
    }
}
public static void main(String[] args) {
    Application.launch(args);
}
}