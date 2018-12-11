
public class Lj implements Pf  {

	@Override
	public Funcionario cadastrarFuncionario(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		if(cpf == null || cpf==0) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Cliente cadastrarCliente(String endereco, Long cpf, String rua, String bairro, int numero) throws CPFInvalidoException {
		//Cliente cliente = new Cliente (); 
		//DAO<Cliente> daoX = new DAO<Cliente>();
		//if(cpf == null) {
			//throw new CPFInvalidoException();
		//}
		//return null;
	//}
		    boolean cpfInvalido = false;
			if (cpfInvalido) {
		        System.out.println("cpf invalido");
		    } else {
		        Cliente cliente = new Cliente();
		        long cpf1 = 0;
				cliente.setCpf(cpf1);
		        return cliente;
		    }
			return null;
		}
	
	@Override
	public Perfume entregarPerfumes(String qualidade, Long cpf, String marca, int idade, int preco) throws CPFInvalidoException {
		if(cpf == null || cpf==0) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Perfume tipoPerfumes1(String qualidade, Long cpf, String marca, int idade, int preco) throws CPFInvalidoException {
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
		
	}

	@Override
	public Financiamento perfumeFianciamento(String conta, Long id) throws IDInvalidoException {
		if(id == null) {
			throw new IDInvalidoException();
		}
		return null;
	}

	public Funcionario lojaFuncionaro11(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		if(cpf == null || cpf==0) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Cliente perfumeCliente1(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		if(cpf == null) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Categoria classificacaoCategoria(String perfume, String colonias, String aguadoce, String aguadebanho)throws PERFUMEInvalidoException {
		if(perfume == null) {
			throw new PERFUMEInvalidoException();
		}
		return null;
	}

	@Override
	public Perfume quantidadePerfumes1(String qualidade, Long cpf, String marca, int idade, int preco) throws CPFInvalidoException {
		if(cpf == null || cpf==0) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	public Funcionario cadastrarFuncionario1(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		if(cpf == null || cpf==0) {
			throw new CPFInvalidoException();
		}
		return null;
	}

	@Override
	public Funcionario cadastrarFuncionario(String contrato, long cpf, String nome) throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfume tipoPerfumes(String qualidade, Long cpf, String marca, int idade, int preco)
			throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario lojaFuncionaro(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente perfumeCliente(String contrato, Long cpf, String nome) throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfume quantidadePerfumes(String qualidade, Long cpf, String marca, int idade, int preco)
			throws CPFInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
