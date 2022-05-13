public class C03_variables02 {

    public static void main(String[] args) {

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        /* int divisao = a / b; resultado = 1, pois int é para números inteiros
           float divisao = a / b; resultado = 1.0, pois float indica ao Java que, um número inteiro dividido por outro número inteiro, obrigatoriamente, retorna um inteiro (particularidade do Java)

           Soluções:
           1) Mais simples: alterar todas as entradas de dados para float. Porém, dificulta num código grande
           2) cast: usar parentêses na expressão. Transformar e representar como se fosse aquele tipo. O resultado seria int, mas representa como se fosse float */

        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }
}
