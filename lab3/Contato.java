package lab3;

public class Contato {
	// ***************** Atributos ****************

	private String nome;

	private String sobrenome;

	private Telephone[] numTelefone;
	
	private final int QTT_TELEFONES = 3;
	
	private int indexTel;
	
	private String amizade;

	// **************** Construtores **********************

	/*
	 * Contrói um contato recebendo uma String que será o nome, outra para o
	 * sobrenome e uma String que recebe um número que será o número de telefone do
	 * contato.
	 */
	public Contato(String nome, String sobrenome, String amizade, String ddd, String codePais, String numero, String tipoTel) {
		numTelefone = new Telephone[QTT_TELEFONES];
		
		if (nome == null || sobrenome == null) {
			throw new NullPointerException();
		
		} else if (nome.trim().length() == 0) {
			throw new IllegalArgumentException();
		
		} else if (sobrenome.trim().length() == 0) {
			throw new IllegalArgumentException();
			
		} else {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.amizade = amizade;
		}
		
		indexTel = 1;
		
		for (int i = 1; i < QTT_TELEFONES; i++) {
			if (i == indexTel) {
				numTelefone[indexTel] = new Telephone(ddd, numero, codePais, tipoTel);
			} 
		}
		
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
		return nome + " " + sobrenome + " - ";
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