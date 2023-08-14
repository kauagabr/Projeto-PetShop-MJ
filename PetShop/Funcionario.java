package PetShop;

public final class Funcionario extends Pessoa{
	
	private String rg;
	private int idade;
	private String cargo;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Funcionario(String nome, int idade, String rg, String cpf, Endereço endereço,  String cargo, double salario) {
		super(nome, cpf, endereço);
		this.idade = idade;
		this.cargo = cargo;
		this.rg = rg;
		this.salario = salario;
	}
	@Override
	public void fidelidade() {
		System.out.println("Voce foi um bom funcionario esse mes!");
		setSalario(getSalario() + (getSalario() * 0.10)); 
		System.out.println("Voce teve um aumento de 10% com um total de R$ "+ getSalario());
	}
	
	
}
	
