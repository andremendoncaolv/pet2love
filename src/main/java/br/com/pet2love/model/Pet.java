package br.com.pet2love.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "PET", schema = "MYPET")
public class Pet implements Serializable{

	private static final long serialVersionUID = 8538286187848914352L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PET_ID")
	private Long id;
	
	@Column(name = "NOME_DONO")
	private String nomeDono;
	
	@Column(name = "NOME_ANIMAL")
	private String nomeAnimal;
	
	@Column(name = "ESPECIE_ANIMAL")
	@NotNull
	@Enumerated(EnumType.STRING)
	private EspecieAnimal especieAnimal;
	
	@Column(name = "IDADE_ANIMAL")
	private Integer idadeAnimal;
	
	@Column(name = "SEXO_ANIMAL")
	@NotNull
	@Enumerated(EnumType.STRING)
	private SexoAnimal sexoAnimal;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DATA_CADASTRO")
	private Calendar dataCriacao = Calendar.getInstance();
	
	@Column(name = "RACA")
	@Enumerated(EnumType.STRING)
	private Raca raca;
	
	@Column(name = "RACA_GATO")
	@Enumerated(EnumType.STRING)
	private RacaGato racagGato;
	
	public Pet() {
		super();
	}
	
	public Pet(Long id, String nomeDono, String nomeAnimal, String especieAnimal,
			String raca, Integer idadeAnimal, String sexoAnimal, String endereco,
			String email) {
		super();
		this.id = id;
		this.nomeDono = nomeDono;
		this.nomeAnimal = nomeAnimal;
		this.especieAnimal = getEspecieAnimal();
		this.sexoAnimal = getSexoAnimal();
		this.idadeAnimal = idadeAnimal;
		this.endereco = endereco;
		this.email = email;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public EspecieAnimal getEspecieAnimal() {
		return especieAnimal;
	}

	public void setEspecieAnimal(EspecieAnimal especieAnimal) {
		this.especieAnimal = especieAnimal;
	}

	public Integer getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(Integer idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public SexoAnimal getSexoAnimal() {
		return sexoAnimal;
	}

	public void setSexoAnimal(SexoAnimal sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}

	public RacaGato getRacagGato() {
		return racagGato;
	}

	public void setRacagGato(RacaGato racagGato) {
		this.racagGato = racagGato;
	}
	
}
