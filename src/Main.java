public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano De Lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.0;
        String sinopse = """
                filme top gun
                filme de aventura com galã dos anos 80
                muito bom!
                Ano de Lançamento""" + anoDeLancamento;


        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        System.out.println(sinopse);
    }
}