/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.*;

public class LerDoTeclado {
	private EscreverDoFicheiro es;
	private Validacoes val;
	//Metodo Adaptador
	public LerDoTeclado() {}
	
	
	//Metodo para criar um novo Objecto Carro de um bilhete 
	public void carro(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int nrKilometros, String matricula, float quanCombustivel, float valorPortagem,Vector x)
	{
		Carro c=new Carro();
		c.setCodigo(codigo);
		c.setDatachegada(datachegada);
		c.setFormapagamento(formapagamento);
		c.setMatricula(matricula);
		c.setNomeCliente(nomeCliente);
		c.setNrKilometros(nrKilometros);
		c.setQuanCombustivel(quanCombustivel);
		c.setValorBilhete(valorBilhete);
		c.setValorPortagem(valorPortagem);
		c.setBi(bi);
		x.addElement(c);
		x.trimToSize();
		
		
	}
	
	//Metodo para criar um novo Objecto Comboio de um bilhete
	public void comboio(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int nrKilometros, String tipoBilhete,Vector x){
		Comboio com=new Comboio();
		com.setCodigo(codigo);
		com.setDatachegada(datachegada);
		com.setDatapartida(datapartida);
		com.setFormapagamento(formapagamento);
		com.setNomeCliente(nomeCliente);
		com.setNrKilometros(nrKilometros);
		com.setTipoBilhete(tipoBilhete);
		com.setValorBilhete(valorBilhete);
		com.setBi(bi);
		x.addElement(com);
		x.trimToSize();
		
	}
	
	//Metodo para criar um novo Objecto Aereo de um bilhete 
	public void aereo(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento, int quanmilhas, String nomeCompanhia,Vector x){
		Aereo a= new Aereo();
		a.setCodigo(codigo);
		a.setBi(bi);
		a.setDatachegada(datachegada);
		a.setDatapartida(datapartida);
		a.setFormapagamento(formapagamento);
		a.setNomeCliente(nomeCliente);
		a.setNomeCompanhia(nomeCompanhia);
		a.setQuanmilhas(quanmilhas);
		a.setValorBilhete(valorBilhete);
		x.addElement(a);
		x.trimToSize();
		
		
	}
	
	//Metodo para criar um novo Objecto Mar de um bilhete 
	public void mar(int codigo, String nomeCliente, String bi, byte datapartida, byte datachegada, float valorBilhete, String formapagamento,String tipoBarco,Vector x){
		Mar m=new Mar();
		m.setCodigo(codigo);
		m.setDatachegada(datachegada);
		m.setDatapartida(datapartida);
		m.setFormapagamento(formapagamento);
		m.setNomeCliente(nomeCliente);
		m.setNomeCliente(nomeCliente);
		m.setTipoBarco(tipoBarco);
		m.setValorBilhete(valorBilhete);
		m.setBi(bi);
		x.addElement(m);
		x.trimToSize();
		
	}
}
