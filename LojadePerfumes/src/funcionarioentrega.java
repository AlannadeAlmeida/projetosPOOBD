import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class funcionarioentrega implements Identificavel{
	
	@Id
	public Long id;
	@ManyToOne
	@JoinColumn(name = "id")
	private Id id1;
	public Funcionario funcionario;
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario1;
	public Entrega entrega;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Id getId1() {
		return id1;
	}
	public void setId1(Id id1) {
		this.id1 = id1;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Funcionario getFuncionario1() {
		return funcionario1;
	}
	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entrega == null) ? 0 : entrega.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((funcionario1 == null) ? 0 : funcionario1.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id1 == null) ? 0 : id1.hashCode());
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
		funcionarioentrega other = (funcionarioentrega) obj;
		if (entrega == null) {
			if (other.entrega != null)
				return false;
		} else if (!entrega.equals(other.entrega))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (funcionario1 == null) {
			if (other.funcionario1 != null)
				return false;
		} else if (!funcionario1.equals(other.funcionario1))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id1 == null) {
			if (other.id1 != null)
				return false;
		} else if (!id1.equals(other.id1))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "funcionarioentrega [id=" + id + ", id1=" + id1 + ", funcionario=" + funcionario + ", funcionario1="
				+ funcionario1 + ", entrega=" + entrega + "]";
	}
	public funcionarioentrega(Long id, Id id1, Funcionario funcionario, Funcionario funcionario1, Entrega entrega) {
		super();
		this.id = id;
		this.id1 = id1;
		this.funcionario = funcionario;
		this.funcionario1 = funcionario1;
		this.entrega = entrega;
	}
}