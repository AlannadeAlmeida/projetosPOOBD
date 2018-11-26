import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class financiamentoloja {
	public int id;
	@ManyToOne
	@JoinColumn(name = "id")
	private Id id1;
	public Financiamento financiamento;
	@ManyToOne
	@JoinColumn(name = "id_financiamento")
	private Financiamento financiamento1;
	public Loja loja;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Financiamento getFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((financiamento == null) ? 0 : financiamento.hashCode());
		result = prime * result + id;
		result = prime * result + ((loja == null) ? 0 : loja.hashCode());
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
		financiamentoloja other = (financiamentoloja) obj;
		if (financiamento == null) {
			if (other.financiamento != null)
				return false;
		} else if (!financiamento.equals(other.financiamento))
			return false;
		if (id != other.id)
			return false;
		if (loja == null) {
			if (other.loja != null)
				return false;
		} else if (!loja.equals(other.loja))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "financiamentoloja [id=" + id + ", financiamento=" + financiamento + ", loja=" + loja + "]";
	}
	public financiamentoloja(int id, Financiamento financiamento, Loja loja) {
		super();
		this.id = id;
		this.financiamento = financiamento;
		this.loja = loja;
	}

}
