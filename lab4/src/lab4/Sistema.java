package lab4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Rafaela de Amorim - 117.210.299
 *
 */
public class Sistema {
	// **************** Atributos *********************
	private HashSet<Aluno> alunos;

	private HashSet<GrupoEstudo> grupos;

	// **************** Construtor *********************

	public Sistema() {
		alunos = new HashSet<>();
		grupos = new HashSet<>();
	}

	// **************** Métodos *********************

	/**
	 * Método que cadastra alunos no sistema. Os alunos são identificados pela
	 * matrícula e só podem ser cadastrados uma vez, o método retorna uma String
	 * contendo uma mensagem dizendo que essa matrícula já existe no sistema. Senão,
	 * é retornada uma mensagem de êxito.
	 * 
	 * @param matricula
	 *            Matrícula do ALuno
	 * @param nome
	 *            Nome do Aluno
	 * @param curso
	 *            Curso do Aluno
	 * @return Retorna uma mensagem que contém uma mensagem que diz se o aluno foi
	 *         cadastrado ou se ele já existe no sistema.
	 */
	public String cadastraAluno(String matricula, String nome, String curso) {
		// fazer try catches ??
		Aluno auxiliar = new Aluno(matricula, nome, curso);
		if (!(alunos.add(auxiliar))) {
			return "MATRÍCULA JÁ CADASTRADA!";
		} else {
			return "CADASTRO REALIZADO!";
		}
	}

	public String buscaAluno(String matricula) { // olhar isso com calma
		for (Aluno aux: alunos) {
			
		}
	}

	/**
	 * Método que cadastra grupos de estudo no Sistema. O conjunto de grupos não
	 * cadastrará dois grupos considerados iguais, se o cadastro for concluído com
	 * êxito será retornada uma mensagem confirmando o cadastro, senão, será
	 * retornada uma mensagem que diz que já existe um grupos no conjutno com as
	 * mesma especificações.
	 * 
	 * @param nome
	 *            Nome do Grupo
	 * @param tema
	 *            Tema do Grupo
	 * @return Retorna uma mensagem que diz se o grupo foi cadastrado ou se ele já
	 *         existe no sistema.
	 */
	public String cadastraGrupo(String nome, String tema) {
		GrupoEstudo auxiliar = new GrupoEstudo(nome, tema);
		if (!(grupos.add(auxiliar))) {
			return "GRUPO JÁ CADASTRADO!";
		} else {
			return "CADASTRO REALIZADO!";
		}
	}

	public void alocaAlunoEmGrupo(String mat, String nomeGrupo) {
		/// aaah tem q ver iterador ou sla
	}
}
