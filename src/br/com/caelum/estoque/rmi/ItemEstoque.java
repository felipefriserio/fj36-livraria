package br.com.caelum.estoque.rmi;

import java.io.Serializable;

public class ItemEstoque implements Serializable   {

	private static final long serialVersionUID = 34343423L;
	
	private String codigo;
	private Integer quantidade;
	
	public ItemEstoque(String codigo, int quantidade){
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	
	
	
}
