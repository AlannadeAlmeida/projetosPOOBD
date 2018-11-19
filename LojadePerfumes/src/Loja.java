import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Loja")
public class Loja {
	public int id;
	public String rua;
	public String bairro;
	public String endereco;
	public Perfume perfume;
	public Financiamento financiamento;
	public Funcionario funcionario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Perfume getPerfume() {
		return perfume;
	}
	public void setPerfume(Perfume perfume) {
		this.perfume = perfume;
	}
	public Financiamento getFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
	}
	public Funcionario getFunciomario() {
		return funcionario;
	}
	public void setFunciomario(Funcionario funciomario) {
		this.funcionario = funciomario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((financiamento == null) ? 0 : financiamento.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + id;
		result = prime * result + ((perfume == null) ? 0 : perfume.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Loja other = (Loja) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (financiamento == null) {
			if (other.financiamento != null)
				return false;
		} else if (!financiamento.equals(other.financiamento))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (id != other.id)
			return false;
		if (perfume == null) {
			if (other.perfume != null)
				return false;
		} else if (!perfume.equals(other.perfume))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Loja [id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", endereco=" + endereco + ", perfume="
				+ perfume + ", financiamento=" + financiamento + ", funciomario=" + funcionario + "]";
	}
	public Loja(int id, String rua, String bairro, String endereco, Perfume perfume, Financiamento financiamento,
			Funcionario funciomario, Funcionario funcionario) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.endereco = endereco;
		this.perfume = perfume;
		this.financiamento = financiamento;
		this.funcionario = funcionario;
	}
	
	
	
}
