public class Operadores {
    public static void main(String[] args) {

        //OPERADORES EXERCICIOS//

        int n1 = 10;
        int n2 = 20;

        int soma = n1 + n2;
        System.out.println(soma);
        int multiplicacao = n1 * n2;
        System.out.println(multiplicacao);
        double divisao = n1 / (double) n2;  //casting//
        System.out.println(divisao);
        int resto = n1 % n2;
        System.out.println(resto);

        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        int media = nota1 + nota2 + nota3/ 3;
        System.out.println("Media das Notas: " + media);

        int idade = 18;
        int isConvercaoDeAnosParaMeses = idade*12;
        System.out.println("Idade de Anos Para meses é: " + isConvercaoDeAnosParaMeses + " Meses");


        int idade1 = 17;
        boolean isAutenticarIdade = idade1 >= 18;
        System.out.println("É Maior ou Tem 18 Anos? " + isAutenticarIdade);

        int numero1 = 20;
        int numero2 = 60;

        boolean isSaoIguais = numero1 == numero2;
        System.out.println("São iguais? " + isSaoIguais);

        boolean isPrimeiroMaior = numero1 > numero2;
        System.out.println("O Primeiro é Maior?" + isPrimeiroMaior);

        boolean isSegundoMaior = numero2 > numero1;
        System.out.println("O Segundo é Maior?" + isSegundoMaior);

    }
}