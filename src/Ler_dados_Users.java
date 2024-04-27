/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.*;

public class Ler_dados_Users {
	private int contar=0;
	
	
	public Ler_dados_Users() {
		
	}
	
	public void users(Vector lista)
	{ 
		String nome,umalinha="";
		StringTokenizer linha;
		int codigo;
		try
		{
			FileReader file= new FileReader("Users.txt");
			BufferedReader ler=new BufferedReader(file);
			
			umalinha=ler.readLine();
			while(umalinha!=null)
			{
				linha=new StringTokenizer(umalinha,";");
				nome=linha.nextToken();
				codigo=Integer.parseInt(linha.nextToken());
				criarUsuario(nome,codigo,lista);
				
				umalinha=ler.readLine();
			}
			ler.close();
		}catch(FileNotFoundException ex)
		{
			System.out.println("Ficheiro nao encontrado");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void criarUsuario(String nome, int codigo,Vector lista)
	{
		Usuario ar = new Usuario();
		ar.setNome(nome);
		ar.setSenha(codigo);
		lista.addElement(ar);
		lista.trimToSize();
	}
	
}
