import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //entrada - variavel
        System.out.println("Escolha a opção certa sobre o uso do 'if', 'else' e 'else if'?");
        System.out.println("A) Quando queremos executar várias condições diferentes, onde apenas uma delas deve ser executada");
        System.out.println("B) Quando queremos repetir um código várias vezes automaticamente");
        System.out.println("C) Quando queremos armazenar valores dentro de variáveis");
        System.out.println("D) Quando queremos criar um laço infinito no programa");
        char opcao = teclado.next().toUpperCase().charAt(0);

        //casos
        while(opcao != 'A' && opcao != 'B' && opcao != 'C' && opcao != 'D'){
            System.out.println("Opção inválida! Escolha A, B, C ou D:");
            opcao = teclado.next().toUpperCase().charAt(0);
        }
        switch(opcao) {
            case 'A':
                System.out.println("Correto!");
                break;
            
            case 'B':
                System.out.println("Errado!");
                break;
                
            case 'C':
                System.out.println("Errado!");
                break;

            case 'D':
                System.out.println("Errado!");
                break;
        }
        teclado.close();
    }
}
