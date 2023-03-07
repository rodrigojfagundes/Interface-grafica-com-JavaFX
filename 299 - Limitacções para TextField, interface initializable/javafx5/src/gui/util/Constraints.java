package gui.util;

import javafx.scene.control.TextField;

//criando a classe CONSTRAINS
public class Constraints {

	public static void setTextFieldInteger(TextField txt) {

//q tem um addListener q vai monitorar os CONTROLERS... Ou seja é uma funcao q é
//excutada quando o CONTROLLER tem alguma modificaçação/interacao, e como argumento
//passamos o q queremos q seja exec quando a caixa de texto tiver modificacao
//esta em expressao lambda
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
//testando se o NOVO VALOR é um NUMERO INTEIRO com o \\D*
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

//metodo q TESTA o TAMANHO do NUMERO DIGITADO e MAIOR q o valor
//MAX permitido
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

//metodo para verificar SE e os NUM DOUBLE
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}