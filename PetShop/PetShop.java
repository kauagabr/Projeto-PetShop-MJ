package PetShop;

import java.util.ArrayList;
import java.util.List;
import Loja.Loja;
	
public class PetShop {
	
	private String nome;
	private Endereço endereço;
	private List<Funcionario> funcionarios;
	private List<Animal> animais;
	private Loja loja;
	
	public PetShop(String nome, Endereço endereco, Loja loja) {
        this.nome = nome;
        this.endereço = endereco;
        this.funcionarios = new ArrayList<>();
        this.animais = new ArrayList<>();
        this.loja = loja;
    }
	
	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}


	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
	
	public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

}
