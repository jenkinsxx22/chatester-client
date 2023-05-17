package chatester.main.view;

import java.net.URL;
import java.util.ResourceBundle;

import chatester.main.ChatesterApplicationMain;
import chatester.main.services.UserService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class interneterrorController implements Initializable{
	
	private ChatesterApplicationMain mainApp;
	private Stage dialogStage;
	 private boolean okClicked = false;
	 private UserService userservice = new UserService();
	@FXML
	private Button btnRetry;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		btnRetry.setOnAction(eve->{Retry();});
	}
	public void Retry() {
		if(userservice.Connect()==true){
			okClicked=true;
			dialogStage.close();
		}
	}
    public boolean isOkClicked() {
        return okClicked;
    }
	
    public void setMainApp(ChatesterApplicationMain mainApp) {
        this.mainApp = mainApp;
    }
	 public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }
}
