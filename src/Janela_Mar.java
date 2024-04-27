/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.text.DecimalFormat;
import java.util.*;
public class Janela_Mar 
{
	private String sub_titulos[]= {"Codigo","Nome Cliente","BI","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","Tipo Barco"};
	//Metodo Construtor
  public Janela_Mar()
  {
  }
//Metodo que preenche a tabela com os 
  public String[][] criarTabelaMAR(Vector lista)
  {   
	  DecimalFormat mt= new DecimalFormat("###,###,###.00 Mt");
	  int h=0;
	  Bilhete b;
	  Mar m;
  	  String [][] x= new String[Mar.ContMar][sub_titulos.length];
  	for(int i=0;i<lista.size();i++)
  	{
  		
  	    b=(Bilhete)lista.elementAt(i);
  		if(b instanceof Mar)
  		{				 
	       	 m=(Mar)b;
	       	 x[h][0]=m.getCodigo()+"";
	       	 x[h][1]=m.getNomeCliente();
	       	 x[h][2]=m.getBi()+"";
	       	 x[h][3]=m.getDatapartida()+"";	
	       	 x[h][4]=m.getDatachegada()+"";
	       	 x[h][5]=mt.format(m.getValorBilhete())+"";
	       	 x[h][6]=m.getFormapagamento();
	       	 x[h][7]= m.getTipoBarco();
  	  	  	h++;
  		}
  		
  		
  	}
  	return x;
  }
}