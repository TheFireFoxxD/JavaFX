import javafx.application.Application;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class TutorialMain extends Application {
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {	
		window = primaryStage;
		window.setTitle("Title of the window");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		Label label = new Label("Enter Information");
		GridPane.setConstraints(label, 1, 0);
		
		//Name Label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 1, 1);
		
		//Name Input
		TextField nameInput = new TextField("Alexander Ilg");
		GridPane.setConstraints(nameInput, 2, 1);
		
		//Password label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 1, 2);
		
		//Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 2, 2);
		
		Button logInButton = new Button("Log In");
		GridPane.setConstraints(logInButton, 2, 3);
		
		grid.getChildren().addAll(label, nameLabel, nameInput, passLabel, passInput, logInButton);
		
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		window.show(); 
	}
	
}
