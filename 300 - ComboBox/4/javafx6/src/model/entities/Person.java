package model.entities;

import java.io.Serializable;

//classe pessoa... implementando a INTERFACE SERIALIZABLE (ela ja vem com o javaFX)
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//declarando os atributos de pessoa
	private Integer id;
	private String name;
	private String email;
	
	//construtor padrao
	public Person() {}
	
	//construtor com argumentos
	public Person(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	//gerando os GET e SET para poder manipular os ATRIBUTOS/VARIAVEIS
	//da class PERSON
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//metodo TOSTRING para pegar os valores de forma q de para ler/entender
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
