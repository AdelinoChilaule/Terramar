/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/
import java.text.DecimalFormat;
import java.util.*;
public class Janela_comboio 
{
	private String sub_titulos[]= {"Codigo","Nome Cliente","BI","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","Kilometros","Tipo Bilhete"}; 

	public Janela_comboio() {
		
	}
	 public String[][] criarTabela(Vector lista)
     {
		 DecimalFormat mt= new DecimalFormat("###,###,###.00 Mt");
    	 int h=0;
    	 Comboio c;
    	 Bilhete b;
    	 String x[][]=new String[Comboio.ContComboio][sub_titulos.length];
    	 
    	 for(int i=0;i<lista.size();i++)
    	 {
    		 b=(Bilhete)lista.elementAt(i);
    		 if(b instanceof Comboio)
    		 {
    			 c=(Comboio)b;
    			 x[h][0]=c.getCodigo()+"";
    			 x[h][1]=c.getNomeCliente()+"";
    			 x[h][2]=c.getBi()+"";
    			 x[h][3]=c.getDatapartida()+"";
    			 x[h][4]=c.getDatachegada()+"";
    			 x[h][5]=mt.format(c.getValorBilhete())+"";
    			 x[h][6]=c.getFormapagamento()+"";
    			 x[h][7]=c.getNrKilometros()+"Km";
    			 x[h][8]=c.getTipoBilhete()+"";
    			 h++;
    		 }
    	
    	 }
    	return x; 
     }

}
