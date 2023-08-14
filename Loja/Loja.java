package Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
	
	private List<Venda> vendas;
	Scanner scanner = new Scanner(System.in);
	
	public Loja() {
		super();
		this.vendas = new ArrayList<>();
	}
	
	public void adicionarVendas(Venda venda) {
		vendas.add(venda);
	}
	
	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	
	public void relatorioVendas() {
		System.out.println("-----------------------------------");
		System.out.println("========Relatorio de Vendas========");
		for (Venda venda : vendas) {
			venda.mostrarItens();
			System.out.println("CPF: "+ venda.getCpfoperação());
			System.out.println("Valor total: R$" + venda.getValorTotal());
			System.out.println("-----------------------------------");
		}
	}

	public void efetuarVenda() {
		
		System.out.println("======Efertuar Venda======");
		
		// Criação do objeto de Vendas.
		Venda venda = new Venda();
		
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = scanner.nextLine();
		
		System.out.print("Digite o preco do produto: R$");
		String precoProduto = scanner.nextLine();
	    double valor = Double.parseDouble(precoProduto);
		
		System.out.print("Digite a quantidade do produto: ");
		String quantPro = scanner.nextLine();
		double quant = Double.parseDouble(quantPro);
		
		Produto produto = new Produto(nomeProduto, valor);
		
		// Adição dos itens a venda.
		ItemVenda itemVenda = new ItemVenda(produto, quant);
		venda.adicionarItem(itemVenda);
		
		while (true) {	
			System.out.print("Adicionar mais produto? \n1 - Sim ou 2 - Nao: ");
    		String opcao = scanner.nextLine();
			if (opcao.equals("1")) {
				System.out.println();
				System.out.print("Digite o nome do produto: ");
				String nomeProduto1 = scanner.nextLine();
				
				System.out.print("Digite o preco do produto: R$");
				String precoProduto1  = scanner.nextLine();
			    double valor1 = Double.parseDouble(precoProduto1);
				
				System.out.print("Digite a quantidade do produto: ");
				String quantPro1 = scanner.nextLine();
				double quant1 = Double.parseDouble(quantPro1);
				
				Produto produto1 = new Produto(nomeProduto1, valor1);
				
				// Adição dos itens a venda.
				ItemVenda itemVenda1 = new ItemVenda(produto1, quant1);
				venda.adicionarItem(itemVenda1);
				
			}else if (opcao.equals("2")) {
				break;
			}else {
				System.out.println("Opcao invalida!");
			}
		}
		
		// Cálculo do valor total da venda
		double valorTotal1 =  venda.calcularValorTotal();
		
		while (true) {
        	System.out.print("O cliente e fiel? \n1 - Sim ou 2 - Nao: ");
    		String opcao1 = scanner.nextLine();
    		
        	if (opcao1.equals("1")) {
        		System.out.println("Voce ganhou 5% de desconto.");
        		valorTotal1 = valorTotal1 - (valorTotal1 * 0.05);
        		break;
        	} 
        	else if (opcao1.equals("2")) {
				break;
			} else {
				System.out.println("Opcao invalida!");
			}
        }
		
        while (true) {
        	System.out.print("Quer CPF na nota? \n1 - Sim ou 2 - Nao: ");
    		String opcao2 = scanner.nextLine();
    		
        	if (opcao2.equals("1")) {
        		System.out.print("Informe o CPF: ");
        		String cpf = scanner.nextLine();
        		venda.setCpfoperação(cpf);
        		
        		System.out.println("CPF: " + venda.getCpfoperação());
        		break;
        	}
        	else if (opcao2.equals("2")) {
        		venda.setCpfoperação("Nao Informado");
				break;
			} else {
				System.out.println("Opcao invalida!");
			}
        }
        
        String valorTotal2 = String.format("%.2f", valorTotal1); 
        venda.setValorTotal(valorTotal2);
        System.out.println("---------------------------------------");
        System.out.println("Itens da venda:");
    	venda.mostrarItens();
    	System.out.println("Valor total: R$ " + venda.getValorTotal());
    	System.out.println();
    	adicionarVendas(venda);
	}
}


