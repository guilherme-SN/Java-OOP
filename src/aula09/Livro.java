package aula09;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Métodos
    public void detalhes() {
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Escrito por " + this.getAutor());
        System.out.println("Livro aberto? " + this.isAberto());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Leitor atual: " + this.getLeitor().getNome());
    }

    // Métodos abstratos
    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro aberto");
        } else {
            System.out.println("Livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro fechado");
        } else {
            System.out.println("Livro já está fechado");
        }
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.getTotPaginas()) {
            System.out.println("Você passou do limite de páginas. Paremos na última, então.");
            this.setPagAtual(this.getTotPaginas());
        } else if (pag < 0) {
            System.out.println("Não é possível ir para uma página negativa");
        } else {
            this.setPagAtual(pag);
        }

    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() != this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Você está na última página! Não é possível avançar");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() != 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Você está na primeira página! Não é possível voltar");
        }
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
