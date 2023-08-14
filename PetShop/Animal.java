package PetShop;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	
	private String Nome;
	private int Idade;
	private String Especie;
	private String descricao;
	private List<Cliente> clientes;
	
	public Animal(String nome, int idade, String especie, String descricao) {
		super();
		Nome = nome;
		Idade = idade;
		Especie = especie;
		this.descricao = descricao;
		this.clientes = new ArrayList<>();
	}
		
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
}
