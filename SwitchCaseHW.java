/**
*
*Author: William Scribner
*
*Purpose: SWITCH CASE HOMEWORK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
*
*/


import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class SwitchCaseHW extends Application {

	@Override
	public void start(Stage primarystage) throws Exception {
	
	List<String> choices = new ArrayList<>();
	choices.add("Administrator");
	choices.add("Faculty");
	choices.add("Staff");
	choices.add("Student");

	ChoiceDialog<String> dialog = new ChoiceDialog<>("Administrator", choices);
	dialog.setTitle("Choose Social Class");
	dialog.setHeaderText("Choose your social class, peasant");
	Optional<String> result = dialog.showAndWait();

	String value = result.get();

	String a = "Welcome, " + value;

	Alert alert = new Alert(AlertType.INFORMATION);

	switch(value){

	case "Administrator":
	alert.setTitle("Choice");
	alert.setHeaderText(a);
	alert.showAndWait();
	break;

	case "Faculty":
	alert.setTitle("Choice");
	alert.setHeaderText(a);
	alert.showAndWait();
	break;
	
	case "Staff":
	alert.setTitle("Choice");
	alert.setHeaderText(a);
	alert.showAndWait();
	break;

	case "Student":
	alert.setTitle("Choice");
	alert.setHeaderText(a);
	alert.showAndWait();
	break;


	}




	}
}
