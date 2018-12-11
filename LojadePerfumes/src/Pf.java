
public interface Pf {
	
	public Funcionario cadastrarFuncionario(String contrato, long cpf , String nome) throws CPFInvalidoException;
	
	public Cliente cadastrarCliente(String endereco, Long cpf , String rua , String bairro , int numero) throws CPFInvalidoException;
	
	public Perfume entregarPerfumes(String qualidade, Long cpf , String marca , int idade , int preco) throws CPFInvalidoException;
	
	public Perfume tipoPerfumes(String qualidade, Long cpf , String marca , int idade , int preco) throws CPFInvalidoException;
	
	public Financiamento perfumeFianciamento(String conta, Long id) throws IDInvalidoException;
	
	public Funcionario lojaFuncionaro (String contrato, Long cpf , String nome) throws CPFInvalidoException;
	
	public Cliente perfumeCliente (String contrato, Long cpf , String nome) throws CPFInvalidoException;
	
	public Categoria classificacaoCategoria (String perfume, String colonias , String aguadoce , String aguadebanho) throws PERFUMEInvalidoException; 
	
	public Perfume quantidadePerfumes(String qualidade, Long cpf , String marca , int idade , int preco) throws CPFInvalidoException;

	Funcionario cadastrarFuncionario(String contrato, Long cpf, String nome) throws CPFInvalidoException;

	Perfume tipoPerfumes1(String qualidade, Long cpf, String marca, int idade, int preco) throws CPFInvalidoException;

	Funcionario lojaFuncionaro11(String contrato, Long cpf, String nome) throws CPFInvalidoException;

	Cliente perfumeCliente1(String contrato, Long cpf, String nome) throws CPFInvalidoException;

	Perfume quantidadePerfumes1(String qualidade, Long cpf, String marca, int idade, int preco) throws CPFInvalidoException;

	Funcionario cadastrarFuncionario1(String contrato, Long cpf, String nome) throws CPFInvalidoException;
	
	
	
	
}
