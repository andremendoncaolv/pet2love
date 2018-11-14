package br.com.pet2love.model;

public enum EspecieAnimal {
	
	CAO("C", "CÃO"),
	GATO("G", "GATO");
	
	private String sigla;
	private String descricao;
	
	EspecieAnimal(String sigla, String descricao){
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
