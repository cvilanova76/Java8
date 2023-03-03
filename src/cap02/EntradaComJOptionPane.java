package cap02;

import javax.swing.*;

public class EntradaComJOptionPane {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String aux;
        float largura, comprimento, area, perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre o comprimento");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre a largura");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área: " + area + ", Perímetro: " + perimetro);
        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão; digite apenas caracteres numéricos" + erro.toString());
        }
        System.exit(0);
    }
}

