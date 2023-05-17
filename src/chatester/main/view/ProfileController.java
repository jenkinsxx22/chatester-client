package chatester.main.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ProfileController implements Initializable{
	
	private DashboardController mainApp;
	private Stage dialogStage;
	
	
	@FXML
	private Label lblFullName;
	@FXML
	private Label lblEmail;
	@FXML
	private Button btnUpload;
	@FXML
	private ImageView imgProfile;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		btnUpload.setOnAction(eve->{Upload();});
	}
	public void Upload() {

	}
	
    public void setMainApp(DashboardController mainApp) {
        this.mainApp = mainApp;
    }
	 public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }
}
