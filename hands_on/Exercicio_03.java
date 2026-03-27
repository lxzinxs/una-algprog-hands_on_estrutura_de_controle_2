//Scanner
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //nomeando variaveis
        int letras = 0;
        int numeros =0;

        //entrada
        System.out.println("Escreva alguma coisa: ");
        String texto = teclado.nextLine();

        //looping
        for(char c : texto.toCharArray()){
            if(Character.isLetter(c)){
                letras++;
            } else if(Character.isDigit(c)){
                numeros++;
            }
        }
        System.out.println("Letras: " + letras + ", Números: " + numeros);
        teclado.close();
    }
}
