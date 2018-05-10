package lab3;

public class Telephone {
	// ***************** Atributos ****************

	private String ddd;

	private String numero;

	private String codePais;

	private String tipoTel;

	// **************** Construtores **********************

	/**
	 * Construtor de Telephone, recebe três Strings que serão, respectivamente, o
	 * ddd, o numero e o código do País.
	 * 
	 * @param ddd
	 *            código ddd do número
	 * @param numero
	 *            número de telefone
	 * @param codePais
	 *            código do país do número.
	 * @param tipoTel
	 *            tipo do número, pode ser: casa, celular ou trabalho, escrito em
	 *            caixa alta.
	 */
	public Telephone(String ddd, String numero, String codePais, String tipoTel) {

		if (ddd == null || numero == null || codePais == null || tipoTel == null) {
			throw new NullPointerException();

		} else if (ddd.trim().length() == 0) {
			throw new IllegalArgumentException();

		} else if (numero.trim().length() == 0) {
			throw new IllegalArgumentException();

		} else if (codePais.trim().length() == 0) {
			throw new IllegalArgumentException();

		} else if (tipoTel.trim().length() == 0) {
			throw new IllegalArgumentException();

		} else {
			this.ddd = ddd;
			this.numero = numero;
			this.codePais = codePais;
			this.tipoTel = tipoTel.toUpperCase();
		}

	}

	/**
	 * Construtor de Telephone que recebe apenas o número do telefone e, por padrão,
	 * põe ddd, codePais e tipoTel como "--".
	 * 
	 * @param numero
	 *            número de telefone
	 */
	public Telephone(String numero) {
		this("--", numero, "--", "--");
	}

	// **************** Métodos *********************

	/**
	 * Método que retorna o ddd do número.
	 * 
	 * @return String que contém o ddd.
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Método que retorna o número de telefone.
	 * 
	 * @return String que contém o número de telefone.
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Método que retorna o código do País do número.
	 * 
	 * @return String que contém o código do País.
	 */
	public String getCodePais() {
		return codePais;
	}

	/**
	 * Método que retorna o tipo do número: casa, celular ou trabalho.
	 * 
	 * @return String com o tipo do telefone.
	 */
	public String getTipoTel() {
		return tipoTel;
	}

	/**
	 * Método que retorna uma string que contém, respectivamente, o código do país,
	 * o ddd e o número de telefone. A String vem no formato: +00 11 12345789 (+cód
	 * País ddd telefone)
	 * 
	 * @return String com as informações do telefone, exceto o tipo de número.
	 */
	@Override
	public String toString() {
		return "+" + codePais + " " + ddd + " " + numero;
	}

}
