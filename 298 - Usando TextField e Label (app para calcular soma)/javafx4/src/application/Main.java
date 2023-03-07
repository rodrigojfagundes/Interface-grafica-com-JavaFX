package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		try {
			//carregando o DESIGN da PAG do SOFTWARE q ta no arquivo VIEW.FXML
			//e armazenando essas informacoes no OBJ do tipo PARENT
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			//criando um novo OBJ do tipo SCENE q ira RECEBER o DESIGN do software
			//q ta no arquivo PARENT
			Scene scene = new Scene(parent);
			//dizendo q o PALCO/STAGE vai ter q CENA q esta em SCENE (q é o nosso
			//DESIGN)
			stage.setScene(scene);
			//exibindo o q ta no STAGE/palco...
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
