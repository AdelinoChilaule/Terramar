/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

public final class Carro extends Terrestre{
	private String matricula;
	private float quanCombustivel;
	private float valorPortagem;
	private char criterio;
	public static int ContCarro= 0;
	
	public Carro(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int nrKilometros, String matricula, float quanCombustivel, float valorPortagem) {
		super(codigo, nomeCliente, bi, datapartida, datachegada, valorBilhete, formapagamento, nrKilometros);
		this.matricula= matricula;
		this.quanCombustivel= quanCombustivel;
		this.valorPortagem= valorPortagem;
		this.criterio= 'c';
		ContCarro++;
	}
	
	public Carro() {
		this(0,"","",(byte)0,(byte)0,0f,"",0, "", 0f, 0f);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getQuanCombustivel() {
		return quanCombustivel;
	}

	public void setQuanCombustivel(float quanCombustivel) {
		this.quanCombustivel = quanCombustivel;
	}

	public float getValorPortagem() {
		return valorPortagem;
	}

	public void setValorPortagem(float valorPortagem) {
		this.valorPortagem = valorPortagem;
	}
	
	//Metodo para calcular o valor do bilhete com o iva
	public float calcularValor(){
		return ((valorBilhete*TAXAIVA)+valorBilhete+valorPortagem);
		
	}
	
	//Metodo para calcular o valor do iva do bilhete
	public float caltotalIVa() {
		return ((valorBilhete*TAXAIVA));
	}

	@Override
	public String toString() {
		return super.toString()+criterio+"Carro [matricula=" + matricula + ", quanCombustivel=" + quanCombustivel + ", valorPortagem="
				+ valorPortagem + "]";
	}
	
	
}
