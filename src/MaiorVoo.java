/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.util.Vector;

public class MaiorVoo {
	public MaiorVoo() {
		
	}
	
	//Metodo para achar o maior voo
	public int acharMaiorVoo(Vector x){
		Bilhete b;
		Aereo a;
		int voo=-1,indice=0;
		
		
		for(int i=0;i<x.size();i++)
		{
				
			b=(Bilhete)x.elementAt(i);
			if(b instanceof Aereo)
			{
				a=(Aereo)b;
				if(a.getQuanmilhas()>voo){
					voo=a.getQuanmilhas();
					indice=i;
					
				}
			}
			
		}
		return indice;
	}
}
