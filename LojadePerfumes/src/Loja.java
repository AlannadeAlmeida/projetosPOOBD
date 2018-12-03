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
	private  Loja loja;

	@ManyToOne
	@JoinColumn(name="id_perfume")
	private Perfume perfume;
	
	

	@ManyToOne
	@JoinColumn(name="id_financiamento")
	private Financiamento financiamento;
	@ManyToOne
	@JoinColumn(name="id_funcionario")
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
	public Financiamento getFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
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
		Loja other = (Loja) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}