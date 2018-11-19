
public class Funcionario {
	public int id;
	public String nome;
	public String contrato;
	public long cpf;
	public Entrega entraga;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Entrega getEntraga() {
		return entraga;
	}
	public void setEntraga(Entrega entraga) {
		this.entraga = entraga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + ((entraga == null) ? 0 : entraga.hashCode());
		result = prime * result + id;
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
		if (entraga == null) {
			if (other.entraga != null)
				return false;
		} else if (!entraga.equals(other.entraga))
			return false;
		if (id != other.id)
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
		return "Funcionario [id=" + id + ", nome=" + nome + ", contrato=" + contrato + ", cpf=" + cpf + ", entraga="
				+ entraga + "]";
	}
	public Funcionario(int id, String nome, String contrato, long cpf, Entrega entraga) {
		super();
		this.id = id;
		this.nome = nome;
		this.contrato = contrato;
		this.cpf = cpf;
		this.entraga = entraga;
	}

	

}
