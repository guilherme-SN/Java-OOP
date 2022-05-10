package aula14_15;

public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video video;

    // Método construtor
    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    // Métodos
    public void avaliar() {
        this.video.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int tot;
        if (porcentagem <= 20) {
            tot = 3;
        } else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }

        this.video.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", video=" + video +
                '}';
    }

    // Métodos especiais
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
