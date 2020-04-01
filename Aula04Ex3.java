import javax.swing.JOptionPane;

public class Aula04Ex3{
	public static void main (String args[]){
		int numero;
      int soma = 0;
		int quantidade = 0;
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero positivo para obter a media:"));
         if (numero > 0 && numero <= 200) {
            soma = soma + numero;
            quantidade++;
         }  
		}while(numero>0);
		JOptionPane.showMessageDialog(null,"Resulado da media de: "+ soma +" e "+ soma / quantidade);
	}
}