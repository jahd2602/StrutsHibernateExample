package entidad;
// Generated 26-jun-2014 20:41:30 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name="curso"
    ,catalog="bd"
)
public class Curso  implements java.io.Serializable {


     private int curNrc;
     private String curNombre;
     private String curSemestre;
     private String curDuracion;

    public Curso() {
    }

    public Curso(int curNrc, String curNombre, String curSemestre, String curDuracion) {
       this.curNrc = curNrc;
       this.curNombre = curNombre;
       this.curSemestre = curSemestre;
       this.curDuracion = curDuracion;
    }
   
     @Id 

    
    @Column(name="cur_nrc", nullable=false)
    public int getCurNrc() {
        return this.curNrc;
    }
    
    public void setCurNrc(int curNrc) {
        this.curNrc = curNrc;
    }

    
    @Column(name="cur_nombre", nullable=false, length=45)
    public String getCurNombre() {
        return this.curNombre;
    }
    
    public void setCurNombre(String curNombre) {
        this.curNombre = curNombre;
    }

    
    @Column(name="cur_semestre", nullable=false, length=45)
    public String getCurSemestre() {
        return this.curSemestre;
    }
    
    public void setCurSemestre(String curSemestre) {
        this.curSemestre = curSemestre;
    }

    
    @Column(name="cur_duracion", nullable=false, length=45)
    public String getCurDuracion() {
        return this.curDuracion;
    }
    
    public void setCurDuracion(String curDuracion) {
        this.curDuracion = curDuracion;
    }




}


