public class C04_booleans_operators02 {

    public static void main(String[] args) {

        /*boolean resultado = false;
        System.out.println(resultado);*/

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        /*
        * Tabela da verdade
        *
        * Operador && (AND)
        * true && true = true
        * true && false = false
        * false && true = false
        * false && false = false
        *
        * Operador || (OR)
        * true || true = true
        * true || false = true
        * false || true = true
        * false || false = false
        *
        * Operador ternário
        * Usado quando temos dois comportamentos possíveis
        * ? = if
        * : = else
        */

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        // String mensagem = fimDeSemana (primeiro termo a ser avaliado) ? "É fim de semana" (segundo termo caso o valor seja verdadeiro): "Não é fim de semana"; (terceiro termo caso seja falso)
        // se for fim de semana, escreve "É fim de semana" (se a variável fimDeSemana contiver um valor verdadeiro, "É fim de semana" será atribuído. Caso contrário (:), será atribuído "Não é fim de semana")
        // ? = atribui valor baseado numa condição
        System.out.println(mensagem);
        //System.out.println(vamosAPraia);
    }
}
