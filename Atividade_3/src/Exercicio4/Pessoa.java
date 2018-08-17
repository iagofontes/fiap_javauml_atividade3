package Exercicio4;

public class Pessoa {

	public String nome;
	public Integer idade;
	public char sexo;
	public String empresa;
	
	public Pessoa(String nome, Integer idade, char sexo, String empresa) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return 
			"Nome: "+this.nome
			+", Idade: "+this.idade
			+", Sexo: "+this.sexo
			+", Empresa: "+this.empresa;
	}
}
