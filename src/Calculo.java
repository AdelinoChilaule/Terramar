/*Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import java.io.*;
import java.util.Vector;
import java.util.Vector.*;

public class Calculo{
	public Calculo() {
		
	}
	
	//Metodo para calcular valor total recebido pela empresa
	public float calcularTotal(Vector x) {
		//calculoTotal
		Float acumTotal= 0f;
		Bilhete b;
		Carro c;
		Comboio cc;
		Aereo a;
		Mar m;
		
		for(int i= 0; i<x.size(); i++) 
		{
			b= (Bilhete) x.elementAt(i);
			if(b instanceof Carro) {
				c= (Carro) b;
				acumTotal+= c.calcularValor();
			}else {
				if(b instanceof Comboio) {
					cc= (Comboio) b;
					acumTotal+= cc.calcularValor();
				}else {
					if(b instanceof Aereo) {
						a= (Aereo) b;
						acumTotal+= a.getValorBilhete();
					}else {
						if(b instanceof Mar) {
							m= (Mar) b;
							acumTotal+= m.getValorBilhete();
						}
					}
				}
			}
		}
		return acumTotal;
	}
	
	public float calcularTotalCarro(Vector x) {
		Bilhete b;
		Carro c;
		float acumCarro= 0;
		
		for(int i= 0; i<x.size(); i++) {
			b= (Bilhete)x.elementAt(i);
			if(b instanceof Carro) {
				c= (Carro) b;
				acumCarro+= c.calcularValor();
			}
		}
		return acumCarro;
	}
	
	public float calcularTotalComboio(Vector x) {
		Bilhete b;
		Comboio com;
		float acumComboio= 0;
		
		for(int i= 0; i<x.size(); i++) {
			b= (Bilhete)x.elementAt(i);
			if(b instanceof Comboio) {
				com= (Comboio) b;
				acumComboio+= com.calcularValor(); 
			}
		}
		return acumComboio;
	}
	
	public float calcularTotalAereo(Vector x) {
		Bilhete b;
		Aereo a;
		float acumAereo= 0;
		
		for(int i= 0; i<x.size(); i++) {
			b= (Bilhete)x.elementAt(i);
			if(b instanceof Aereo) {
				a= (Aereo) b;
				acumAereo+= a.getValorBilhete();
			}
		}
		return acumAereo;
	}
	
	public float calcularTotalMar(Vector x) {
		Bilhete b;
		Mar m;
		float acumMar= 0;
		
		for(int i= 0; i<x.size(); i++) {
			b= (Bilhete)x.elementAt(i);
			if(b instanceof Mar) {
			m= (Mar) b;
				acumMar+= m.getValorBilhete();
			}
		}
		return acumMar;
	}
	
	
	//Metodo para calcular o valor total do iva
	public float calcularTotalIva(Vector x) {
		Bilhete b;
		Carro c;
		Comboio cc;
		float acumTotalIva= 0;
		
		for(int i= 0; i<x.size(); i++) {
			b= (Bilhete) x.elementAt(i);
			if(b instanceof Carro) {
				c= (Carro) b;
				acumTotalIva+= c.caltotalIVa();
			}else {
				if(b instanceof Comboio) {
					cc= (Comboio) b;
					acumTotalIva+= cc.caltotalIVa();
				}
			}
		}
		
		return acumTotalIva;
	}
	
}
