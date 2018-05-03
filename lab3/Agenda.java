package lab3;

public class Agenda {
	// ***************** Atributos ****************

	/**
	 * listaDeContatos - Array que irá armazenar os contatos cadastrados.
	 * MAX			   - Int com o tamanho máximo que o array de contatos pode ter.
	 */
	private Contato[] listaDeContatos;

	private final int MAX = 105;

	// **************** Construtores **********************

	/**
	 * Esse construtor cria um objeto Agenda com uma lista vazia de contatos e
	 * tamanho fixo de 100 posições.
	 */
	public Agenda() {
		listaDeContatos = new Contato[MAX];
	}

	// **************** Métodos *********************

	/**
	 * documentacxaoo
	 * 
	 * @param posicao
	 *            Inteiro que diz a posição escolhida no array para o novo contato.
	 * @param nome
	 *            Nome do contato
	 * @param sobrenome
	 *            Sobrenome do contato
	 * @param numero
	 *            Número de telefone do contato.
	 *            
	 * @return Retorna um booleano que será true, caso a posição seja válida, e
	 *         false caso contrário.
	 */
	public boolean cadastrarContato(int posicao, String nome, String sobrenome, String numero) {

		if (posicao < 101 && posicao > 0) {
			listaDeContatos[posicao] = new Contato(nome, sobrenome, numero);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que retorna uma String do contato com nome, sobrenome e número de
	 * telefone.
	 * 
	 * @param posicao
	 *            Inteiro com a posição do contato no array
	 * @return String com as informações do contato especificado.
	 */
	public String exibirContato(int posicao) {
		return listaDeContatos[posicao].toString();
	}

	/**
	 * Esse método percorre o array de contatos, verifica se na posição tem um
	 * contato armazenado e concatena na String de retorno, listagemContatos, a sua
	 * posição, nome e sobrenome.
	 * 
	 * @return String com os contatos armazenados no array e suas respectivas posições.
	 */
	public String listarContatos() {
		String listagemContatos = "";

		for (int i = 0; i < MAX; i++) {
			if (listaDeContatos[i] != null) {
				listagemContatos += (i + 1) + " - " + listaDeContatos[i].getContato() + System.lineSeparator();
			}
		}

		return listagemContatos;
	}
}
