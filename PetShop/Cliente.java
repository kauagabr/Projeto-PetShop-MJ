package PetShop;

public final class Cliente extends Pessoa{

	private String whatsApp;

	public String getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}

	public Cliente(String nome, String cpf, Endereço endereço, String whatsApp) {
		super(nome, cpf, endereço);
		this.whatsApp = whatsApp;
	}

	@Override
	public void fidelidade() {
		System.out.println("Obrigado por ser um otimo cliente!");
	}
	
}
