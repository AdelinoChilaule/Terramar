/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;
public class Janela_Todos extends JFrame {
private JTable tabela,tabMar,tabCarro,tabaereo,tabComboio;
private JScrollPane scroll,scrol1,scrol2,scrol3,scrol4;
private String sub_titulos[]= {"Codigo","Nome Cliente","BI","Datapartida","Datachegada","Valor Bilhete","Forma Pagamento"};
private String sub_mar[]= {"Codigo","Nome Cliente","BI","Datapartida","Datachegada","Valor Bilhete","Forma Pagamento","Tipo Barco"};
private String sub_Aereo[]= {"Codigo","Nome Cliente","BI","Data Partidada","Data Chegada","Valor Bilhete","Forma de Pagamento","Milhas","Nome Companhia"};
private String sub_Carro[]= {"Codigo","Nome Cliente","BI","Datapartida","Datachegada","Valor Bilhete","Forma Pagamento","Kilometros","Matricula","Combustivel","Valor Portagem"}; 
private String sub_comboio[]= {"Codigo","Nome Cliente","BI","Datapartida","Datachegada","Valor Bilhete","Forma Pagamento","Kilometros","Tipo Bilhete"}; 


private Font font_lb_titulos;
private Color cor ;
private Container cont;
private JTabbedPane tp;
private String [][]Todosdados, carro,mar,comboio,aereo;
private JPanel painelTodos,painelCarro,painelAereo,painelComboio,painelMar;

     //Classe Construtor
    public Janela_Todos(Vector lista)
    {
    	super("Janela_Todos");
    	
    	cont=getContentPane();
    	
    	tp = new JTabbedPane ();
    	painelTodos= new JPanel();
    	painelCarro= new JPanel();
    	painelAereo= new JPanel();
    	painelComboio= new  JPanel();
    	painelMar= new JPanel();
    	//Font font_lbs = new Font("Verdana", Font.PLAIN, 13);
        Color cor=new Color(10, 170, 209);
    	
    	painelTodos.setLayout(new BorderLayout());
    	painelCarro.setLayout(new BorderLayout());
    	painelAereo.setLayout(new BorderLayout());
    	painelComboio.setLayout(new BorderLayout());
    	painelMar.setLayout(new BorderLayout());
    	
    	Janela_Mar me=new Janela_Mar();
    	Janela_carro cc=new Janela_carro();
    	Janela_comboio jc=new Janela_comboio();
    	Janela_aereo ja=new Janela_aereo();
    	
    	Todosdados=criarTabela(lista);
    	mar=me.criarTabelaMAR(lista);
        carro=cc.criarTabela(lista);
        comboio=jc.criarTabela(lista);
        aereo=ja.criarTabela(lista);
        
        tabela=new JTable(Todosdados,sub_titulos);
        scroll=new JScrollPane(tabela);
        painelTodos.add(scroll,BorderLayout.CENTER);
       // tabela.setFont(font_lbs);
        
        tabMar=new JTable(mar,sub_mar);
        scrol1=new JScrollPane(tabMar);
        painelMar.add(scrol1,BorderLayout.CENTER);
        //tabMar.setFont(font_lbs);
        
        
        tabCarro=new JTable(carro,sub_Carro);
        scrol2=new JScrollPane(tabCarro);
        painelCarro.add(scrol2,BorderLayout.CENTER);
       // tabCarro.setFont(font_lbs);
        
        tabaereo=new JTable(aereo,sub_Aereo);
        scrol3=new JScrollPane(tabaereo);
        painelAereo.add(scrol3,BorderLayout.CENTER);
      //  tabaereo.setFont(font_lbs);
        
        
        tabComboio=new JTable(comboio,sub_comboio);
        scrol4=new JScrollPane(tabComboio);
        painelComboio.add(scrol4,BorderLayout.CENTER);
       // tabComboio.setFont(font_lbs);
        
        tp.add("Visualizar Todos",painelTodos);
        tp.add("Visualizar Mar",painelMar);
        tp.add("Visualizar Aereo",painelAereo);
        tp.add("Visualizar Carro",painelCarro);
        tp.add("Visualizar Comboio",painelComboio);
       // tp.setFont(font_lbs);
        tp.setBackground(new Color(242, 254, 158));
        tp.setForeground(new Color(8, 0, 7));
        cont.add(tp);
        
        
        tabela.setGridColor(Color.black);
      //painelTodos.setBackground(new Color(242, 254, 158));
        scroll.setBackground(new Color(242,254,158));
        //tabMar.setBackground(new Color(252, 243, 207));
        //tabCarro.setBackground(new Color(252, 243, 207));
        //tabaereo.setBackground(new Color(252, 243, 207));
        //tabComboio.setBackground(new Color(252, 243, 207));
        
       // cont.setBackground(new Color(242, 254, 158));
        setSize(1366,568);
		setVisible(true);
		setLocationRelativeTo(null); 
      
    }
    //Metodo para visualizar dados do Vector
    public String [][] criarTabela(Vector lista)
    {
    	DecimalFormat mt= new DecimalFormat("###,###,###.00 Mt");
         int h=0;
         int y=h;
    	 Bilhete b;
    	 Mar m;
    	 Carro c;
    	 Aereo a;
    	 Comboio com;
    	 String [][] x=new String[lista.size()][sub_titulos.length];
    	 for(int i=0;i<lista.size();i++)
    	 { 	   	    		 
		    b= (Bilhete)lista.elementAt(i);
		    x[h][0]=b.getCodigo()+"";
  	  		x[h][1]=b.getNomeCliente()+"";
  	  		x[h][2]=b.getBi()+"";
  	  		x[h][3]=b.getDatapartida()+"";
  	  		x[h][4]=b.getDatachegada()+"";
  	  		x[h][5]=mt.format(b.getValorBilhete())+"";
  	  		x[h][6]=b.getFormapagamento()+"";
	  		h++;
    	    		 
    	 }
    	 
    	return x;
    }
}
