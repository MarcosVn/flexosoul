package br.com.fatec.web.classes;

import java.util.List;

public class Orcamento {
	private List<Produto> produtos;
	private double valorEstimado;
	
	
	/**
	 * 
	 * @param produtos
	 * @return
	 */
	private double calculaValorEstimado(List<Produto> produtos) {
		for (Produto produto : produtos) {
			this.valorEstimado += produto.getPreco();
		}
		return this.valorEstimado;
	}
}
