package lab3;

public class Agenda {
	// ***************** Atributos ****************

	private Contato[] listaDeContatos;

	private final int MAX = 105;

	// **************** Construtores **********************

	/**
	 * Esse construtor cria um objeto Agenda com uma lista vazia de contatos e
	 * tamanho fixo de 105 posições.
	 */
	public Agenda() {
		listaDeContatos = new Contato[MAX];
	}

	// **************** Métodos *********************

	/**
	 * Método que recebe um inteiro que será a posição do contato, Strings com nome,
	 * sobrenome e o telefone do contato para o cadastro. Se for dada uma posição
	 * inválida, o método retorna false, do contrário, o método cadastra o contato
	 * na lista e retorna true.
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

		if (posicao > 101 || posicao < 1) {
			return false;
		} else {
			listaDeContatos[posicao] = new Contato(nome, sobrenome, numero);
			return true;
		}
	}

	/**
	 * Método que retorna uma String do contato com nome, sobrenome e número de
	 * telefone caso a poisção dada seja válida, senão, será retornada uma String com uma mensagem alertando o usuário.
	 * 
	 * @param posicao
	 *            Inteiro com a posição do contato no array
	 * @return String com as informações do contato especificado, ou mensagem de alerta de posição inválida.
	 */
	public String exibirContato(int posicao) {
		if (posicao > 101 || posicao < 1) {
			return "POSIÇÃO INVÁLIDA";
		} else {
			return listaDeContatos[posicao].toString();
		}
	}

	/**
	 * Esse método percorre o array de contatos, verifica se na posição tem um
	 * contato armazenado e concatena na String de retorno, listagemContatos, a sua
	 * posição, nome e sobrenome.
	 * 
	 * @return String com os contatos armazenados no array e suas respectivas
	 *         posições.
	 */
	public String listarContatos() {
		String listagemContatos = "";

		for (int i = 0; i < MAX; i++) {
			if (listaDeContatos[i] != null) {
				listagemContatos += i + " - " + listaDeContatos[i].getContato() + System.lineSeparator();
			}
		}

		return listagemContatos;
	}
}