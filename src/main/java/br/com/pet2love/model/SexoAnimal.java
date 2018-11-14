package br.com.pet2love.model;

public enum SexoAnimal {

	FEMEA("F", "FÊMEA"),
	MACHO("M", "MACHO");
	
	private String sigla;
	private String descricao;
	
	SexoAnimal(String sigla, String descricao) {
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
