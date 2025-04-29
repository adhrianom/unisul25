package principal;
import javax.swing.JOptionPane;
public class Unisul25 {

    public static void main(String[] args) {
      int num[] = new int[20];
      
      for (int i = 0; i < 20; i++){
          num[i] = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "));
      }
      
      int soma = 0;
      for (int i = 0; i < 20; i++){
          soma += num[i];
          }
      
      double media = 0.0;
      for (int i = 0; i < 20; i++){
          media = soma / 20;
      }
      
      JOptionPane.showMessageDialog(null, "SOMA = " + soma + ", MEDIA = " + media);
      
    }
}
