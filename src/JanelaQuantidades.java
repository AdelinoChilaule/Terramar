/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.util.*;

public class JanelaQuantidades extends JFrame {
private JTable tabela;
private JScrollPane scroll;
private String [][] dados;
private String titulosTotais[]= {"Quantidade Carro","Quantidade Comboio","Quantidade Aereo","Quantidade Mar","Quantidade Total"};
private Tarefa fich;
private Container cont;

     //Classe Construtor
    public JanelaQuantidades() {	 
    }
    
    //Metodo para visualizar dados do Vector
    public String[][] criarQuant(Vector lista){
    	int h=0;
    	Bilhete b;
    	Aereo a;
    	Carro c;
    	Comboio com;
    	Mar m;
    	String [][] x=new String[1][titulosTotais.length];
    	
	  	  	x[h][0]= Carro.ContCarro+"";
	  	  	x[h][1]= Comboio.ContComboio+"";
	  	   	x[h][2]= Aereo.ContAereo+"";
	  	 	x[h][3]= Mar.ContMar+"";
	  	  	x[h][4]= Carro.ContCarro+Comboio.ContComboio+Aereo.ContAereo+Mar.ContMar+"";
	  	  	h++;
	  return x;
    }
}