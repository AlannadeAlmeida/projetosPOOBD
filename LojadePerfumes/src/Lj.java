import java.util.ArrayList;

public class Lj implements Pf  {

	@Override
	public Funcionario cadastrarFuncionario(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		Funcionario funcionario = new Funcionario (); 
		DAO<Funcionario> daoO= new DAO<Funcionario>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Cliente cadastrarCliente(String endereco, long cpf, String rua, String bairro, int numero) throws CPFInvalidoException {
		Cliente cliente = new Cliente (); 
		DAO<Cliente> daoX = new DAO<Cliente>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}
	@Override
	public Perfume entregarPerfumes(String qualidade, long cpf, String marca, int idade, int preco) throws CPFInvalidoException {
		Perfume perfume = new Perfume ();
		DAO<Perfume> daoP = new DAO<Perfume>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Perfume tipoPerfumes(String qualidade, long cpf, String marca, int idade, int preco) throws CPFInvalidoException {
		Perfume perfume = new Perfume ();
		DAO<Perfume> daoP = new DAO<Perfume>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
		
	}

	@Override
	public Financiamento perfumeFianciamento(String conta, Long id) throws IDInvalidoException {
		Financiamento financiamento = new Financiamento ();
		DAO<Financiamento> daoK = new DAO<Financiamento>();
		if(id == null) {
			throw new IDInvalidoException();
		}
		return null;
	}

	@Override
	public Funcionario lojaFuncionaro(String contrato, long cpf, String nome) throws CPFInvalidoException {
		Funcionario funcionario = new Funcionario (); 
		DAO<Funcionario> daoO= new DAO<Funcionario>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Cliente perfumeCliente(String contrato, long cpf, String nome) throws CPFInvalidoException {
		Cliente cliente = new Cliente (); 
		DAO<Cliente> daoX = new DAO<Cliente>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Categoria classificacaoCategoria(String perfume, String colonias, String aguadoce, String aguadebanho)throws PERFUMEInvalidoException {
		Categoria categoria = new Categoria (); 
		DAO<Categoria> daoC = new DAO<Categoria>();
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
		return null;
	}

	@Override
	public Perfume quantidadePerfumes(String qualidade, long cpf, String marca, int idade, int preco)
			throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario cadastrarFuncionario(String contrato, long cpf, String nome) throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	

}
