package it.auto.model;

public class AutomobileDto {
	
		    public Long id;
		    public String marca;
		    public String modello;
		    public Integer anno;
		    public String targa;
		    public String foto;
		    public DettaglioDto dettagli;
		    
		    
			public AutomobileDto() {
				super();
				// TODO Auto-generated constructor stub
			}
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
			public String getFoto() {
				return foto;
			}
			public void setFoto(String foto) {
				this.foto = foto;
			}
			public DettaglioDto getDettagli() {
				return dettagli;
			}
			public void setDettagli(DettaglioDto dettagli) {
				this.dettagli = dettagli;
			}
		    
		    
		  
}