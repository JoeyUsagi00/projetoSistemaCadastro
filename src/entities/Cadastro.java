package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Application.Program;

public class Cadastro {

	private String name;
	private Integer idade;
	private Double cpf;

	Scanner sc = new Scanner(System.in);

	

	public Cadastro(String name, Integer idade, Double cpf) {
		this.name = name;
		this.idade = idade;
		this.cpf = cpf;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getIdade() {
		return idade;
	}



	public void setIdade(Integer idade) {
		this.idade = idade;
	}



	public Double getCpf() {
		return cpf;
	}



	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}






	@Override
	public String toString() {
		return "Cadastro [Nome= " + name + ", idade= " + idade + ", cpf= " + cpf + "]" + "\n";
	}
	
	
}