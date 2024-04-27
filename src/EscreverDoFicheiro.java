/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class EscreverDoFicheiro {
	public EscreverDoFicheiro() {
		
	}
	
	//Metodo para escrever no ficheiro de texto os Bilhetes
	   public void actualizarBilhete(Vector x) {
		try
		{
			Bilhete b;
			Aereo a;
			Carro c;
			Comboio com;
			Mar m;
			
			FileWriter fw = new FileWriter("Dados.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
				b=(Bilhete)x.elementAt(x.size()-1);
				if(b instanceof Aereo)
				{
					a=(Aereo) b;
					bw.newLine();
					bw.write(a.getCodigo()+";"+a.getNomeCliente()+";"+a.getBi()+";"+a.getDatapartida()+";"+a.getDatachegada()+";"+a.getValorBilhete()+";"+a.getFormapagamento()+";"+"A"+";"+a.getQuanmilhas()+";"+a.getNomeCompanhia());	
				}
				else
				{
					if(b instanceof Carro )
					{
						c=(Carro) b;
						bw.newLine();
						bw.write(c.getCodigo()+";"+c.getNomeCliente()+";"+c.getBi()+";"+c.getDatapartida()+";"+c.getDatachegada()+";"+c.getValorBilhete()+";"+c.getFormapagamento()+";"+"T"+";"+c.getNrKilometros()+";"+"C"+";"+c.getMatricula()+";"+c.getQuanCombustivel()+";"+c.getValorPortagem());
					}
					else
					{
						if(b instanceof Mar )
						{
							m=(Mar) b;
							bw.newLine();
							bw.write(m.getCodigo()+";"+m.getNomeCliente()+";"+m.getBi()+";"+m.getDatapartida()+";"+m.getDatachegada()+";"+m.getValorBilhete()+";"+m.getFormapagamento()+";"+"M"+";"+m.getTipoBarco());
						}
						else
						{
							com=(Comboio) b;
							bw.newLine();
							bw.write(com.getCodigo()+";"+com.getNomeCliente()+";"+com.getBi()+";"+com.getDatapartida()+";"+com.getDatachegada()+";"+com.getValorBilhete()+";"+com.getFormapagamento()+";"+"T"+";"+com.getNrKilometros()+";"+"cc"+";"+com.getTipoBilhete());
						}
						
					}
				}
			bw.close();
			JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
			
		}	
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	  }
}
