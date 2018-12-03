import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loja implements Identificavel {
	
	@Id
	public Long id;
	public String nome;
	public String rua;
	public String bairro;
	public String endereco;
	@ManyToOne
	@JoinColumn(name="id_endereco")
	private  Loja loja1;
	public Perfume perfume;
	@ManyToOne
	@JoinColumn(name="id_perfume")
	private Perfume perfume1;
	public Financiamento financiamento;
	@ManyToOne
	@JoinColumn(name="id_financiamento")
	private Financiamento financiamento1;
	public Funcionario funcionario;
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
	public Loja getLoja1() {
		return loja1;
	}
	public void setLoja1(Loja loja1) {
		this.loja1 = loja1;
	}
	public Perfume getPerfume() {
		return perfume;
	}
	public void setPerfume(Perfume perfume) {
		this.perfume = perfume;
	}
	public Perfume getPerfume1() {
		return perfume1;
	}
	public void setPerfume1(Perfume perfume1) {
		this.perfume1 = perfume1;
	}
	public Financiamento getFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
	}
	public Financiamento getFinanciamento1() {
		return financiamento1;
	}
	public void setFinanciamento1(Financiamento financiamento1) {
		this.financiamento1 = financiamento1;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((financiamento == null) ? 0 : financiamento.hashCode());
		result = prime * result + ((financiamento1 == null) ? 0 : financiamento1.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((loja1 == null) ? 0 : loja1.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((perfume == null) ? 0 : perfume.hashCode());
		result = prime * result + ((perfume1 == null) ? 0 : perfume1.hashCode());
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
		if (financiamento1 == null) {
			if (other.financiamento1 != null)
				return false;
		} else if (!financiamento1.equals(other.financiamento1))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (loja1 == null) {
			if (other.loja1 != null)
				return false;
		} else if (!loja1.equals(other.loja1))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (perfume == null) {
			if (other.perfume != null)
				return false;
		} else if (!perfume.equals(other.perfume))
			return false;
		if (perfume1 == null) {
			if (other.perfume1 != null)
				return false;
		} else if (!perfume1.equals(other.perfume1))
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
		return "Loja [id=" + id + ", nome=" + nome + ", rua=" + rua + ", bairro=" + bairro + ", endereco=" + endereco
				+ ", loja1=" + loja1 + ", perfume=" + perfume + ", perfume1=" + perfume1 + ", financiamento="
				+ financiamento + ", financiamento1=" + financiamento1 + ", funcionario=" + funcionario + "]";
	}
}