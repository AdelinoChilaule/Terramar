/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/
import javax.swing.*;
import javax.swing.filechooser.*;

import java.util.*;
import java.io.*;
public class Ler_FichObj  implements Serializable {

	public Ler_FichObj() {
	
	}
	
	//Metodo para ler do ficheiro do Objecto
	public void ler_fichero_obj(Vector lista) 
	{
		 JFileChooser fc= new JFileChooser();
		 FileNameExtensionFilter filter1= new FileNameExtensionFilter("*.dat","dat");
		 fc.setFileFilter(filter1);
		 fc.setCurrentDirectory(new File (System.getProperty("user.dir")));
			
		int i= fc.showOpenDialog(null);
		if(i==JFileChooser.APPROVE_OPTION) 
		{
			try
			{
				FileInputStream  ler=new FileInputStream(fc.getSelectedFile().getPath());
				ObjectInputStream in = new ObjectInputStream(ler);
				lista = (Vector) in.readObject();
			    in.close();
			    JOptionPane.showMessageDialog(null,"Dados lidos com Sucesso");
			} catch (FileNotFoundException ff){ 
				JOptionPane.showMessageDialog(null,"Ficheiro nao encontrado");
			}catch (ClassNotFoundException zz) {
				JOptionPane.showMessageDialog(null,zz.getMessage());
			}catch (IOException xx){
				JOptionPane.showMessageDialog(null,xx.getMessage());
			}
		}
	}
	
	//Metodo para gravar/escrever no ficheiro de Objecto
	public void gravarFichObj(Vector lista)
	  {

		JFileChooser fc= new JFileChooser();
		FileNameExtensionFilter filter1= new FileNameExtensionFilter("*.dat","dat");
		fc.setFileFilter(filter1);
		 
		fc.setCurrentDirectory(new File (System.getProperty("user.dir")));
		int i= fc.showSaveDialog(null);
		if(i==JFileChooser.APPROVE_OPTION) 
		{
			
			try
			{ 
				FileOutputStream f   = new FileOutputStream(fc.getSelectedFile()+".dat");
				ObjectOutputStream s = new ObjectOutputStream(f);
				s.writeObject(lista);
				s.close();
				JOptionPane.showMessageDialog(null,"Dados Gravados com Sucesso");
			}
			catch (IOException n){
				JOptionPane.showMessageDialog(null,n.getMessage());
		    }
		}
	  }

}
