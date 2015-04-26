package br.com.flexosoul.model;
/**
 * 
 * @author marcos
 *
 */
public enum ProdutoTipo {
	ETIQUETA_TERMICA("Etiqueta Térmica"), 
	ETIQUETA_COLANTE("Etiqueta Colante"), 
	ROTULO("Rótulo");
	
	private String produtoTipo;
	
	private ProdutoTipo(String produtoTipo) {
		this.produtoTipo = produtoTipo;
	}
	
	public String getEnum() {
		return this.produtoTipo;
	}
	
	
}
