package lab_9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class TestException extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab 9");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        final TextField firstNumber = new TextField();
        firstNumber.setPromptText("Enter first number.");
        firstNumber.setPrefColumnCount(10);
        firstNumber.getText();
        GridPane.setConstraints(firstNumber, 0, 0);
        grid.getChildren().add(firstNumber);
        
        final TextField secondNumber = new TextField();
        secondNumber.setPromptText("Enter second number.");
        GridPane.setConstraints(secondNumber, 0, 1);
        grid.getChildren().add(secondNumber);
        
        final Label message = new Label();
        //result.setPrefColumnCount(15);
        //result.setPromptText("Enter your comment.");
        GridPane.setConstraints(message, 0, 2);
        grid.getChildren().add(message);
        //Defining the Submit button
        Button submit = new Button("Divide");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);
        //Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);
        
        submit.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	try {
            		double divident = Double.parseDouble(firstNumber.getText());
                	double divisor = Double.parseDouble(secondNumber.getText());
                	
                	if (divisor == 0) {
                		message.setText("Cannot divide to zero");
                	}
                	else {
                		if(divisor == 13) {
                			throw new UnluckyException("This number is very unlucky");
                		}
                		double result = divident/divisor;
                    	message.setText(String.valueOf(result));
                	}
				} catch(NumberFormatException e) {
					message.setText("Inserted value isn't a number");
				}
            	catch(UnluckyException e) {
            		message.setText(e.getMessage());
            	}
            	catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}            	
            }
        });
        
        clear.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
            	try {
            		firstNumber.setText("");
            		secondNumber.setText("");
            		message.setText("");
				}
            	catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}            	
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(grid);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
