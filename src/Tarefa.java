/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.filechooser.*;

public class Tarefa {
	private Vector lista;
	
	public Tarefa() {
		lista=new Vector();
	}
	public void ler_ficheiros()
	{
		String nome_cliente,bi,matricula,umaLinha="",nomeCompanhia;
		float valorBilhete,quanCumbustivel,valorPortagem;
		int codigo,numkilometro,quanmilhas;
		byte dataEntrada,dataSaida;
		String formaPagamento,tipoBarco,tipoBilhete;
		char criterio,cri;
		StringTokenizer linha;
		
		 JFileChooser fc= new JFileChooser();
		 FileNameExtensionFilter filter1= new FileNameExtensionFilter("*.txt,*.dat","dat","txt");
		 fc.setFileFilter(filter1);
		 fc.setCurrentDirectory(new File (System.getProperty("user.dir")));
			
		int i= fc.showOpenDialog(null);
		if(i==JFileChooser.APPROVE_OPTION) 
		{
			try
			{
				FileReader fr= new FileReader(fc.getSelectedFile().getPath());
				BufferedReader k= new BufferedReader(fr);							
				umaLinha=k.readLine();
	
				while(umaLinha!=null) 
				{
					linha=new StringTokenizer(umaLinha,";");
					codigo=Integer.parseInt(linha.nextToken());
					nome_cliente=linha.nextToken();
					bi=linha.nextToken();
					dataEntrada=Byte.parseByte(linha.nextToken());
					dataSaida=Byte.parseByte(linha.nextToken());
					valorBilhete=Float.parseFloat(linha.nextToken());
					formaPagamento=linha.nextToken();
					criterio=linha.nextToken().charAt(0);
					if(criterio=='T')
					{
						numkilometro=Integer.parseInt(linha.nextToken());
						cri=linha.nextToken().charAt(0);
						if(cri=='C')
						{
							matricula=linha.nextToken();
							quanCumbustivel=Float.parseFloat(linha.nextToken());
							valorPortagem=Float.parseFloat(linha.nextToken());
							criarObjectoCarro(codigo, nome_cliente, bi, dataEntrada, dataSaida, valorBilhete, formaPagamento, numkilometro,matricula, quanCumbustivel, valorPortagem);
						}
						else
						{
							tipoBilhete=linha.nextToken();
							criarObjectoComboio(codigo, nome_cliente, bi, dataEntrada, dataSaida, valorBilhete, formaPagamento, numkilometro, tipoBilhete);
						}
					}
					else
					{
						if(criterio=='A')
						{
							quanmilhas=Integer.parseInt(linha.nextToken());
							nomeCompanhia=linha.nextToken();
							criarObjectoAereo(codigo, nome_cliente, bi, dataEntrada, dataSaida, valorBilhete, formaPagamento,quanmilhas, nomeCompanhia);
						}
						else
						{
							tipoBarco=linha.nextToken();
							criarObjectoMar(codigo, nome_cliente, bi, dataEntrada, dataSaida, valorBilhete, formaPagamento, tipoBarco);
						}
					}	
					umaLinha= k.readLine();
			}	
				JOptionPane.showMessageDialog(null,"Dados lidos");
				k.close();
		 }catch(NumberFormatException ee) {JOptionPane.showMessageDialog(null,ee.getMessage());}
		  catch(IOException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
		  catch(Exception ex) {ex.printStackTrace();}
	  }
	}
	
	
	//Metodo para criar o objecto Carro
	public void criarObjectoCarro(int codigo, String nome_cliente, String bi, byte dataEntrada, byte dataSaida, float valorBilhete, String formaPagamento,int nrKilometros, String matricula, float quanCumbustivel, float valorPortagem) {
		Carro c= new Carro();
		c.setCodigo(codigo);
		c.setNomeCliente(nome_cliente);
		c.setBi(bi);
		c.setDatachegada(dataEntrada);
		c.setDatapartida(dataSaida);
		c.setValorBilhete(valorBilhete);
		c.setFormapagamento(formaPagamento);
		c.setNrKilometros(nrKilometros);
		c.setMatricula(matricula);
		c.setQuanCombustivel(quanCumbustivel);
		c.setValorPortagem(valorPortagem);
		lista.addElement(c);
		lista.trimToSize();
	}
	
	//Metodo para criar Objecto Comboio
	public void criarObjectoComboio(int codigo, String nome_cliente, String bi, byte dataEntrada, byte dataSaida, float valorBilhete, String formaPagamento,int nrKilometros, String tipobilhete) {
		Comboio cc= new Comboio();
		cc.setCodigo(codigo);
		cc.setNomeCliente(nome_cliente);
		cc.setBi(bi);
		cc.setDatachegada(dataEntrada);
		cc.setDatapartida(dataSaida);
		cc.setValorBilhete(valorBilhete);
		cc.setFormapagamento(formaPagamento);
		cc.setTipoBilhete(tipobilhete);
		cc.setNrKilometros(nrKilometros);
		lista.addElement(cc);
		lista.trimToSize();
	}
	
	//Metodo para criar Objecto Aereo
	public void criarObjectoAereo(int codigo, String nome_cliente, String bi, byte dataEntrada, byte dataSaida, float valorBilhete, String formaPagamento, int quanmilhas, String nomeCompanhia) {
		Aereo a= new Aereo();
		a.setCodigo(codigo);
		a.setNomeCliente(nome_cliente);
		a.setBi(bi);
		a.setDatachegada(dataEntrada);
		a.setDatapartida(dataSaida);
		a.setValorBilhete(valorBilhete);
		a.setFormapagamento(formaPagamento);
		a.setQuanmilhas(quanmilhas);
		a.setNomeCompanhia(nomeCompanhia);
		lista.addElement(a);
		lista.trimToSize();
	}
	
	//Metodo para criar Objecto Mar
	public void criarObjectoMar(int codigo, String nome_cliente, String bi, byte dataEntrada, byte dataSaida, float valorBilhete, String formaPagamento, String tipoBarco) {
		Mar m= new Mar();
		m.setCodigo(codigo);
		m.setNomeCliente(nome_cliente);
		m.setBi(bi);
		m.setDatachegada(dataEntrada);
		m.setDatapartida(dataSaida);
		m.setValorBilhete(valorBilhete);
		m.setFormapagamento(formaPagamento);
		m.setTipoBarco(tipoBarco);
		lista.addElement(m);
		lista.trimToSize();
	}
	
	
	public void adapBilhete()
	{
		Janela_Bilhete jb=new Janela_Bilhete(lista);	
		
	}
	
	
	//Metodo adaptador para ler do ficheiro de objecto
	public void adapLerFicheiroObjecto() {
		Ler_FichObj lerObj= new Ler_FichObj();
		lerObj.ler_fichero_obj(lista);
	}
	
	//Metodo adaptador para escrever no ficheiro de objecto
	public void adapEscreverficheiroObjecto() {
		Ler_FichObj esc= new Ler_FichObj();
		esc.gravarFichObj(lista);
	}
	
	//Metodo adaptador para pesquisar um bilhete pelo codigo
	
	
	
	
	//Metodo adaptador para alterar quantidade de milhas do bilhete aereo 

	//Metodo adaptador para calcular o total recebido pela empresa
	public void adapCalculoTotal() {
		Calculo cal= new Calculo();
		float total= cal.calcularTotal(lista);
	}
	
	/// novos adaptadores
	public void adaplogin()
	{
		Ler_dados_Users udr=new Ler_dados_Users();
		udr.users(lista);
		JanelaLogin  login=new JanelaLogin();
		login.criarJanela(lista);
	}
	

	public void retorno() {
		 
		new Janela_Todos(lista);
		
	}
	public void VisualizarEsta()
	{
		new Estatistica_TaB(lista);
	}
	
	public void pes()
	{
		JanelaPesquisarBilhete bn=new JanelaPesquisarBilhete();
		bn.inicalizacao(lista); 
	}
	
}

