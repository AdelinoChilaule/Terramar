/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

public final class Comboio extends Terrestre{
	private String tipoBilhete;
	private char criterio;
	public static int ContComboio= 0;
	
	public Comboio(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int nrKilometros, char tipoilhete) {
		super(codigo, nomeCliente, bi, datapartida, datachegada, valorBilhete, formapagamento, nrKilometros);
		this.tipoBilhete= tipoBilhete;
		this.criterio= 'r';
		ContComboio++;
	}
	
	public Comboio() {
		this(0,"","",(byte)0,(byte)0,0f,"",0,' ');
	}

	public String getTipoBilhete() {
		return tipoBilhete;
	}

	public void setTipoBilhete(String tipoBilhete) {
		this.tipoBilhete = tipoBilhete;
	}
	
	//Metodo para calcular o valor do bilhete com o iva
	public float calcularValor() {
		return ((valorBilhete*TAXAIVA)+valorBilhete)-(DESCONTO*((valorBilhete*TAXAIVA)+valorBilhete));
	}
	
	//Metodo para calcular o valor do iva do bilhete
	public float caltotalIVa(){
		return (valorBilhete*TAXAIVA);
	}

	@Override
	public String toString() {
		return super.toString()+criterio+"Comboio [tipoBilhete=" + tipoBilhete + "]";
	}
	
}
