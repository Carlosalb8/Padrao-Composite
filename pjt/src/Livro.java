public class Livro extends Publicacao {
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        super(titulo);
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        String var10000 = this.getTitulo();
        return "Livro: " + var10000 + ", Autor: " + this.autor.getNome() + "\n";
    }
}
