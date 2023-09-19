/**
 * Este programa mostra uma saudação para o usuário.
 **/
public class greetings {
    public static void main(String[] args) {

        String greeting = "Let's go with Java!";

        // Imprime apenas uma linha em branco antes da String
        System.out.println();

        System.out.println(greeting);
        /*
        O próximo trecho de código é um loop FOR que é usado
        para imprimir uma linha de caracteres com asteriscos
        ("*") logo abaixo da mensagem de boas-vindas.

        Ele inicializa uma variável i com valor 0,
        executa o loop enquanto i for menor que o comprimento
        da string greeting, e incrementa i a cada iteração.
        */
        /**
        .length()
        Este é um método da classe String que retorna
        o comprimento da string, ou seja, o número de caracteres
        que a voriável string contém.
         */
        /*
        Já a expressão i++ está sendo usada dentro de um loop FOR
        para incrementar o valor da variável i a cada iteração do
        loop até alcançar o comprimento `.length()` da String.
        */
        //for (int i = 0; i < greeting.length(); i++)
        for (int i = 0; i < greeting.length(); i++)

            System.out.print("*");
        System.out.println();
    }
}