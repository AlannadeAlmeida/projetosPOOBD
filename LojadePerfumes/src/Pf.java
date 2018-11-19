import java.util.ArrayList;

public interface Pf {
	
	public Funcionario funcionario(Cliente cliente, Loja loja);
	
	public ArrayList<Cliente> compra(Cliente cliente);
	
	public ArrayList<Entrega> perfumes (Cliente cliente);
	
	public Perfume perfume (Classificacao cassificacao, Fragrancia fragrancia);
	
	public ArrayList<Financiamento> financia (Loja loja, Perfume perfume);
	
	public ArrayList<Funcionario> trabalaham(Loja loja);
	
	public ArrayList<Cliente>compram(Perfume perfume);
	
	public Financiamento financiamento (Cliente cliente,Loja loja);
	
	public Categoria categoria(Perfume perfume);
	
	public ArrayList<Perfume> quantidade(Loja loja);
	
	
}
