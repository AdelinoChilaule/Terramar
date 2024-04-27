/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/
import java.text.DecimalFormat;
import java.util.*;
public class Janela_aereo 
{
	private String sub_titulos[]= {"Codigo","Nome Cliente","BI","Data Partidada","Data Chegada","Valor Bilhete","Forma de Pagamento","Milhas","Nome Companhia"};
	
	public Janela_aereo() {
		
	}
	public String[][] criarTabela(Vector lista)
	  {  
		DecimalFormat mt= new DecimalFormat("###,###,###.00 Mt");
		int h=0;
		  Bilhete b;
		  Aereo a;
	  	  String [][] x=new String[Aereo.ContAereo][sub_titulos.length];
	  	for(int i=0;i<lista.size();i++)
	  	{
	  		
	  	    b=(Bilhete)lista.elementAt(i);
	  		if(b instanceof Aereo)
	  		{
		
	  				a=(Aereo)b;
	  	  			x[h][0]=a.getCodigo()+"";
	  	  	  		x[h][1]=a.getNomeCliente()+"";
	  	  	  		x[h][2]=a.getBi()+"";
	  	  	  		x[h][3]=a.getDatapartida()+"";
	  	  	  		x[h][4]=a.getDatachegada()+"";
	  	  	  		x[h][5]=mt.format(a.getValorBilhete())+"";
	  	  	  		x[h][6]=a.getFormapagamento()+"";
	  	  	  		x[h][7]=a.getQuanmilhas()+"";
	  	  	  		x[h][8]=a.getNomeCompanhia()+"";	
	  	  	  	h++;
	  		}
	
	  	}
	  	return x;
	  }

}
