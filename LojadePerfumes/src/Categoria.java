import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements Identificavel {

	@Id
	public Long id;
	public String perfume;
	public String colonias;
	public String aguadoce;
	public String aguadebanho;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerfume() {
		return perfume;
	}

	public void setPerfume(String perfume) {
		this.perfume = perfume;
	}

	public String getColonias() {
		return colonias;
	}

	public void setColonias(String colonias) {
		this.colonias = colonias;
	}

	public String getAguadoce() {
		return aguadoce;
	}

	public void setAguadoce(String aguadoce) {
		this.aguadoce = aguadoce;
	}

	public String getAguadebanho() {
		return aguadebanho;
	}

	public void setAguadebanho(String aguadebanho) {
		this.aguadebanho = aguadebanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aguadebanho == null) ? 0 : aguadebanho.hashCode());
		result = prime * result + ((aguadoce == null) ? 0 : aguadoce.hashCode());
		result = prime * result + ((colonias == null) ? 0 : colonias.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfume == null) ? 0 : perfume.hashCode());
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
		Categoria other = (Categoria) obj;
		if (aguadebanho == null) {
			if (other.aguadebanho != null)
				return false;
		} else if (!aguadebanho.equals(other.aguadebanho))
			return false;
		if (aguadoce == null) {
			if (other.aguadoce != null)
				return false;
		} else if (!aguadoce.equals(other.aguadoce))
			return false;
		if (colonias == null) {
			if (other.colonias != null)
				return false;
		} else if (!colonias.equals(other.colonias))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (perfume == null) {
			if (other.perfume != null)
				return false;
		} else if (!perfume.equals(other.perfume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", perfume=" + perfume + ", colonias=" + colonias + ", aguadoce=" + aguadoce
				+ ", aguadebanho=" + aguadebanho + "]";
	}

	
}
