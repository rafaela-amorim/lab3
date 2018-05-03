package lab3;

public class Contato {
	// ***************** Atributos ****************
	
	/**
	 * nome			- String que armazena o primeiro nome do contato.
	 * sobrenome	- String que armazena o sobrenome do contato.
	 * numTelefone 	- String que armazena o número de telefone do contato.
	 */
	private String nome;

	private String sobrenome;

	private String numTelefone;

	// **************** Construtores **********************

	/**
	 * Contrói um contato recebendo uma String que será o nome, outra para o
	 * sobrenome e uma String que recebe um número que será o número de telefone do
	 * contato.
	 * 
	 * @param nome
	 *            Nome do contato
	 * @param sobrenome
	 *            Sobrenome do contato
	 * @param numero
	 *            Número de telefone do contato
	 */
	public Contato(String nome, String sobrenome, String numero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		numTelefone = numero;
	}

	// **************** Métodos *********************

	/**
	 * Método que retorna o nome, sobrenome e o telefone do contato no formato: NOME
	 * SOBRENOME - 34567890
	 * 
	 * @return Retorna uma String com as informações do contato.
	 */
	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + numTelefone;
	}

	/**
	 * Método que retorna uma String com o nome e o sobrenome do contato separados
	 * por espaço.
	 * 
	 * @return String com as informações do contato.
	 */
	public String getContato() {
		return nome + " " + sobrenome;
	}
}