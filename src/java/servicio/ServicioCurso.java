/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Curso;
import java.util.List;

/**
 *
 * @author jahd
 */
public class ServicioCurso extends AbstractFacade<Curso> {

    public ServicioCurso() {
        super(Curso.class);
    }

    public List<Curso> findAll() {
        return super.findAll();
    }
 
    public void save(Curso cur) {
            super.createEdit(cur);
    }
    
    public void remove(int nrc) {
        final Curso find = super.find(nrc);
        if (find!=null){
        super.remove(find);}
    }
    
    public Curso find (int nrc) {
        return super.find(nrc);
    }
    
    
}
