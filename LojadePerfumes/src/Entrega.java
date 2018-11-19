
public class Entrega {
	public int id;
	public String frete;
	public String correio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrete() {
		return frete;
	}
	public void setFrete(String frete) {
		this.frete = frete;
	}
	public String getCorreio() {
		return correio;
	}
	public void setCorreio(String correio) {
		this.correio = correio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correio == null) ? 0 : correio.hashCode());
		result = prime * result + ((frete == null) ? 0 : frete.hashCode());
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
		Entrega other = (Entrega) obj;
		if (correio == null) {
			if (other.correio != null)
				return false;
		} else if (!correio.equals(other.correio))
			return false;
		if (frete == null) {
			if (other.frete != null)
				return false;
		} else if (!frete.equals(other.frete))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Entrega [id=" + id + ", frete=" + frete + ", correio=" + correio + "]";
	}
	public Entrega(int id, String frete, String correio) {
		super();
		this.id = id;
		this.frete = frete;
		this.correio = correio;
	}
	
	

}
