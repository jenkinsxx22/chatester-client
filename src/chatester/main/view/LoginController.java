package chatester.main.view;

import java.net.URL;
import java.util.ResourceBundle;

import chatester.main.ChatesterApplicationMain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage; 

public class LoginController implements Initializable{
	
	private ChatesterApplicationMain mainApp;
	
	private Stage dialogStage;
	@FXML
	private TextField txtUserName;
	@FXML
	private PasswordField pswUserPassword;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnExit;
	@FXML
	private Button btnRegister;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		btnLogin.setOnAction(eve->{Login();});
		btnExit.setOnAction(eve->{Exit();});
		btnRegister.setOnAction(eve->{Register();});
	}
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	public void Login() {
		if(txtUserName.getText()!="" && pswUserPassword.getText()!="") {
		mainApp.showHome();
		mainApp.setUserLogin(txtUserName.getText(), pswUserPassword.getText());
		}
		else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText("Fill the fields!");            
            alert.showAndWait();
            
        }
	}
	public void Exit() {
		System.exit(0);
	}
	public void Register() {
		
		mainApp.showRegister();
	
	}
    public void setMainApp(ChatesterApplicationMain mainApp) {
        this.mainApp = mainApp;
    }
}
