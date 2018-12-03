import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Financiamento implements Identificavel{
	
	@Id
	public Long id;
	public long conta;
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
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
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}