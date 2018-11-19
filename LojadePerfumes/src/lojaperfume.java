
public class lojaperfume {
	public int id;
	public Loja loja;
	public Perfume perfume;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	public Perfume getPerfume() {
		return perfume;
	}
	public void setPerfume(Perfume perfume) {
		this.perfume = perfume;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((loja == null) ? 0 : loja.hashCode());
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
		lojaperfume other = (lojaperfume) obj;
		if (id != other.id)
			return false;
		if (loja == null) {
			if (other.loja != null)
				return false;
		} else if (!loja.equals(other.loja))
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
		return "lojaperfume [id=" + id + ", loja=" + loja + ", perfume=" + perfume + "]";
	}
	public lojaperfume(int id, Loja loja, Perfume perfume) {
		super();
		this.id = id;
		this.loja = loja;
		this.perfume = perfume;
	}

}
