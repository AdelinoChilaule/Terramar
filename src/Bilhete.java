 /*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;

public class Bilhete implements Serializable{
	protected int codigo;
	protected String nomeCliente,bi; 
	protected byte datapartida;
	protected byte datachegada;
	protected float valorBilhete;
	protected String formapagamento;
	
	public Bilhete(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento) {
		this.codigo= codigo;
		this.nomeCliente= nomeCliente;
		this.bi= bi;
		this.datapartida= datapartida;
		this.datachegada= datachegada;
		this.valorBilhete= valorBilhete;
		this.formapagamento= formapagamento;
	}
	
	public Bilhete() {
		this(0,"","",(byte)0,(byte)0,0f,"");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getBi() {
		return bi;
	}

	public void setBi(String bi) {
		this.bi = bi;
	}

	public byte getDatapartida() {
		return datapartida;
	}

	public void setDatapartida(byte datapartida) {
		this.datapartida = datapartida;
	}

	public byte getDatachegada() {
		return datachegada;
	}

	public void setDatachegada(byte datachegada) {
		this.datachegada = datachegada;
	}

	public float getValorBilhete() {
		return valorBilhete;
	}

	public void setValorBilhete(float valorBilhete) {
		this.valorBilhete = valorBilhete;
	}

	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}

	@Override
	public String toString() {
		return  codigo+";"+nomeCliente+";"+bi + ";"+ datapartida + ";" + datachegada + ";" + valorBilhete + ";"
				+ formapagamento;
	}
	
}
