package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {
	
	@FXML
	private ComboBox<Person> comboBoxPerson;

	private ObservableList<Person> obsList;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "maria", "maria@gmail.com"));
		list.add(new Person(2, "alex", "alex@gmail.com"));
		list.add(new Person(3, "bob", "bob@gmail.com"));

		obsList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(obsList);
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
		 @Override

		 protected void updateItem(Person item, boolean empty) {
		 super.updateItem(item, empty);
		 setText(empty ? "" : item.getName());
		 }
		};

		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));

		
	}
	
}