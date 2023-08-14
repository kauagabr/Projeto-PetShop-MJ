package Loja;

public class ItemVenda {
	private Produto produto;
	private double quantidade;
	
	public ItemVenda(Produto produto, double quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
}
