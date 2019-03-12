
public class Campo {
	
	private String nome;
	private String descrizione;
	private Boolean obbligatorio;
	
	public Campo(String _nome, String _descrizione, Boolean _obbligatorio){
		nome=_nome;
		descrizione= _descrizione;
		obbligatorio = _obbligatorio;
	}

	
	
	
	
	
	public String visualizzaCampo(){
		String s= new String("Nome: "+ nome +"\n" +"Descrizione: " + descrizione+ "\n"+ "Obbligatoria: " + obbligatorio +"\n");
		return s;
	}
	
	
	// Getters and Setters generati automaticamente
	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Boolean getObbligatorio() {
		return obbligatorio;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setObbligatorio(Boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}

}
