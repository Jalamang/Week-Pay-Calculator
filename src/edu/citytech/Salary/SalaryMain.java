package edu.citytech.Salary;


import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SalaryMain extends Application {
	
	   public static void main(String[] args) {
		   Application.launch(SalaryMain.class, args);
	
		       }

	   @Override
	    public void start(Stage stage) throws Exception {
	        Parent root = FXMLLoader.load(getClass().getResource("Salary.fxml"));
	        stage.setTitle("Pay Check");
	        
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        
	        URL url = this.getClass().getResource("Salary.css");
	        if(url == null) {
	        	System.out.println("Resource not found. Absording.");
	        	System.exit(-1);
	        }
	        
	        String css =url.toExternalForm();
	        scene.getStylesheets().add(css);
	        
	        stage.show();
		
	}

}
