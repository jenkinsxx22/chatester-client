package chatester.main;

import java.io.IOException;
import java.util.prefs.Preferences;

import chatester.main.view.HomeController;
import chatester.main.view.LoginController;
import chatester.main.view.RegisterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ChatesterApplicationMain extends Application {
	private Stage primaryStage;
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Chatester App");
        this.primaryStage.getIcons().add(new Image("file:resources/images/chat-icon.png"));
        this.primaryStage.initStyle(StageStyle.UNDECORATED);
        if (getUserName().equals("")) {
        	showLogin();
        }else {
        	showHome();
        }
}

	public void showHome() {
		try {
		FXMLLoader loader =new FXMLLoader(getClass().getResource("view/Home.fxml"));			
		Parent fxml = (Parent) loader.load();
        primaryStage.setScene(new Scene(fxml, 1000, 650));
        primaryStage.show();
    	//	controller.setDialogStage(primaryStage);

        HomeController controller = (HomeController) loader.getController();
		controller.setMainApp(this);
		controller.setUserName(getUserName());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

    
	public void showLogin() {
		try {
		FXMLLoader loader =new FXMLLoader(getClass().getResource("view/Login.fxml"));			
		Parent fxml = (Parent) loader.load();        
        primaryStage.setScene(new Scene(fxml, 800, 600));
        primaryStage.show();
    	

        LoginController controller = (LoginController) loader.getController();
		controller.setMainApp(this);
		controller.setDialogStage(primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void showRegister() {
		try {
		FXMLLoader loader =new FXMLLoader(getClass().getResource("view/Register.fxml"));			
		Parent fxml = (Parent) loader.load();
        primaryStage.setScene(new Scene(fxml, 800, 600));
        primaryStage.show();
        RegisterController controller = (RegisterController) loader.getController();
        controller.setDialogStage(primaryStage);
		controller.setMainApp(this);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    
	public void setUserLogin(String username, String password) {
	    Preferences prefs = Preferences.userNodeForPackage(ChatesterApplicationMain.class);
        prefs.put("userName",username);
        prefs.put("userPassword",password);
	}
	
	public String getUserName() {		
	    Preferences prefs = Preferences.userNodeForPackage(ChatesterApplicationMain.class);
	    String username = prefs.get("userName",null);
        return username;
	}
	public Stage getPrimaryStage() {
		return primaryStage;
	}
}
