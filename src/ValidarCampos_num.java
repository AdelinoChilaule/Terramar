/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class ValidarCampos_num  extends PlainDocument 
{
	 //Sempre usar verbo no infinitivo para criar metodos
    public void insertString(int offs, String str,
            javax.swing.text.AttributeSet a) throws BadLocationException {
        // normalmente apenas uma letra é inserida por vez,
        // mas fazendo assim também previne caso o usuário
        // cole algum texto
        //Aceita virgula e ponto nos números
        for (int i = 0; i < str.length(); i++)
            // Se não for número, ponto ou vírgula retorna zero
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != ','
                    && str.charAt(i) != '.')
                return;
 
        super.insertString(offs, str, a);
 
    }
}
