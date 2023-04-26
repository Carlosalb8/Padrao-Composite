public abstract class Publicacao {
    private String titulo;

    public Publicacao(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getConteudo();
}
