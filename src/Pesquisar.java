/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.util.*;
public class Pesquisar {

	public Pesquisar() {
		
	}
	
	//Metodo para pesquisar um bilhete pelo codigo 
	public int pesquisarBilhete(Vector lista,int cod)
	{
		Bilhete bi;
		for(int i=0;i<lista.size();i++)
		{
			bi=(Bilhete)lista.elementAt(i);
			if(bi.getCodigo()==cod)
			{
				return i;
			}
		}
		return -1;
	}

}
