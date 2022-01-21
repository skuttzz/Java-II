package kelso_lab82;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.*;

public class Kelso_lab82 extends Application {
    Canvas canvas;
    Label intersectLabel;
    
    @Override
    public void start(Stage stage) throws Exception{
        VBox panesStack = new VBox(20);
        
        Insets padding = new Insets(10);
        
        Label x1Label = new Label("X:");
        Label y1Label = new Label("Y:");
        Label height1Label = new Label ("Height:");
        Label width1Label = new Label ("Width:");
        TextField x1Text = new TextField();
        TextField y1Text = new TextField();
        TextField height1Text = new TextField();
        TextField width1Text = new TextField();
        
        GridPane grid1 = new GridPane();
        grid1.setPadding(padding);
        grid1.setHgap(10);
        grid1.setVgap(5);
        
        grid1.add(new Label("Enter rectangle 1 info: "),0,0,2,1);
        grid1.add(x1Label, 0, 1);
        grid1.add(y1Label, 0, 2);
        grid1.add(width1Label, 0, 3);
        grid1.add(height1Label, 0, 4);
        grid1.add(x1Text, 2,1);
        grid1.add(y1Text, 2,2);
        grid1.add(width1Text, 2,3);
        grid1.add(height1Text, 2, 4);
        
        Label x2Label = new Label("X:");
        Label y2Label = new Label("Y:");
        Label height2Label = new Label ("Height:");
        Label width2Label = new Label ("Width:");
        TextField x2Text = new TextField();
        TextField y2Text = new TextField();
        TextField height2Text = new TextField();
        TextField width2Text = new TextField();
        
        GridPane grid2 = new GridPane();
        grid2.setPadding(padding);
        grid2.setHgap(10);
        grid2.setVgap(5);
        
        
        grid2.add(new Label("Enter Rectangle 2 info:"),0,0,2,1);
        grid2.add(x2Label, 0, 1);
        grid2.add(y2Label, 0, 2);
        grid2.add(width2Label, 0, 3);
        grid2.add(height2Label, 0, 4);
        grid2.add(x2Text, 2,1);
        grid2.add(y2Text, 2,2);
        grid2.add(width2Text, 2,3);
        grid2.add(height2Text, 2, 4);
        
        
        HBox rectGrids = new HBox(30);
        rectGrids.getChildren().add(grid1);
        rectGrids.getChildren().add(grid2);
        panesStack.getChildren().add(rectGrids);
        
        Button update = new Button();
        
        update.setOnAction(new EventHandler<ActionEvent>(){
            @Override public void handle(ActionEvent e) {
                
    }
});   
        canvas = new Canvas(600, 500);
        
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
        
        panesStack.getChildren().add(canvas);
        
        intersectLabel = new Label ("Waiting for rectangle info");
        
        intersectLabel.setPadding(new Insets(0,0,20,0));
        panesStack.getChildren().add(new StackPane(intersectLabel));
        Scene scene = new Scene(panesStack);
        stage.setTitle("Kelso_lab8b");
        stage.setScene(scene);
        stage.show();
       
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}