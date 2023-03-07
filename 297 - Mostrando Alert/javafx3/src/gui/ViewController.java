package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

//classe q vai servir para CONTROLLAR o nosso VIEW.FXML (arquivo com o DESIGN)
public class ViewController {
	
	//declarando um ATRIBUTO correspondente ao BOTAO q ta no VIEW.FXML
	//para quando FOR CLICADO no BOTAO realizar uma determinada acao...
	//de nome BTTEST
	@FXML
	private Button btTest;
	
	//criando um METODO q sera responsavel por EXECUTAR algo QUANDO O BOTAO
	//for clicado... o Bottao q ta no DESIGN VIEW.FXML... o btTest...
		//EventHandler é responsavel por FAZER ALGUMA COISA quando o usuario
		//clicar na tela...
	@FXML
	public void onBtTestAction() {
		//chamando a classe ALERTS, e chamando o METODO SHOW ALERTS
		//vamos passar um titulo, cabecalho, conteudo, e um tipo...
		//para exibir um ALERT para quando CLICAR NO BOTAO
		Alerts.showAlert("alert title", "alert header", "helo", AlertType.INFORMATION);
		
	}
	
}
