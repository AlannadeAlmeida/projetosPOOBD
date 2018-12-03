public class Main {

	public static void main(String[] args) {
		DAO<Loja> dao = new DAO<Loja>();
		Loja p = new Loja();
		p.setId(22l);
		p.setNome("J'aime le parfum");
		dao.save(p);
		Loja p2 = new Loja();
		p2.setId(23l);
		p2.setNome("SCENTEC FRAGR NCIAS");
		dao.save(p2);
		Loja find = (Loja) dao.find(Loja.class, 22l);
		System.out.println(find.getNome());
		
		
		DAO<Perfume> dao = new DAO<Perfume>();
		Perfume p = new Perfume();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Categiria> dao = new DAO<Categiria>();
		Categiria p = new Categiria();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Classificacao> dao = new DAO<Classificacao>();
		Classificacao p = new Classificacao();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Cliente> dao = new DAO<Cliente>();
		Cliente p = new Cliente();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Entrega> dao = new DAO<Entrega>();
		Entrega p = new Entrega();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Fragrancia> dao = new DAO<Fragrancia>();
		Fragrancia p = new Fragrancia();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Empresa> dao = new DAO<Empresa>();
		Empresa p = new Empresa();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Funcionario> dao = new DAO<Funcionario>();
		Funcionario p = new Funcionario();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
		
		DAO<Financiamento> dao = new DAO<Financiamento>();
		Financiamento p = new Financiamento();
		p.setId(22l);
		p.setNome("");
		dao.save(p);
	}
	
}
