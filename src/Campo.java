
/**
 * Classe che definisce un <i>Campo</i>.
 *
 * Un campo possiede le seguenti caratterisitiche:
 * nome;
 * descrizione;
 * obbligatoriet� del campo;
 *
 * @author Gabriele Manenti
 *
 * @version 1.0 1 Febbraio 2019
 *
 */
public class Campo {

	/*Attributi*/
	private String nome;
	private String descrizione;
	private Boolean obbligatorio;

	/*Costruttori*/
	/**
	 * Un campo e' costituito da nome, descrizione, obbligatoriet� e valore riguardante una caratteristica di un evento:
	 *
	 * @param _nome nome del campo
	 * @param _descrizione descrizione del campo
	 * @param _obbligatorio obbligatoriet� del campo
	 *
	 * @author Gabriele Manenti
	 */
	public Campo(String _nome, String _descrizione, Boolean _obbligatorio){
		nome=_nome;
		descrizione= _descrizione;
		obbligatorio = _obbligatorio;
	}

	/*Getters*/
	/**
	 * Ritorna il nome del Campo
	 * @return nome del campo
	 *
	 * @author Gabriele Manenti
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Ritorna la descrizione del Campo
	 * @return descrizione del campo
	 *
	 * @author Gabriele Manenti
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * Ritorna l'obbligatoriet� del Campo
	 * @return se un campo � obbligatorio o meno
	 *
	 * @author Gabriele Manenti
	 */
	public Boolean getObbligatorio() {
		return obbligatorio;
	}

	/*Setters*/
	/**
	 * Metodo che imposta il nome del Campo.
	 *
	 * @param nome il nome del campo
	 *
	 * @author Gabriele Manenti
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo che imposta la descrizione del Campo.
	 *
	 * @param descrizione la descrizione del campo
	 *
	 * @author Gabriele Manenti
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * Metodo che imposta l'obbligatoriet� di un Campo.
	 *
	 * @param obbligatorio l'obbligatoriet� del campo
	 *
	 * @author Gabriele Manenti
	 */
	public void setObbligatorio(Boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}


	/*Metodi*/
	/**
	 * Ritorna una stringa che descrive il campo
	 *
	 * @return info le informazioni relative ad un campo
	 *
	 * @author Gabriele Manenti
	 */
	public String visualizzaCampo(){
		String info= new String("Nome: "+ nome +"\n" +"Descrizione: " + descrizione+ "\n"+ "Obbligatoria: " + obbligatorio +"\n");
		return info;
	}
}
