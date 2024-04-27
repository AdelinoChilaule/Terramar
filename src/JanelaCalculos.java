/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.util.*;

public class JanelaCalculos {

private String titulosTotais[]= {"Total Carro","Total Comboio","Total Aereo","Total Mar","Total Recebido","Total Iva"};


     //Classe Construtor
    public JanelaCalculos() {
    	
    }
    
    //Metodo para visualizar dados do Vector
    public String[][] criarCalculos(Vector lista){
    	DecimalFormat mt= new DecimalFormat("###,###,###.00 Mt");
    	int h=0;
    	
    	Calculo cal= new Calculo();
    	String [][] x=new String[1][titulosTotais.length];
	  	  	x[h][0]= mt.format(cal.calcularTotalCarro(lista))+"";
	  	  	x[h][1]= mt.format(cal.calcularTotalComboio(lista))+"";
	  	   	x[h][2]= mt.format(cal.calcularTotalAereo(lista))+"";
	  	 	x[h][3]= mt.format(cal.calcularTotalMar(lista))+"";
	  	  	x[h][4]= mt.format(cal.calcularTotal(lista))+"";
	  	  	x[h][5]= mt.format(cal.calcularTotalIva(lista))+"";	
	  	  	h++;
	  return x;
    }
}