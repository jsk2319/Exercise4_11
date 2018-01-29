import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.application.Application;
import java.util.Optional;


public class Exercise411 extends Application {

    public void start(Stage primaryStage) {


        TextInputDialog vZero = new TextInputDialog();
        firstInput.setTitle("Enter Input");
        firstInput.setHeaderText("Integer to Hex Converter");
        firstInput.setContentText("Enter a number between 0 and 15. Your input will be converted to hex.");
        Optional<String> value = firstInput.showAndWait();
        String userInput = value.get();


	if (userInput == 0) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 0.");
        alert.showAndWait();


        }if (userInput == 1) {
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 1.");
        alert.showAndWait();

        }if (userInput == 2) {
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 2.");
        alert.showAndWait();

        }if (userInput == 3) {

        Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 3.");
        alert.showAndWait();

        }if (userInput == 4) {

        Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 4.");
        alert.showAndWait();

        }if (userInput == 5) {

        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 5.");
        alert.showAndWait();

        }if (userInput == 6) {

        Alert alert6 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 6.");
        alert.showAndWait();

        }if (userInput == 7) {

        Alert alert7 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 7.");
        alert.showAndWait();

        }if (userInput == 8) {

        Alert alert8 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 8.");
        alert.showAndWait();

        }if (userInput == 9) {

        Alert alert9 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is 9.");
        alert.showAndWait();

        }if (userInput == 10) {

        Alert alert10 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is A.");
        alert.showAndWait();

        }if (userInput == 11) {

        Alert alert11 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is B.");
        alert.showAndWait();

        }if (userInput == 12) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is C.");
        alert.showAndWait();

 	}if (userInput == 13) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is D.");
        alert.showAndWait();

	}if (userInput == 14) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is E.");
        alert.showAndWait();

 	}if (userInput == 15) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Output");
        alert.setContentText("The output is F.");
        alert.showAndWait();



        }else
        System.out.println("You have to enter an integer between 0 and 15.");

        }

}