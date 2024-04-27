/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

public abstract class Terrestre extends Bilhete implements CalculoIva{
	protected int nrKilometros;
	private char criterio;
	
	public Terrestre(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int nrKilometros) {
		super(codigo, nomeCliente, bi, datapartida, datachegada, valorBilhete, formapagamento);
		this.nrKilometros= nrKilometros;
		this.criterio= 't';
	}
	
	public Terrestre() {
		this(0," "," ",(byte)0,(byte)0,0f,"",0);
	}

	public int getNrKilometros() {
		return nrKilometros;
	}

	public void setNrKilometros(int nrKilometros) {
		this.nrKilometros = nrKilometros;
	}

	@Override
	public String toString() {
		return super.toString()+criterio+"Terrestre [nrKilometros=" + nrKilometros + "]";
	}
	
}
