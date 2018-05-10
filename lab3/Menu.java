package lab3;

import java.util.Scanner;

public class Menu {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean keepGoing = true;
		
		char action;
		
		Agenda agenda = new Agenda();
		
		int posicao;
		
		String nome;
		
		String sobrenome;
		
		String telefone;
		
		
		while (keepGoing) {
			
			System.out.println("(C)adastrar Contato" + System.lineSeparator() +
							   "(L)istar Contatos" + System.lineSeparator() +
							   "(E)xibir Contato" + System.lineSeparator() +
							   "(S)air" + System.lineSeparator());
								
			System.out.println("Opção> ");
			action = input.next().toUpperCase().charAt(0);
			
			switch (action) {
				
				case 'C':
					System.out.println("Posição: ");
					posicao = input.nextInt();
					input.nextLine();

					System.out.println("Nome: ");
					nome = input.nextLine();
					
					System.out.println("Sobrenome: ");
					sobrenome = input.nextLine();
					
					System.out.println("Telefone: ");
					telefone = input.nextLine();
					
					if (agenda.cadastrarContato(posicao, nome, sobrenome, telefone)) {
						System.out.println("CADASTRO REALIZADO!\n" + "\n" + "");
					} else {
						System.out.println("POSIÇÃO INVÁLIDA!");
					}
					
					break;
					
				case 'S':
					keepGoing = false;
					break;
				
				case 'E':
					System.out.println("Contato> ");
					posicao = input.nextInt();
					input.nextLine();
					System.out.println(agenda.exibirContato(posicao));
					break;
				
				case 'L':
					System.out.println(agenda.listarContatos());
					break;
				
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
			}
		}

	}

}
