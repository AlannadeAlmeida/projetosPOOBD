import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Classificacao")
public class Classificacao {
	public int id;
	public String base;
	public String cabe�a;
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
	public String getCabe�a() {
		return cabe�a;
	}
	public void setCabe�a(String cabe�a) {
		this.cabe�a = cabe�a;
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
		result = prime * result + ((cabe�a == null) ? 0 : cabe�a.hashCode());
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
		if (cabe�a == null) {
			if (other.cabe�a != null)
				return false;
		} else if (!cabe�a.equals(other.cabe�a))
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
		return "Classificacao [id=" + id + ", base=" + base + ", cabe�a=" + cabe�a + ", corpo=" + corpo + "]";
	}
	public Classificacao(int id, String base, String cabe�a, String corpo) {
		super();
		this.id = id;
		this.base = base;
		this.cabe�a = cabe�a;
		this.corpo = corpo;
	}
	
}
