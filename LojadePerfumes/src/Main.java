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
	}
	
}