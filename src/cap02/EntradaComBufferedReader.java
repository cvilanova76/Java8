package cap02;
import java.io.*;

public class EntradaComBufferedReader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try {
            System.out.println("Entre o comprimento");
            dado = new BufferedReader(new InputStreamReader (System.in));
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre a largura");
            dado = new BufferedReader(new InputStreamReader (System.in));
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo : " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        } catch (IOException erro) {
            System.out.println("Houve erro na entrada de dados" + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão; digite apenas caracteres numéricos" + erro.toString());
        }
    }
}

