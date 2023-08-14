package Loja;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private List<ItemVenda> itens;
	private String valorTotal;
	private String cpfOperação;
	
	public Venda() {
		super();
		this.itens = new ArrayList<>();
	}
	
	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal2) {
		this.valorTotal = valorTotal2;
	}

	public String getCpfoperação() {
		return cpfOperação;
	}

	public void setCpfoperação(String cpfoperação) {
		this.cpfOperação = cpfoperação;
	}

	
	public void adicionarItem(ItemVenda item) {
		itens.add(item);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		
		for (ItemVenda item : itens) {
			double valorItem = item.getProduto().getPreco() * item.getQuantidade();
	        valorTotal = valorTotal + valorItem;
		}
		return valorTotal;
	}
	
	public void mostrarItens() {
		for (ItemVenda item : itens) {
			System.out.println("Produto: " + item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade());
		}
	}
}
