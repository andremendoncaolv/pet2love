package br.com.pet2love.model;

public enum RacaGato {

	ANGORA_GATO("ANGORA", "ANGORA"),
	BRITISH_GATO("BRITISH SHORTHAIR", "BRITISH SHORTHAIR"),
	HIMALAIA_GATO("HIMALAIA", "HIMALAIA"),
	MAINECONN_GATO("MAINE CONN", "MAINE CONN"),
	PERSA_GATO("PERSA", "PERSA"),
	RAGDOLL_GATO("RAGDOLL", "RAGDOLL"),
	SIAMES_GATO("SIAMES", "SIAMÊS"),
	SIBERIANO_GATO("SIBERIANO", "SIBERIANO"),
	SPHYNX_GATO("SPHYNX", "SPHYNX"),
	OUTROS("OUTROS", "OUTROS");
	
	private String sigla;
	private String descricao;
	
	RacaGato(String sigla, String descricao){
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
