package Games;

import java.util.ArrayList;
import java.util.List;

public class Estudio {
    private int id;
    private String nome;
    private int anoCriacao;
    private List<Jogo> listJogo;
    
    public Estudio(){
        this.listJogo = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public List<Jogo> getListJogo() {
        return listJogo;
    }

    public void setListJogo(List<Jogo> listJogo) {
        this.listJogo = listJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
    
    public void addJogo(Jogo j){
        //adicionar o personagem p na listPers
        this.listJogo.add(j);
    }
    
    public void excluirJogo(Jogo j){
        //excluir o personagem p na listPers
        this.listJogo.remove(j);
    }
}
