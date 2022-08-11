package application.model;

public class Equipamento {
	
	/*{"Computador", "Celular", "Tablet",
	"Televisor", "Eletrodomesticos", "Notebook"};*/
	
	public String nome_equipamento;
	public String tipo_equipamento;
	public String descricao_defeito;
	public String tipo_defeito;
	public String rg;
	/**
	 * @return the nome_equipamento
	 */
	public String getNome_equipamento() {
		return nome_equipamento;
	}
	/**
	 * @param nome_equipamento the nome_equipamento to set
	 */
	public void setNome_equipamento(String nome_equipamento) {
		this.nome_equipamento = nome_equipamento;
	}
	/**
	 * @return the tipo_equipamento
	 */
	public String getTipo_equipamento() {
		return tipo_equipamento;
	}
	/**
	 * @param tipo_equipamento the tipo_equipamento to set
	 */
	public void setTipo_equipamento(String tipo_equipamento) {
		this.tipo_equipamento = tipo_equipamento;
	}
	/**
	 * @return the descricao_defeito
	 */
	public String getDescricao_defeito() {
		return descricao_defeito;
	}
	/**
	 * @param descricao_defeito the descricao_defeito to set
	 */
	public void setDescricao_defeito(String descricao_defeito) {
		this.descricao_defeito = descricao_defeito;
	}
	/**
	 * @return the tipo_defeito
	 */
	public String getTipo_defeito() {
		return tipo_defeito;
	}
	/**
	 * @param tipo_defeito the tipo_defeito to set
	 */
	public void setTipo_defeito(String tipo_defeito) {
		this.tipo_defeito = tipo_defeito;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

}
