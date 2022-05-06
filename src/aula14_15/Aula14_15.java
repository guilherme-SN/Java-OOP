package aula14_15;

public class Aula14_15 {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[2];

        v[0] = new Video("Aula 1 - POO");
        v[1] = new Video("Aula 2 - PHP");
        v[2] = new Video("Aula 3 - Java");

        g[0] = new Gafanhoto("Guilherme", 18, 'M', 123);
        g[1] = new Gafanhoto("Teste", 17, 'M', 432);

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
