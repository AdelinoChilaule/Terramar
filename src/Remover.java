/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.Vector;

public class Remover {
	public Remover() {
		
	}
	
	//Metodo para remover um bilhete pelo codigo
	public void removerBilhete(Vector x, int ind)
	{
		x.remove(ind);
		x.trimToSize();
		Bilhete b;
 
				
				b= (Bilhete) x.elementAt(ind);
				if(b instanceof Carro)
				{
					Carro.ContCarro--;
				}
				else 
				{
					if(b instanceof Comboio) 
					{
						 Comboio.ContComboio--;
					}
					else
					{
							
						if(b instanceof Aereo) 
						{
							Aereo.ContAereo--;
						}
						else 
							
						{
							if(b instanceof Mar)
							{
								 Mar.ContMar--;
							}
						}
					}
				}
		}
}
