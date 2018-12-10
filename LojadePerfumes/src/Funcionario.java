import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario implements Identificavel{
	
	@Id
	public Long id;
	public String nome;
	public String contrato;
	public long cpf;
	@ManyToOne
	@JoinColumn(name="id_cpf")
	private Funcionario funcionario1;
	@ManyToOne
	@JoinColumn(name="id_etrega")
	public Entrega entrega;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Funcionario getFuncionario1() {
		return funcionario1;
	}
	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}
	public Entrega getEntraga() {
		return entrega;
	}
	public void setEntraga(Entrega entraga) {
		this.entrega = entraga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + ((entrega == null) ? 0 : entrega.hashCode());
		result = prime * result + ((funcionario1 == null) ? 0 : funcionario1.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (cpf != other.cpf)
			return false;
		if (entrega == null) {
			if (other.entrega != null)
				return false;
		} else if (!entrega.equals(other.entrega))
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", contrato=" + contrato + ", cpf=" + cpf
				+ ", funcionario1=" + funcionario1 + ", entraga=" + entrega + "]";
	}
	
}
