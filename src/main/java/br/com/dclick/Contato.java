/**
 * 
 */
package br.com.dclick;

/**
 * @author lucas.oliveira
 * 
 */
public class Contato {

	/**
	 * 
	 */
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nome;

	private String celular;

	private String email;

	private String twitter;

	private String facebook;

	/**
	 * @param nome
	 * @param celular
	 * @param email
	 * @param twitter
	 * @param facebook
	 */
	public Contato(final String nome, final String celular, final String email, final String twitter,
			final String facebook) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.email = email;
		this.twitter = twitter;
		this.facebook = facebook;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 *            the celular to set
	 */
	public void setCelular(final String celular) {
		this.celular = celular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @return the twitter
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * @param twitter
	 *            the twitter to set
	 */
	public void setTwitter(final String twitter) {
		this.twitter = twitter;
	}

	/**
	 * @return the facebook
	 */
	public String getFacebook() {
		return facebook;
	}

	/**
	 * @param facebook
	 *            the facebook to set
	 */
	public void setFacebook(final String facebook) {
		this.facebook = facebook;
	}

}
