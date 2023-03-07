package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



//classe utilitaria chamada Alerts q tem uma FUNCAO/METODO ESTATICO 
//q GERA um ALERT... instanciando um OBJ do tipo ALERT(alert do JAVAFX)...
//e vamos setar o TITLE, o CABECALHO e o CONTEUDO e dps pedindo 
//para exibir o ALERT

public class Alerts {
	public static void showAlert(String title, String header, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}