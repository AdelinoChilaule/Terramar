/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class JanelaMenu extends JFrame{
	private JMenuBar bar;
	private JMenu file, visualizar, tarefas, extras, ajuda;
	private JMenuItem openitem, newitem, salvaritem, leritem, manual, visualtodositem, visualquantitem, visualvaloresitem,  pesBilheteitem, estatisticaItem, musicaitem, Calculadoraitem;
	private Container cont;
	private ImageIcon  logotipo;	
	private JLabel logo;
	    
	
	public JanelaMenu() {
		super("Menu");
		bar= new JMenuBar();
		setJMenuBar(bar);
	   
		
		logotipo=new ImageIcon(getClass().getResource("terramar4 (2).png"));
		logotipo.setImage(logotipo.getImage().getScaledInstance(557,466, DO_NOTHING_ON_CLOSE));
		logo=new JLabel(logotipo);
		
		file= new JMenu("File");
		file.setMnemonic('F');
		
		openitem= new JMenuItem("Open");
		openitem.setMnemonic('O');
		file.add(openitem);
		
		newitem= new JMenuItem("Novo Bilhete");
		newitem.setMnemonic('B');
		file.add(newitem);
		
		salvaritem= new JMenuItem("Salvar no fich Objecto");
		salvaritem.setMnemonic('S');
		salvaritem.setEnabled(false);
		file.add(salvaritem);
		
		leritem= new JMenuItem("Ler dados do fich Objecto");
		leritem.setMnemonic('L');
		leritem.setEnabled(false);
		file.add(leritem);
		
		bar.add(file);
		
		//**********************************************
		visualizar= new JMenu("Visualizar");
		visualizar.setMnemonic('V');
		visualizar.setEnabled(false);
		
		visualtodositem= new JMenuItem("Visualizar Bilhetes");
		visualtodositem.setMnemonic('V');
		visualizar.add(visualtodositem);
		bar.add(visualizar);
		
		//**********************************
		tarefas= new JMenu("Registos");
		tarefas.setMnemonic('T');
		tarefas.setEnabled(false);
		
		pesBilheteitem= new JMenuItem("Tarefas");
		tarefas.add(pesBilheteitem);
		
		estatisticaItem= new JMenuItem("Estatistica");
		estatisticaItem.setMnemonic('V');
		tarefas.add(estatisticaItem);
		bar.add(tarefas);
		
		
		extras= new JMenu("Extras");
		extras.setMnemonic('E');
		
		
		musicaitem= new JMenuItem("Musica");
		musicaitem.setMnemonic('M');
		extras.add(musicaitem);
		
		
		Calculadoraitem= new JMenuItem("Calculadora");
		Calculadoraitem.setMnemonic('V');
		extras.add(Calculadoraitem);
		bar.add(extras);
		
		ajuda= new JMenu("Ajuda");
		ajuda.setMnemonic('A');
		
		manual= new JMenuItem("Manual do utilizador");
		manual.setMnemonic('M');
		ajuda.add(manual);
		
		bar.add(ajuda);
		

		// eventos do menu
		eventosMenu();
		
		cont= getContentPane();
		cont.setBackground(new Color(34, 34, 34));
		cont.add(logo);
		setSize(1366,768);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	
	public void eventosMenu()
	{
		Tarefa ar=new Tarefa();
		//EVENTO PARA BOTAO LER DADOS DO MENU
		openitem.addActionListener( new ActionListener() 
		{
		
			 public void actionPerformed(ActionEvent e)
			 {
				ar.ler_ficheiros();
				salvaritem.setEnabled(true);
				leritem.setEnabled(true);
				visualizar.setEnabled(true);
				
				tarefas.setEnabled(true);
				newitem.setEnabled(true);		
				
			 }
		});
		newitem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ar.adapBilhete();
			}
		});
		
		// EVENTO BOTAO SAVAR DADOS DE OBJECTO 
		salvaritem.addActionListener( new ActionListener()
		{
			
			 public void actionPerformed(ActionEvent e)
			 {
				 ar.adapEscreverficheiroObjecto();
				
			 }
		});
		
		
		//newitem.addActionListener(x);
		
		//EVENTO BOTAOLER fICHEIRO DE OBJECTO
		leritem.addActionListener( new ActionListener()
		{
		 public void actionPerformed(ActionEvent e)
		 {
			 ar.adapLerFicheiroObjecto();
		 }
		});
		
		
		visualtodositem.addActionListener( new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 ar.retorno();
				
			 }
			});
		estatisticaItem.addActionListener( new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 ar.VisualizarEsta();
			 }
			});
		
		pesBilheteitem.addActionListener( new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				ar.pes();	
			 }
			});
		musicaitem.addActionListener( new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 
			 {
				 Desktop desktop= Desktop.getDesktop();
				 try 
					{
						desktop.open(new File("G-Fash-Sente-So-feat-Mark-Exodus-Tykid.mp3"));
					}
					
					catch(Exception ee){JOptionPane.showMessageDialog(null, "Ficheiro nao encontrado");
					}
			 }
			});
		Calculadoraitem.addActionListener( new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 new Calculadora_Janela();
			 }
			});
		
		manual.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Desktop desktop= Desktop.getDesktop();
						try 
						{
							desktop.open(new File("Descrição do Sistema Terramar.pdf"));
						}
						
						catch(Exception ee){JOptionPane.showMessageDialog(null, "Ficheiro nao encontrado");
						}
						
					}
				});
	}
}
