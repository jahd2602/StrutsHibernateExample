/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import com.opensymphony.xwork2.ActionSupport;
import entidad.Curso;
import java.util.List;
import servicio.ServicioCurso;

/**
 *
 * @author jahd
 */
public class CursoAction extends ActionSupport {

    private ServicioCurso sc= new ServicioCurso();;
    private List<Curso> lstCur;
    private Curso cur;

    private Integer nrc;


    @Override
    public String input() throws Exception {
        if (getNrc()!=null) {
            setCur(sc.find(nrc));
        }
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
    return SUCCESS;
    }
    
    public String save() {
        sc.save(getCur());
        return "ok";
    }
    
    public String remove(){
        sc.remove(getNrc());
        return "ok";
    }
    
    public String list() throws Exception {
        lstCur=sc.findAll();
        return execute();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
       
    
    public ServicioCurso getSc() {
        return sc;
    }
    
    public void setSc(ServicioCurso sc) {
        this.sc = sc;
    }
    public Integer getNrc() {
        return nrc;
    }
    
    public void setNrc(Integer nrc) {
        this.nrc = nrc;
    }
    
    public Curso getCur() {
        return cur;
    }
    
    public void setCur(Curso cur) {
        this.cur = cur;
    }
    
    public List<Curso> getLstCur() {
        return lstCur;
    }
    
    public void setLstCur(List<Curso> lstCur) {
        this.lstCur = lstCur;
    }
//</editor-fold>
}
