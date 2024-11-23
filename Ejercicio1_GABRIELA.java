import javax.swing.JOptionPane;

public class Ejercicio1_GABRIELA {
    public static void main(String[] args) {
        
        short total1, totalFinal;
        String colorBola;
        
         colorBola=(JOptionPane.showInputDialog("Ingrese el color de su Bola:" ));
         total1=Short.parseShort(JOptionPane.showInputDialog("Ingrese cual es su cuenta total:" ));
        
         if (colorBola.equalsIgnoreCase("rojo")){
             totalFinal= (short) (total1-(total1 * .40));
             JOptionPane.showMessageDialog(null,"Su descuento es de un 40%:" +
                     " El color de su bola es: " + colorBola + " Y debe pagar: $" + totalFinal + " pesos. ");
         } else if (colorBola.equalsIgnoreCase("verde")){
             totalFinal= (short) (total1-(total1 * .28));
             JOptionPane.showMessageDialog(null," Su descuento es de un 28%: " + 
                     " El color de su Bola es: " + colorBola + " Y debe pagar: $" + totalFinal + " pesos. ");    
         } else if (colorBola.equalsIgnoreCase("azul")){
             totalFinal= (short) (total1-(total1 * .15));
             JOptionPane.showMessageDialog(null,"Su descuento es de un 15%:" + 
                     " El color de su bola es: " + colorBola + " Y debe pagar: $" + totalFinal + " pesos. ");
         } else if (colorBola.equalsIgnoreCase("amarillo")){
             totalFinal= (short) (total1-(total1 * .05));
             JOptionPane.showMessageDialog(null,"Su descuento es de un 5%:" + 
                     " El color de su bola es: " + colorBola + " Y debe pagar: $" + totalFinal + " pesos. ");
         }
    }
}
