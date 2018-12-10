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
		
		
		DAO<Perfume> daoP = new DAO<Perfume>();
		Perfume q = new Perfume();
		q.setId(22l);
		q.setMarca("");
		daoP.save(q);
		
		DAO<Categoria> daoC = new DAO<Categoria>();
		Categoria b = new Categoria();
		b.setId(22l);
		b.setColonias("");
		daoC.save(b);
		
		DAO<Classificacao> daoD = new DAO<Classificacao>();
		Classificacao s = new Classificacao();
		s.setId(22l);
		s.setBase("");
		daoD.save(s);
		
		DAO<Cliente> daoX = new DAO<Cliente>();
		Cliente f = new Cliente();
		f.setId(22l);
		f.setEndereco("");
		daoX.save(f);
		
		DAO<Entrega> daoJ = new DAO<Entrega>();
		Entrega d = new Entrega();
		d.setId(22l);
		d.setFrete("");
		daoJ.save(d);
		
		DAO<Fragrancia> daoS = new DAO<Fragrancia>();
		Fragrancia r = new Fragrancia();
		r.setId(22l);
		r.setFetos("");
		daoS.save(r);
		
		DAO<Empresa> daoL = new DAO<Empresa>();
		Empresa w = new Empresa();
		w.setId(22l);
		w.setNome("");
		daoL.save(w);
		
		DAO<Funcionario> daoO= new DAO<Funcionario>();
		Funcionario g = new Funcionario();
		g.setId(22l);
		g.setNome("");
		daoO.save(g);
		
		DAO<Financiamento> daoK = new DAO<Financiamento>();
		Financiamento a = new Financiamento();
		a.setId(22l);
		a.setConta("");
		daoK.save(a);
	}
	
}
