/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

public class Mar extends Bilhete {
	private String tipoBarco;
	private char criterio;
	public static int ContMar= 0;
	public Mar(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int quanmilhas) {
		super(codigo, nomeCliente, bi, datapartida, datachegada, valorBilhete, formapagamento);
		this.tipoBarco= tipoBarco;
		this.criterio= 'm';
		ContMar++;
	}
	
	public Mar() {
		this(0,"","",(byte)0,(byte)0,0f,"",' ');
	}

	public String getTipoBarco() {
		return tipoBarco;
	}

	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	@Override
	public String toString() {
		return super.toString()+criterio+"Mar [tipoBarco=" + tipoBarco + "]";
	}
	
}
