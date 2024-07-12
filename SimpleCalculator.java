import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleCalculator extends Application{

	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
				new Label("Number 2: "), tfNumber2,
				new Label("Result: "), tfResult);
		
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		Button btSquareRoot = new Button("Square Root");
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivide,btSquareRoot);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		Scene scene = new Scene(borderPane, 250,150);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		btAdd.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btSquareRoot.setOnAction(e -> {
			tfResult.setText(Math.sqrt(Double.parseDouble(tfNumber1.getText())) + "");
		});
	}
	public static void main(String[] args) {
		launch(args);
	}
}
