import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Financiamento implements Identificavel{
	
	@Id
	public Long id;
	public long conta;
	public String empresa;
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa1;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	public Cliente cliente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Empresa getEmpresa1() {
		return empresa1;
	}
	public void setEmpresa1(Empresa empresa1) {
		this.empresa1 = empresa1;
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
		result = prime * result + ((empresa1 == null) ? 0 : empresa1.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (empresa1 == null) {
			if (other.empresa1 != null)
				return false;
		} else if (!empresa1.equals(other.empresa1))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Financiamento [id=" + id + ", conta=" + conta + ", empresa=" + empresa + ", empresa1=" + empresa1
				+ ", cliente=" + cliente + "]";
	}
	public Financiamento(Long id, long conta, String empresa, Empresa empresa1, Cliente cliente) {
		super();
		this.id = id;
		this.conta = conta;
		this.empresa = empresa;
		this.empresa1 = empresa1;
		this.cliente = cliente;
	}
}