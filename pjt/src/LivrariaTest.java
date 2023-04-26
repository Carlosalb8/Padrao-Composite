import org.junit.Test;
import static org.junit.Assert.*;

public class LivrariaTest {
    @Test
    public void testClassPublicacao() {
        Publicacao publicacao = new Livro("O Senhor dos Anéis", new Autor("J.R.R. Tolkien"));
        assertEquals("O Senhor dos Anéis", publicacao.getTitulo());
    }

    @Test
    public void testClassAutor() {
        Autor autor = new Autor("William Shakespeare");
        assertEquals("William Shakespeare", autor.getNome());
        }
    @Test
    public void testClassLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", new Autor("J.R.R. Tolkien"));
        String conteudoEsperado = "Livro: O Senhor dos Anéis, Autor: J.R.R. Tolkien\n";
        assertEquals(conteudoEsperado, livro.getConteudo());
    }

    @Test
    public void testClassColecao() {
        Colecao colecao = new Colecao("Obras de Harry Potter");
        Publicacao publicacao1 = new Livro("Harry Potter e a Pedra Filosofal", new Autor("J.K. Rowling"));
        Publicacao publicacao2 = new Livro("Harry Potter e a Câmara Secreta", new Autor("J.K. Rowling"));
        Publicacao publicacao3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", new Autor("J.K. Rowling"));
        Publicacao publicacao4 = new Livro("Harry Potter e o Cálice de Fogo", new Autor("J.K. Rowling"));
        Publicacao publicacao5 = new Livro("Harry Potter e a Ordem da Fênix", new Autor("J.K. Rowling"));
        Publicacao publicacao6 = new Livro("Harry Potter e o Enigma do Príncipe", new Autor("J.K. Rowling"));
        Publicacao publicacao7 = new Livro("Harry Potter e as Relíquias da Morte", new Autor("J.K. Rowling"));
        colecao.addPublicacao(publicacao1);
        colecao.addPublicacao(publicacao2);
        colecao.addPublicacao(publicacao3);
        colecao.addPublicacao(publicacao4);
        colecao.addPublicacao(publicacao5);
        colecao.addPublicacao(publicacao6);
        colecao.addPublicacao(publicacao7);
        assertEquals(7, colecao.getQuantidadePublicacoes());
    }

    @Test
    public void testGetConteudo() {
        Colecao colecao = new Colecao("Obras de Harry Potter");
        Publicacao publicacao1 = new Livro("Harry Potter e a Pedra Filosofal", new Autor("J.K. Rowling"));
        Publicacao publicacao2 = new Livro("Harry Potter e a Câmara Secreta", new Autor("J.K. Rowling"));
        Publicacao publicacao3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", new Autor("J.K. Rowling"));
        Publicacao publicacao4 = new Livro("Harry Potter e o Cálice de Fogo", new Autor("J.K. Rowling"));
        Publicacao publicacao5 = new Livro("Harry Potter e a Ordem da Fênix", new Autor("J.K. Rowling"));
        Publicacao publicacao6 = new Livro("Harry Potter e o Enigma do Príncipe", new Autor("J.K. Rowling"));
        Publicacao publicacao7 = new Livro("Harry Potter e as Relíquias da Morte", new Autor("J.K. Rowling"));
        colecao.addPublicacao(publicacao1);
        colecao.addPublicacao(publicacao2);
        colecao.addPublicacao(publicacao3);
        colecao.addPublicacao(publicacao4);
        colecao.addPublicacao(publicacao5);
        colecao.addPublicacao(publicacao6);
        colecao.addPublicacao(publicacao7);

        String conteudoEsperado = "Coleção: Obras de Harry Potter\n" +
                "Livro: Harry Potter e a Pedra Filosofal, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e a Câmara Secreta, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e o Prisioneiro de Azkaban, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e o Cálice de Fogo, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e a Ordem da Fênix, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e o Enigma do Príncipe, Autor: J.K. Rowling\n" +
                "Livro: Harry Potter e as Relíquias da Morte, Autor: J.K. Rowling\n";

        assertEquals(conteudoEsperado, colecao.getConteudo());
    }

}


