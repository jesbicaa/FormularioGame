package Games;

import java.util.ArrayList;
import java.util.List;

public class ControlaEstudio {
    private List<Estudio> listEstudios;
    
    public ControlaEstudio (){
        this.listEstudios = new ArrayList();
    }
    
    public void adicionar(Estudio v){
        this.listEstudios.add(v);
    }
    
    public List<Estudio> getEstudios (){
        return this.listEstudios;
    }
}
