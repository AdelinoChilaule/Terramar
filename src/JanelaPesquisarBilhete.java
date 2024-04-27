/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class JanelaPesquisarBilhete extends JFrame{
	private JLabel lblpesquisar;
	private JTextField txtpesquisar;
	private JButton btnpesquisar, btnremover, btnEditar;
	private JButton btn[];
	private String [][] dados;
	private String titulosCarro[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","tipo bilhete","Nr Kilometros","Matricula","Combustivel","Valor Portagem"};
	private String titulosComboio[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","tipo bilhete","Nr Kilometros","Tipo Bilhete"};
	private String titulosAereo[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","tipo bilhete","Quantidade Milhas","Nome Companhia"};
	private String titulosMar[]= {"Codigo","Nome","Bi","Data Partida","Data Chegada","Valor Bilhete","Forma Pagamento","tipo bilhete","Tipo Barco"};
	private Container cont;
	private JPanel painel;
	private boolean control=false;
	private int y;
	private DecimalFormat mt;
	
	private JTable tabela;
	private JScrollPane scroll;
	////////
	public JanelaPesquisarBilhete() {
		super("Pesquisar Bilhete");
			//	panel=new JPanel();				
	}
	/////
	 public void inicalizacao(Vector lista)
	 {
		 Pesquisar pes= new Pesquisar();
		 Remover rem= new Remover();
		 cont= getContentPane();
		 painel=new JPanel();
		 painel.setLayout(new FlowLayout(FlowLayout.LEFT));
		 cont.setLayout(new BorderLayout(10,10) );
			
			lblpesquisar= new JLabel("Codigo: ");
			lblpesquisar.setForeground(new Color(247, 249, 249));
			painel.add(lblpesquisar);
			
			txtpesquisar= new JTextField(15);
			txtpesquisar.setDocument(new ValidarCampos_num());
			painel.add(txtpesquisar);
			
			btnpesquisar= new JButton("Pesquisar");
			btnpesquisar.setBackground(new Color(86, 143, 224));
			btnpesquisar.setForeground(new Color(247, 249, 249));
			btnpesquisar.setIcon(new ImageIcon(getClass().getResource("lupa.png")));
			btnpesquisar.setHorizontalAlignment(SwingConstants.RIGHT);
			painel.add(btnpesquisar); 
			
			
			btnremover= new JButton("Remover");
			btnremover.setForeground(new Color(247, 249, 249));
			btnremover.setBackground(new Color(231, 99, 64));
			btnremover.setEnabled(false);
			btnremover.setIcon(new ImageIcon(getClass().getResource("excluir.png")));
			btnremover.setHorizontalAlignment(SwingConstants.RIGHT);
			btnremover.setForeground(new Color(247, 249, 249));
			painel.add(btnremover);
			
			btnEditar=new JButton("editar");
			btnEditar.setBackground(new Color(101, 244, 143));
			btnEditar.setEnabled(false);
			btnEditar.setForeground(new Color(247, 249, 249));
			btnEditar.setIcon(new ImageIcon(getClass().getResource("editar.png")));
			btnEditar.setHorizontalAlignment(SwingConstants.RIGHT);
			painel.add(btnEditar);
			
			painel.setBackground(new Color(93, 173, 226));
			cont.add(painel,BorderLayout.NORTH);
				
		  // eventos
			btnpesquisar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) 
				{
					if(txtpesquisar.getText().isEmpty()==false)
					{
						y=pes.pesquisarBilhete(lista, Integer.parseInt(txtpesquisar.getText()));
						
						if(y!=-1)
						{
							if(control==true)
							{
								cont.remove(scroll);
								setSize(1366,769);
								tabela( lista,y);
								
							}
							else
							{
								tabela( lista,y);
								btnremover.setEnabled(true);
								btnEditar.setEnabled(true);
								control=true;
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Bilhete nao encontrado,verifique se o codifo esta correto");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Introduza o codigo");
					}
					
					
				}
			});
			btnremover.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								rem.removerBilhete(lista, y);
								cont.remove(scroll);
								setSize(1367,768);
								JOptionPane.showMessageDialog(null,"Bilhete apagado");
						}
					});
			
			btnEditar.addActionListener(new ActionListener() {
				public void actionPerformed( ActionEvent event)
				{
					int ind;
					Alterar al= new Alterar();
					if(txtpesquisar.getText().isEmpty()==false)
					{
						ind=al.alterar_milhas(lista,Integer.parseInt(txtpesquisar.getText()));
						if(ind==-1)
						{
							JOptionPane.showMessageDialog(null,"Nao é um Bilhete  Aereo");	
						}
						else
						{
							cont.remove(scroll);
							tabela( lista,ind);
							
							setSize(1366,768);
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Introduza o codigo");
					}
					
					
					
				}
			});
			
			setVisible(true);
			setSize(1366,768);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	    }
	 public void tabela(Vector lista, int y)
	 {
		 mt= new DecimalFormat("###,###,###.00 Mt");
		 int h=0;
		 Pesquisar pes= new Pesquisar();
		 cont= getContentPane();
         Bilhete b;
         Mar m;
         Carro c;
         Aereo a;
         Comboio com;
         String [][] x= new String[lista.size()][titulosMar.length];
     
		
	   		 
			 b=(Bilhete)lista.elementAt(y);
	        if(b instanceof Mar)
	        {  
	       	 x= new String[1][titulosMar.length];
	       	 m=(Mar)b;
	       	 x[h][0]=m.getCodigo()+"";
	       	 x[h][1]=m.getNomeCliente()+"";
	       	 x[h][2]=m.getBi()+"";
	       	 x[h][3]=m.getDatapartida()+"";	
	       	 x[h][4]=m.getDatachegada()+"";
	       	 x[h][5]=mt.format(m.getValorBilhete())+"";
	       	 x[h][6]=m.getFormapagamento()+"";
	       	 x[h][7]= "Mar";
	       	 x[h][8]=m.getTipoBarco()+"";
	       	 tabela=new JTable(x,titulosMar);
		     scroll=new JScrollPane(tabela);
	            }
	        else 
	        {
	             if(b instanceof Carro)
	             {
	           	  x= new String[1][titulosCarro.length];
	           	  c=(Carro)b;
	                 x[h][0]=c.getCodigo()+"";
	               
	                 x[h][1]=c.getNomeCliente()+"";
	                 
	                 x[h][2]=c.getBi()+"";
	                 
	                 x[h][3]=c.getDatapartida()+"";
	                 
	                 x[h][4]=c.getDatachegada()+"";
	                 
	                 x[h][5]=mt.format(c.getValorBilhete())+"";
	                 
	                 x[h][6]=c.getFormapagamento()+"";
	                 
	                 x[h][7]= "Carro";
	                 
	                 x[h][8]=c.getNrKilometros()+"Km";
	                 
	                 x[h][9]=c.getMatricula()+"";
	                 
	                 x[h][10]=c.getQuanCombustivel()+"";
	                 
	                 x[h][11]=c.getValorPortagem()+"";
	                 tabela=new JTable(x,titulosCarro);
	      	         scroll=new JScrollPane(tabela);

	             }else {
	           	  if(b instanceof Aereo){
	           		  x= new String[1][titulosAereo.length];
	           		  a=(Aereo)b;
	                     x[h][0]=a.getCodigo()+"";
	                     x[h][1]=a.getNomeCliente()+"";
	                     x[h][2]=a.getBi()+"";
	                     x[h][3]=a.getDatapartida()+"";
	                     x[h][4]=a.getDatachegada()+"";
	                     x[h][5]=mt.format(a.getValorBilhete())+"";
	                     x[h][6]=a.getFormapagamento()+"";
	                     x[h][7]= "Aereo";
	                     x[h][8]=a.getQuanmilhas()+"";
	                     x[h][9]=a.getNomeCompanhia()+"";
	                     //tab= new JTable(x, titulosAereo);
	                     tabela=new JTable(x,titulosAereo);
	         	          scroll=new JScrollPane(tabela);
	             		  
	           	  }else {
	               	  if(b instanceof Comboio ){
	               		  x= new String[1][titulosComboio.length];
	               		  com=(Comboio)b;
	               		  x[h][0]=com.getCodigo()+"";
	               		  x[h][1]=com.getNomeCliente()+"";
	               		  x[h][2]=com.getBi()+"";
	               		  x[h][3]=com.getDatapartida()+"";
	               		  x[h][4]=com.getDatachegada()+"";
	               		  x[h][5]=mt.format(com.getValorBilhete())+"";
	               		  x[h][6]=com.getFormapagamento()+"";
	               		  x[h][7]= "Comboio";
	               		  x[h][8]=com.getNrKilometros()+"Km";
	               		  x[h][9]=com.getTipoBilhete()+"";
	               		  tabela= new JTable(x, titulosComboio);
	             	      scroll=new JScrollPane(tabela);
	                 	
	               	  }
	                 }
	             }
	        }
			cont.add(scroll);
			setSize(1367,769);
			
		}
	   
}