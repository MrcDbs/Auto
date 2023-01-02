package it.auto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dettaglio")
public class Dettaglio {
	private Long id;
	private String colore;
	private Integer km;
	private String interni;
	private Integer cavalli;
	private Float cilindrata;
	private String tipoMotore;
	public Dettaglio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dettaglio(Long id, String colore, Integer km, String interni, Integer cavalli, Float cilindrata,
			String tipoMotore) {
		super();
		this.id = id;
		this.colore = colore;
		this.km = km;
		this.interni = interni;
		this.cavalli = cavalli;
		this.cilindrata = cilindrata;
		this.tipoMotore = tipoMotore;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public Integer getKm() {
		return km;
	}
	public void setKm(Integer km) {
		this.km = km;
	}
	public String getInterni() {
		return interni;
	}
	public void setInterni(String interni) {
		this.interni = interni;
	}
	public Integer getCavalli() {
		return cavalli;
	}
	public void setCavalli(Integer cavalli) {
		this.cavalli = cavalli;
	}
	public Float getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getTipoMotore() {
		return tipoMotore;
	}
	public void setTipoMotore(String tipoMotore) {
		this.tipoMotore = tipoMotore;
	}
	
	
}
