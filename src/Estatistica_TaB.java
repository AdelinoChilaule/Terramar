/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Estatistica_TaB  extends JFrame
{
	private JTable tabelaquant,tabVoo,tabcalculos;
	private JScrollPane scroll,scrol1,scrol2;
	private JTabbedPane tp;
	private String [][]quant, maiorVoo,calculos;
	private String titulosAereo[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","Quantidade Milhas","Nome Companhia"};
	private String titulosTotais[]= {"Total Carro","Total Comboio","Total Aereo","Total Mar","Total Recebido","Total Iva"};
	private String titulos_Totais[]= {"Quantidade Carro","Quantidade Comboio","Quantidade Aereo","Quantidade Mar","Quantidade Total"};

	
	private Container cont;
	private JPanel painelquant,painelVOO,painelCalculos;
	
	
	public Estatistica_TaB(Vector lista)
	{
		
		    	super("Janela_Todos");
		    	
		    	cont=getContentPane();
		    	tp = new JTabbedPane ();
		    	
		    	painelquant=new JPanel();
		    	painelVOO=new JPanel();
		    	painelCalculos=new JPanel();
		    	
		    	painelquant.setLayout(new BorderLayout());
		    	painelVOO.setLayout(new BorderLayout());
		    	painelCalculos.setLayout(new BorderLayout());
		    	
		    	JanelaCalculos cl=new JanelaCalculos();
		    	JanelaQuantidades jq=new JanelaQuantidades();
		    	JanelaMaiorVoo jm=new JanelaMaiorVoo();
		    	MaiorVoo mv=new MaiorVoo();
		    	
		    	calculos=cl.criarCalculos(lista);
		    	quant=jq.criarQuant(lista);
		    	int i=mv.acharMaiorVoo(lista);
		    	maiorVoo=jm.criarTabelaMaiorVoo(lista, i);
		    	
		    	tabelaquant=new  JTable(quant,titulos_Totais);
		    	scroll=new JScrollPane(tabelaquant);
		    	painelquant.add(scroll,BorderLayout.CENTER);
		    	
		    	tabVoo=new  JTable(maiorVoo,titulosAereo);
		    	scrol1=new JScrollPane(tabVoo);
		    	painelVOO.add(scrol1,BorderLayout.CENTER);
		    	
		    	tabcalculos=new  JTable(calculos,titulosTotais);
		    	scrol2=new JScrollPane(tabcalculos);
		    	painelCalculos.add(scrol2,BorderLayout.CENTER);
		    	
		    	tp.add("Visualizar Quantidades",painelquant);
		        tp.add("visualizar Maior Voo",painelVOO);
		        tp.add("Visualizar Valores Monetarios",painelCalculos);		
		    			
		        cont.add(tp);
		        
		        tabcalculos.setGridColor(Color.black);
		        
		        setSize(1366,768);
				setVisible(true);
				setLocationRelativeTo(null); 
		     
	}
	

}
