/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
 
public class ValidarCampos extends PlainDocument
{

    // Sempre usar verbo no infinitivo para criar metodos
    public void insertString(int offs, String str,
            javax.swing.text.AttributeSet a) throws BadLocationException
    {
 
        // normalmente apenas uma letra é inserida por vez,
        // mas fazendo assim também previne caso o usuário
        // cole algum texto
        for (int i = 0; i < str.length(); i++)
            // Se não for uma letra retorna zero
            if (!Character.isLetter(str.charAt(i)))
                return;
 
        // Aceita apena 1 letra digitada por vez
        int tamMax = 11;
        if ((getLength() + str.length()) <= tamMax)
 
            super.insertString(offs, str, a);
 
    }
   
}