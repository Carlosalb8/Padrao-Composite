import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Colecao extends Publicacao {
    private List<Publicacao> publicacoes = new ArrayList();

    public Colecao(String titulo) {
        super(titulo);
    }

    public void addPublicacao(Publicacao publicacao) {
        this.publicacoes.add(publicacao);
    }

    public int getQuantidadePublicacoes() {
        return publicacoes.size();
    }

    public String getConteudo() {
        String saida = "";
        saida = "Coleção: " + this.getTitulo() + "\n";

        Publicacao publicacao;
        for(Iterator var2 = this.publicacoes.iterator(); var2.hasNext(); saida = saida + publicacao.getConteudo()) {
            publicacao = (Publicacao)var2.next();
        }
        return saida;
    }
}