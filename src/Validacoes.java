/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class Validacoes {
	private BufferedReader k;
	public Validacoes() {
		k= new BufferedReader(new InputStreamReader(System.in));
	}
	
	//Metodo para validar String

	
	//Metodo para validar Int
	public int validarInt(int min, int max){
		int n= 0;
		do{
			n=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza a quantidade de milhas que deseja alterar"));
			if(n<min || n>max)
			{
				JOptionPane.showMessageDialog(null,"valor fora da faixa,introduza novamente");
			}
		}while(n<min || n>max);
		return n;
	}
	
	
}