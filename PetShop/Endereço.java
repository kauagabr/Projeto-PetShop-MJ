package PetShop;

public class Endereço {
	private String rua;
	private String bairro;
	private String numero;
	private String cidadeEstado;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getCidadeEstado() {
		return cidadeEstado;
	}
	public void setCidadeEstado(String cidadeEstado) {
		this.cidadeEstado = cidadeEstado;
	}
	public Endereço(String rua, String bairro, String numero, String cidadeEstado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidadeEstado = cidadeEstado;
		
	}
	
	
}
