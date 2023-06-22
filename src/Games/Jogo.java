package Games;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private int id;
    private String nome;
    private double valor;
    private String plataforma;
    private int dataLanc;
    private List<PersonagensPrinc> listPers;
    
    public Jogo() {
        this.listPers = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getDataLanc() {
        return dataLanc;
    }

    public void setDataLanc(int dataLanc) {
        this.dataLanc = dataLanc;
    }

    public List<PersonagensPrinc> getListPers() {
        return listPers;
    }

    public void setListPers(List<PersonagensPrinc> listPers) {
        this.listPers = listPers;
    }
    
    public void addPersonagem(PersonagensPrinc p){
        //adicionar o personagem p na listPers
        this.listPers.add(p);
    }
    
    public void excluirPersonagem(PersonagensPrinc p){
        //excluir o personagem p na listPers
        this.listPers.remove(p);
    }
}
