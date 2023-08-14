package PetShop;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private Endereço endereço;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public Pessoa(String nome, String cpf, Endereço endereço) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
	}
	
	public abstract void fidelidade();
}
