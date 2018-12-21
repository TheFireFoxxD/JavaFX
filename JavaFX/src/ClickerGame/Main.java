package ClickerGame;

import javafx.application.Application;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Main extends Application {
	
	Stage window;
	Button clickButton, shopButton;
	int n = 0;
	int cP = 1;
	int cC = (int) Math.pow(cP, 3) * 2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Clicker Game");
		clickButton = new Button("Click!");
		shopButton = new Button("Buy 1 Click Power for " + cC + " Clicks!");
		Label title = new Label("Clicker Game");
		Label clicks = new Label("You have " + n + " Clicks");
		Label clickPower = new Label("Your Click Power is " + cP); 
		
		clickButton.setOnAction(e -> {
			n += cP;
			clicks.setText("You have " + n + " Clicks");
		});
		
		shopButton.setOnAction(e -> {
			if (n >= cC) {
				n -= cC;
				cC = (int) Math.pow(cP, 3) * 2;
				cP++;
				clicks.setText("You have " + n + " Clicks");
				clickPower.setText("Your Click Power is " + cP);
				shopButton.setText("Buy 1 Click Power for " + cC + " Clicks!");
			} else {
				Shop.display("Shop Title", "Sorry, but you cannot buy this");
			}
		});
		
		
		
		VBox layout = new VBox(10);
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(title, clickButton, clicks, clickPower, shopButton);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show(); 
	}

}
