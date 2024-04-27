/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class Executavel {

	public static void main(String[] args)
	{
		
		try {
			for ( LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
				if ("Nimbus".equals( info.getName() ) ) {
					UIManager.setLookAndFeel( info.getClassName() );
					break;
				}
			}
		}catch(UnsupportedLookAndFeelException exc){
			exc.printStackTrace();
		}catch(ClassNotFoundException exc){
			exc.printStackTrace();
		}catch(InstantiationException exc){
			exc.printStackTrace();
		}catch(IllegalAccessException exc){
			exc.printStackTrace();
		}

		UIManager.put("nimbusBase", new Color(0, 250, 154));
		UIManager.put("nimbusSelection", new Color(133,244,190));
		UIManager.put("control", new Color(253, 253, 253));
		UIManager.put("Menu", new Color(230, 224, 208));
		UIManager.put("nimbusBlueGrey", new Color(153, 240, 249) );
		UIManager.put("Table.font", new Font("Segoe UI", Font.PLAIN, 12));
		UIManager.put("Table.background", new Color(249, 47, 34 ));
		UIManager.put("Menu.background", new Color(64, 224, 208));
		UIManager.put("FileChooser.background", new Color(255, 254, 254 ));
		UIManager.put("Table.background", new Color(115,250,147));
		UIManager.put("Menu.font", new Font("Segoe UI", Font.PLAIN, 12));
		UIManager.put("nimbusFont", new Font("Segoe UI", Font.PLAIN, 50));
		UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 50));
		UIManager.put("TabbedPane.font", new Font("Segoe UI", Font.PLAIN, 15));
			
        Tarefa ar =new Tarefa();
    	ar.adaplogin();
		
	}
}
