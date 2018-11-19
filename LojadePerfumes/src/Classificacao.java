import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Classificacao")
public class Classificacao {
	public int id;
	public String base;
	public String cabeça;
	public String corpo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getCabeça() {
		return cabeça;
	}
	public void setCabeça(String cabeça) {
		this.cabeça = cabeça;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((cabeça == null) ? 0 : cabeça.hashCode());
		result = prime * result + ((corpo == null) ? 0 : corpo.hashCode());
		result = prime * result + id;
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
		Classificacao other = (Classificacao) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (cabeça == null) {
			if (other.cabeça != null)
				return false;
		} else if (!cabeça.equals(other.cabeça))
			return false;
		if (corpo == null) {
			if (other.corpo != null)
				return false;
		} else if (!corpo.equals(other.corpo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Classificacao [id=" + id + ", base=" + base + ", cabeça=" + cabeça + ", corpo=" + corpo + "]";
	}
	public Classificacao(int id, String base, String cabeça, String corpo) {
		super();
		this.id = id;
		this.base = base;
		this.cabeça = cabeça;
		this.corpo = corpo;
	}
	
}
