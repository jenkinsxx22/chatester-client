package chatester.main.view;
import java.net.URL;
import java.util.ResourceBundle;

import chatester.main.ChatesterApplicationMain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField; 
public class RegisterController implements Initializable{
	
	private ChatesterApplicationMain mainApp;
	
	@FXML
	private TextField txtFullName;
	@FXML
	private TextField txtEmail;
	@FXML
	private PasswordField pswUserPassword;
	@FXML
	private PasswordField pswUserPassword2;

	@FXML
	private Button btnCancel;
	@FXML
	private Button btnRegister;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnRegister.setOnAction(eve->{Register();});
		btnCancel.setOnAction(eve->{Cancel();});
	}
	public void Register() {
		System.out.print("Register!");
	}
	public void Cancel() {
		mainApp.showLogin();
	}
	
    public void setMainApp(ChatesterApplicationMain mainApp) {
        this.mainApp = mainApp;
    }


}

