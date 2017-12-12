package boletin_14;

import javax.swing.JOptionPane;

public class Garaxe {

    private int numeroCoches;
    private float precio;
    private float recibido;

    public void aparcarCoche() {

        for (int i = 0; i < 6; i++) {
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Escribe la matricula: "));

            if (i < 5) {
                numeroCoches = 5 - i;
                JOptionPane.showMessageDialog(null, "HAY " + numeroCoches + " PLAZAS DISPOÑIBLES");
                
                 int tempo = (int) (Math.random() * (24)+1);
                 JOptionPane.showMessageDialog(null,"Pasaron "+tempo+" horas." );

                if (tempo < 3) {
                    precio = 1.5f;
                } else {
                    precio = 1.5f + (tempo - 3) * 0.2f;
                }
                JOptionPane.showMessageDialog(null, "El precio son " + precio + " euros");

                do {
                    recibido = Float.parseFloat(JOptionPane.showInputDialog("Inserte dinero: "));
                } while (recibido < precio);
                float devolto = recibido - precio;

                System.out.println("FACTURA \n\nMATRICULA COCHE....: " + matricula + "\nTEMPO..............: " + tempo
                        + "\nPRECIO.............: " + precio + "\nCARTOS RECIBIDOS...: " + recibido + 
                        "\nCARTOS DEVOLTOS....: " + devolto + "\n\nGRACIAS POR USAR O NOSO APARCADOIRO\n");

            } else {
                JOptionPane.showMessageDialog(null, "COMPLETO");
            }

        }
    }

}
