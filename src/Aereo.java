/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/


public class Aereo extends Bilhete{
	private int quanmilhas;
	private String nomeCompanhia;
	public static int ContAereo= 0;
	
	public Aereo(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int quanmilhas, String NomeCompanhia) {
		super(codigo, nomeCliente, bi, datapartida, datachegada, valorBilhete, formapagamento);
		this.quanmilhas= quanmilhas;
		this.nomeCompanhia= nomeCompanhia;
		ContAereo++;
	}
	
	public Aereo() {
		this(0,"","",(byte)0,(byte)0,0f,"",0, "");
	}

	public int getQuanmilhas() {
		return quanmilhas;
	}

	public void setQuanmilhas(int quanmilhas) {
		this.quanmilhas = quanmilhas;
	}

	public String getNomeCompanhia() {
		return nomeCompanhia;
	}

	public void setNomeCompanhia(String nomeCompanhia) {
		this.nomeCompanhia = nomeCompanhia;
	}

	@Override
	public String toString() {
		return super.toString()+";" + quanmilhas + ";" + nomeCompanhia;
	}
	
	
}
