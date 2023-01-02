package it.auto.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="automobile")
public class Automobile {
	private Long id;
	private String marca;
	private String modello;
	private Integer anno;
	private String targa;
	private Dettaglio dettaglio;
	
	
	
	public Automobile() {}
	
	public Automobile(Long id, String marca, String modello, Integer anno, String targa, Dettaglio dettaglio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.targa = targa;
		this.dettaglio = dettaglio;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	@OneToOne
	public Dettaglio getDettaglio() {
		return dettaglio;
	}
	public void setDettaglio(Dettaglio dettaglio) {
		this.dettaglio = dettaglio;
	}
	
	
	
}
