package Exercicios;

public class SomaDosCemPrimeiros {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos cem primeiros números naturais é: " + soma);
    }
}
