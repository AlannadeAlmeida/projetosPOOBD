import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Perfume")
public class Perfume {
	public int id;
	public int preco;
	public String qualidade;
	public String marca;
	public int idade;
	public Categoria categoria;
	public Fragrancia fragrancia;
	public Classificacao classificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getQualidade() {
		return qualidade;
	}
	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Fragrancia getFragrancia() {
		return fragrancia;
	}
	public void setFragrancia(Fragrancia fragrancia) {
		this.fragrancia = fragrancia;
	}
	public Classificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((classificacao == null) ? 0 : classificacao.hashCode());
		result = prime * result + ((fragrancia == null) ? 0 : fragrancia.hashCode());
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + preco;
		result = prime * result + ((qualidade == null) ? 0 : qualidade.hashCode());
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
		Perfume other = (Perfume) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (classificacao == null) {
			if (other.classificacao != null)
				return false;
		} else if (!classificacao.equals(other.classificacao))
			return false;
		if (fragrancia == null) {
			if (other.fragrancia != null)
				return false;
		} else if (!fragrancia.equals(other.fragrancia))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (preco != other.preco)
			return false;
		if (qualidade == null) {
			if (other.qualidade != null)
				return false;
		} else if (!qualidade.equals(other.qualidade))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Perfume [id=" + id + ", preco=" + preco + ", qualidade=" + qualidade + ", marca=" + marca + ", idade="
				+ idade + ", categoria=" + categoria + ", fragrancia=" + fragrancia + ", classificacao=" + classificacao
				+ "]";
	}
	public Perfume(int id, int preco, String qualidade, String marca, int idade, Categoria categoria,
			Fragrancia fragrancia, Classificacao classificacao) {
		super();
		this.id = id;
		this.preco = preco;
		this.qualidade = qualidade;
		this.marca = marca;
		this.idade = idade;
		this.categoria = categoria;
		this.fragrancia = fragrancia;
		this.classificacao = classificacao;
	}
	
}
