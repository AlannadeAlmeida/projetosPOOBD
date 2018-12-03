import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fragrancia implements Identificavel {
	
	@Id
	public Long id;
	public String fetos;
	public String florais;
	public String citricos;
	public String chipre;
	public String orientais;
	public String couros;
	public String amadeirados;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFetos() {
		return fetos;
	}
	public void setFetos(String fetos) {
		this.fetos = fetos;
	}
	public String getFlorais() {
		return florais;
	}
	public void setFlorais(String florais) {
		this.florais = florais;
	}
	public String getCitricos() {
		return citricos;
	}
	public void setCitricos(String citricos) {
		this.citricos = citricos;
	}
	public String getChipre() {
		return chipre;
	}
	public void setChipre(String chipre) {
		this.chipre = chipre;
	}
	public String getOrientais() {
		return orientais;
	}
	public void setOrientais(String orientais) {
		this.orientais = orientais;
	}
	public String getCouros() {
		return couros;
	}
	public void setCouros(String couros) {
		this.couros = couros;
	}
	public String getAmadeirados() {
		return amadeirados;
	}
	public void setAmadeirados(String amadeirados) {
		this.amadeirados = amadeirados;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amadeirados == null) ? 0 : amadeirados.hashCode());
		result = prime * result + ((chipre == null) ? 0 : chipre.hashCode());
		result = prime * result + ((citricos == null) ? 0 : citricos.hashCode());
		result = prime * result + ((couros == null) ? 0 : couros.hashCode());
		result = prime * result + ((fetos == null) ? 0 : fetos.hashCode());
		result = prime * result + ((florais == null) ? 0 : florais.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orientais == null) ? 0 : orientais.hashCode());
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
		Fragrancia other = (Fragrancia) obj;
		if (amadeirados == null) {
			if (other.amadeirados != null)
				return false;
		} else if (!amadeirados.equals(other.amadeirados))
			return false;
		if (chipre == null) {
			if (other.chipre != null)
				return false;
		} else if (!chipre.equals(other.chipre))
			return false;
		if (citricos == null) {
			if (other.citricos != null)
				return false;
		} else if (!citricos.equals(other.citricos))
			return false;
		if (couros == null) {
			if (other.couros != null)
				return false;
		} else if (!couros.equals(other.couros))
			return false;
		if (fetos == null) {
			if (other.fetos != null)
				return false;
		} else if (!fetos.equals(other.fetos))
			return false;
		if (florais == null) {
			if (other.florais != null)
				return false;
		} else if (!florais.equals(other.florais))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orientais == null) {
			if (other.orientais != null)
				return false;
		} else if (!orientais.equals(other.orientais))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Fragrancia [id=" + id + ", fetos=" + fetos + ", florais=" + florais + ", citricos=" + citricos
				+ ", chipre=" + chipre + ", orientais=" + orientais + ", couros=" + couros + ", amadeirados="
				+ amadeirados + "]";
	}
	public Fragrancia(Long id, String fetos, String florais, String citricos, String chipre, String orientais,
			String couros, String amadeirados) {
		super();
		this.id = id;
		this.fetos = fetos;
		this.florais = florais;
		this.citricos = citricos;
		this.chipre = chipre;
		this.orientais = orientais;
		this.couros = couros;
		this.amadeirados = amadeirados;
	}
}