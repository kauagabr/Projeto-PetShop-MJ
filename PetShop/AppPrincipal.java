package PetShop;

import java.util.Scanner;
import Animais.*;
import Loja.Loja;

public class AppPrincipal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Loja loja = new Loja();
		
		Endereço endereço = new Endereço("Rua Principal", "Bairro Central", "123", "Cidade X, Estado Y");
		PetShop petShop = new PetShop("Pet Shop-Mario Jorge", endereço, loja);
		
		
		Endereço endereço1 = new Endereço("Rua Capitão Pedro Ivo", "Centro", "507", "Palmares - PE");
		Cliente dono1 = new Cliente("Vitor","123.123.123-23", endereço1, "(81)92348-1706" );
		Animal animal1 = new Coelho("Bob", 3, "Coelho", "");
		animal1.adicionarCliente(dono1);
		
		Endereço endereço2 = new Endereço("Rua A", "Quilombo 3", "34", "Palmares - PE");
		Cliente dono2 = new Cliente("Yanka","321.321.321-23", endereço2, "(81)95654-3423" );
		Animal animal2 = new Gato("Mario Jorge", 2, "Gato", "");
		animal2.adicionarCliente(dono2);
		
		Endereço endereço3 = new Endereço("Rua C", "Quilombo 1", "34", "Palmares - PE");
		Cliente dono3 = new Cliente("Kaua","454.454.321-23", endereço3, "(81)98765-3432" );
		Animal animal3 = new Pato("Frederico", 5, "Pato", "");
		animal3.adicionarCliente(dono3);
		
		petShop.adicionarAnimal(animal1);
		petShop.adicionarAnimal(animal2);
		petShop.adicionarAnimal(animal3);
		
		
		Funcionario funcionario1 = new Funcionario("Miguel", 25, "123456", "123.456.789-50", endereço, "Atendente", 1500);
		Funcionario funcionario2 = new Funcionario("Alice", 21, "123456", "123.456.789-90", endereço, "Atendente", 1500);
		Funcionario funcionario3 = new Funcionario("DR.Gael", 28, "123456", "123.456.899-40", endereço, "Veterinario", 5000);
		Funcionario funcionario4 = new Funcionario("DR.Theo", 30, "123456", "123.556.899-46", endereço, "Veterinario", 5000);
		Funcionario funcionario5 = new Funcionario("DR.Laura", 40, "123456", "123.889.899-47", endereço, "Veterinario", 5000);
		Funcionario funcionario6 = new Funcionario("Sophia", 35, "123456", "177.456.899-42", endereço, "Limpeza", 1300);
		Funcionario funcionario7 = new Funcionario("Heloisa", 26, "123456", "166.456.899-43", endereço, "Limpeza", 1300);
		Funcionario funcionario8 = new Funcionario("Bernardo", 46, "123456", "199.456.899-44", endereço, "Limpeza", 1300);
		Funcionario funcionario9 = new Funcionario("Claudio", 26, "123456", "123.456.899-40", endereço, "Auxiliar", 2500);
		Funcionario funcionario10 = new Funcionario("Jair", 25, "123456", "123.556.899-46", endereço, "Auxiliar", 2500);
		Funcionario funcionario11 = new Funcionario("Gabriel", 35, "123456", "123.889.899-47", endereço, "Auxiliar", 2500);
		petShop.adicionarFuncionario(funcionario1);
		petShop.adicionarFuncionario(funcionario2);
		petShop.adicionarFuncionario(funcionario3);
		petShop.adicionarFuncionario(funcionario4);
		petShop.adicionarFuncionario(funcionario5);
		petShop.adicionarFuncionario(funcionario6);
		petShop.adicionarFuncionario(funcionario7);
		petShop.adicionarFuncionario(funcionario8);
		petShop.adicionarFuncionario(funcionario9);
		petShop.adicionarFuncionario(funcionario10);
		petShop.adicionarFuncionario(funcionario11);
		
		while (true) {
			exibirMenu();
			String opcao = scanner.nextLine();
			

			if (opcao.equals("1")) { // Realizar operações
				exibirMenu2();
				String opcaoMenu2 = scanner.nextLine();
				
				if(opcaoMenu2.equals("1")) {  // realizar consulta
					efetuarConsulta(petShop, scanner);
				}
				else if(opcaoMenu2.equals("2")) { // realizar venda
					petShop.getLoja().efetuarVenda();
				}
				else if(opcaoMenu2.equals("3")) { // retornar ao menu anterior
					System.out.println("Retornando...");
					exibirMenu();
				}		
				else if(opcaoMenu2.equals("4")) { // encerrar programa
					System.out.println("Encerrando o programa...");
					break;	
				}
				else {
					System.out.println("Opção inválida. Tente novamente.");
				}	

			}else if (opcao.equals("2")) { // Add Funcionarios
				adicionarFuncionario(petShop, scanner);
			}
			else if (opcao.equals("3")) { // Exibir consultas e funcionarios cadastrados
				exibirMenu3();
				String opcaoMenu3 = scanner.nextLine();
				if (opcaoMenu3.equals("1")) { // exibir consultas marcadas
					exibirConsulta(petShop, scanner);
				}
				else if (opcaoMenu3.equals("2")) { // exibir funcionarios cadastrados
					exibirFuncionarios(petShop);
				}
				else if (opcaoMenu3.equals("3")) {
					petShop.getLoja().relatorioVendas();
				}
				else if(opcaoMenu3.equals("4")) { // retornar ao menu anterior
					System.out.println("Retornando...");
					exibirMenu();
				}
				else if(opcaoMenu3.equals("5")) { // encerrar programa
					System.out.println("Encerrando o programa...");
					break;			
				}
				else {
					System.out.println("Opção inválida. Tente novamente.");
				}	
			} 
			else if (opcao.equals("4")) {
				System.out.println("Encerrando o programa...");
				break;
			}
			else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

		private static void exibirMenu() {
			System.out.println("======== Menu ========");
			System.out.println("1. Efetuar Operacao");
			System.out.println("2. Adicionar Funcionario");
			System.out.println("3. Exibir");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opcao: ");
		}
		private static void exibirMenu2() {
			System.out.println("==== Menu de Operacoes ====");
			System.out.println("1. Efetuar consulta");
			System.out.println("2. Efetuar Venda");
			System.out.println("3. Voltar para o Menu anterior");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opcao: ");
		}
		private static void exibirMenu3() {
			System.out.println("==== Menu de Exibicao ====");
			System.out.println("1. Exibir consultas marcadas");
			System.out.println("2. Exibir Funcionarios");
			System.out.println("3. Exibir Relatorio de Vendas");
			System.out.println("4. Voltar para o Menu anterior");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opcao: ");
		}

		private static void efetuarConsulta(PetShop petShop, Scanner scanner) {

			System.out.print("Digite o nome do animal: ");
			String nome = scanner.nextLine();
			System.out.print("Digite a idade do animal: ");
			int idade = scanner.nextInt();
			scanner.nextLine(); 
			
			System.out.println("======Cadastro do Dono======");
			System.out.println("----------------------------");
			System.out.print("Nome do dono:");
			String nomed = scanner.nextLine();
			
			System.out.print("CPF: ");
			String cpfd = scanner.nextLine();
			
			System.out.print("WhatsApp ou Telefone: ");
			String whats = scanner.nextLine();
			
			System.out.println("======Endereço======");
			
			System.out.print("Rua: ");
			String ruad = scanner.nextLine();
			
			System.out.print("Bairro: ");
			String bairrod = scanner.nextLine();
			
			System.out.print("Nº: ");
			String numerod = scanner.nextLine();
			
			System.out.print(" Cidade e Estado: (Palmares-PE)");
			String cidadeEsD = scanner.nextLine();
			
			Endereço endereçod = new Endereço(ruad, bairrod, numerod, cidadeEsD);
			Cliente cliente = new Cliente(nomed, cpfd, endereçod, whats);
			System.out.println("-------------------------");
			cliente.fidelidade();
			System.out.println("-------------------------");
			
			System.out.println("1. Cachorro  ");
			System.out.println("2. Chinchila ");
			System.out.println("3. Cobra");
			System.out.println("4. Coelho ");
			System.out.println("5. Furão ");
			System.out.println("6. Gato ");
			System.out.println("7. Hamster ");
			System.out.println("8. Iguana ");
			System.out.println("9. Pato ");
			System.out.println("10. Porquinho da India ");
			System.out.println("11. Desconhecido");
			System.out.print("Qual a especie do animal: ");
			String esp = scanner.nextLine();
			
			
			Animal animal;
			if (esp.equals("1")) {
				String espécie = "Cachorro";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Cachorro(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			} 
			else if (esp.equals("2")) {
				String espécie = "Chinchila";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Chinchila(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}	
			else if (esp.equals("3")) {
				String espécie = "Cobra";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Cobra(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("4")) {
				String espécie = "Coelho";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Coelho(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("5")) {
				String espécie = "Furao";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Furão(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("6")) {
				String espécie = "Gato";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Gato(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			} 

			else if (esp.equals("7")) {
				String espécie = "Hamster";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Hamster(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("8")) {
				String espécie = "Iguana";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Iguana(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("9")) {
				String espécie = "Pato";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Pato(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else if (esp.equals("10")) {
				String espécie = "Proquinho da India";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Porquinho_da_India(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			}
			else {
				String espécie = "Desconhecido";
				System.out.println("Descricao: (Hora marcada, Servico, e Problema)");
				String des = scanner.nextLine();
				animal = new Desconhecido(nome, idade, espécie, des);
				animal.adicionarCliente(cliente);
			} 
			
			
			petShop.adicionarAnimal(animal);
			System.out.println("Consulta realizada com sucesso!");
		}

		private static void adicionarFuncionario(PetShop petShop, Scanner scanner) {
			
			System.out.print("Digite o nome do funcionario: ");
			String nome = scanner.nextLine();
			
			System.out.print("Digite a idade do funcionario: ");
			int idade = scanner.nextInt();
			scanner.nextLine(); // Consumir a nova linha após a leitura do número
			
			System.out.print("Digite o CPF do funcionario: ");
			String cpf = scanner.nextLine();
			
			System.out.print("Digite o telefone do funcionario: ");
			String telefone = scanner.nextLine();
			
			System.out.print("Digite o cargo do funcionario: ");
			String cargo = scanner.nextLine();
			
			System.out.print("Informe o salario do funcionario: ");
			double salario = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Digite o endereco do funcionario (rua): ");
			String rua = scanner.nextLine();
			System.out.print("Digite o endereco do funcionario (bairro): ");
			String bairro = scanner.nextLine();
			System.out.print("Digite o endereco do funcionario (número): ");
			String número = scanner.nextLine();
			System.out.print("Digite o endereco do funcionario (cidade, estado): ");
			String cidadeEstado = scanner.nextLine();

			Endereço endereço = new Endereço(rua, bairro, número, cidadeEstado);
			Funcionario funcionario = new Funcionario(nome, idade, cpf, telefone, endereço, cargo, salario);
			petShop.adicionarFuncionario(funcionario);

			System.out.println("Funcionario adicionado com sucesso!");
		}

		private static void exibirConsulta(PetShop petShop, Scanner scanner) {
			
				System.out.println("Consultas marcadas: ");
				System.out.println("1. Mostrar todas");
				System.out.println("2. Animal especifico");
				System.out.println("3. Sair");
				
				System.out.print("Escolha uma opcao: ");
				String consultaOpcao = scanner.nextLine();
				
				if (consultaOpcao.equals("1")) {
					for (Animal animal : petShop.getAnimais()) {
						System.out.println("--------------------------------------------------------------------");
						System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
						System.out.println("Descricao: " + animal.getDescricao());
						System.out.println("---------------------------------------------------------------------");
						for (Cliente cliente : animal.getClientes()) {
							System.out.println("Nome do dono: " + cliente.getNome());
							System.out.println("CPF: " + cliente.getCpf());
							System.out.println("WhatsApp: " + cliente.getWhatsApp());
							System.out.println("==============Endereço==============");
							
							System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "N: " + cliente.getEndereço().getNumero() + " Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
						}
					}
					System.out.println("--------------------------------------------------------------------");
				}
		
				else if(consultaOpcao.equals("2")) {
					while (true) {
						System.out.println("1. Cachorro  ");
						System.out.println("2. Chinchila ");
						System.out.println("3. Cobra");
						System.out.println("4. Coelho ");
						System.out.println("5. Furão ");
						System.out.println("6. Gato ");
						System.out.println("7. Hamster ");
						System.out.println("8. Iguana ");
						System.out.println("9. Pato ");
						System.out.println("10. Porquinho da India ");
						System.out.println("11. Desconhecido");
						System.out.println("12. Sair");
						System.out.print("Qual consulta deseja acessar: ");
						String esp2 = scanner.nextLine();
						
						if (esp2.equals("1")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Cachorro) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("2")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Chinchila) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("3")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Cobra) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("4")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Coelho) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("5")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Furão) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("6")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Gato) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("7")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Hamster) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
						}
						else if (esp2.equals("8")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Iguana) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}	
						else if (esp2.equals("9")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Pato) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}	
						else if (esp2.equals("10")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Porquinho_da_India) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("11")) {
							for (Animal animal : petShop.getAnimais()) {
								if (animal instanceof Desconhecido) {
								System.out.println("--------------------------------------------------------------------");
								System.out.println("Nome: " + animal.getNome() + " - " + "Especie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
								System.out.println("Descricao: " + animal.getDescricao());
								
								System.out.println("---------------------------------------------------------------------");
								for (Cliente cliente : animal.getClientes()) {
									System.out.println("Nome do dono: " + cliente.getNome());
									System.out.println("CPF: " + cliente.getCpf());
									System.out.println("WhatsApp: " + cliente.getWhatsApp());
									System.out.println("==============Endereço==============");
									
									System.out.println("Rua: " + cliente.getEndereço().getRua() + ", " + "Bairro: " + cliente.getEndereço().getBairro() + ", " + "Nº: " + cliente.getEndereço().getNumero() + "Cidade e Estado: " + cliente.getEndereço().getCidadeEstado());
									}
								}
							}
							System.out.println("--------------------------------------------------------------------");
						}
						else if (esp2.equals("12")) {
							System.out.println("Encerrando programa...");
							break;
						}
						else {
							System.out.println("Opcao inexistente, digite novamente!");	
						}
					}
				}
				else if(consultaOpcao == "3") {
					System.out.println("Retornar ao menu anterior");
					exibirMenu3();
				}
				else if(consultaOpcao == "4") {
					System.out.println("Encerrando programa...");
				
				}
				else {
					System.out.println("Opcao Invalida, por favor digite novamente :");
					exibirConsulta(petShop, scanner);
				}
		}
		
		private static void exibirFuncionarios(PetShop petShop) {
			System.out.println("Funcionarios no Pet Shop:");
			System.out.println("----------------------------------------------");
			for (Funcionario funcionario : petShop.getFuncionarios()) {
				System.out.println("Nome: " + funcionario.getNome() + " - " + "Cargo: " + funcionario.getCargo());
				funcionario.fidelidade();
				System.out.println("----------------------------------------------");
			}
		}
	}