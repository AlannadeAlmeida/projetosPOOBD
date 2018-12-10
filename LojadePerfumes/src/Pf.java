
public interface Pf {
	
	public Funcionario cadastrarFuncionario(String contrato, long cpf , String nome) throws CPFInvalidoException;
	
	public Cliente cadastrarCliente(String endereco, long cpf , String rua , String bairro , int numero) throws CPFInvalidoException;
	
	public Perfume entregarPerfumes(String qualidade, long cpf , String marca , int idade , int preco) throws CPFInvalidoException;
	
	public Perfume tipoPerfumes(String qualidade, long cpf , String marca , int idade , int preco) throws CPFInvalidoException;
	
	public Financiamento perfumeFianciamento(String conta, Long id) throws IDInvalidoException;
	
	public Funcionario lojaFuncionaro (String contrato, long cpf , String nome) throws CPFInvalidoException;
	
	public Cliente perfumeCliente (String contrato, long cpf , String nome) throws CPFInvalidoException;
	
	public Categoria classificacaoCategoria (String perfume, String colonias , String aguadoce , String aguadebanho) throws PERFUMEInvalidoException; 
	
	public Perfume quantidadePerfumes(String qualidade, long cpf , String marca , int idade , int preco) throws CPFInvalidoException;

	Funcionario cadastrarFuncionario(String contrato, Long cpf, String nome) throws CPFInvalidoException;
	
	
	
	
}
