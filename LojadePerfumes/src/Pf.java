import java.util.ArrayList;

public interface Pf {
	
	public Funcionario funcionario(Cliente cliente, Loja loja);
	
	public ArrayList<Cliente> compra(Cliente cliente);
	
	public Entrega entrega (Cliente cliente, Perfume perfume);
	
	public Perfume perfume (Classificacao cassificacao, Fragrancia fragrancia);
	
	public ArrayList<Financiamento> financia (Loja loja, Perfume perfume);
	
	public ArrayList<Funcionario> trabalaham(Loja loja);
	
	public ArrayList<Cliente>compram(Perfume perfume);
	
	
}
