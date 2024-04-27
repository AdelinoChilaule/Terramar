/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.Vector;
import javax.swing.*;

public class Alterar 
{
	public Alterar()
	{
		
	}
	
	//Metodo para alterar a quantidade de milhas do bilhete Aereo
	public int alterar_milhas(Vector x, int codigo ) 
	{
		Validacoes val= new Validacoes();
		Bilhete b;
		Aereo a;
		for(int i=0;i<x.size();i++)
		{
			b= (Bilhete) x.elementAt(i);
			if(b instanceof Aereo) 
			{
				a=(Aereo)b;
				if(a.getCodigo()==codigo)
				{
					
					int milhas=val.validarInt( 1, 99999999);
					a.setQuanmilhas(milhas);
					JOptionPane.showMessageDialog(null,"Dados alterados");
					return i;
				}
			   
				
			}
			
		}
		return -1;
			
	}	
}
