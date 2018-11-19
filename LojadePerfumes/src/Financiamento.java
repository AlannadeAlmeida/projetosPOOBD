import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Financiamento")
public class Financiamento {
	public int id;
	public long conta;
	public String empresa;
	public Cliente cliente;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getConta() {
		return conta;
	}
	public void setConta(long conta) {
		this.conta = conta;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + (int) (conta ^ (conta >>> 32));
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
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
		Financiamento other = (Financiamento) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (conta != other.conta)
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Financiamento [id=" + id + ", conta=" + conta + ", empresa=" + empresa + ", cliente=" + cliente + "]";
	}
	public Financiamento(int id, long conta, String empresa, Cliente cliente) {
		super();
		this.id = id;
		this.conta = conta;
		this.empresa = empresa;
		this.cliente = cliente;
	}
	
}
