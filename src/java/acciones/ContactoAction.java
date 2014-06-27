package acciones;

import com.opensymphony.xwork2.ActionSupport;
import entidad.Contacto;
import java.util.List;
import servicio.ServicioContacto;

/**
 *
 * @author jahd
 */
public class ContactoAction extends ActionSupport {

    private ServicioContacto sc = new ServicioContacto();

    private List<Contacto> lstContactos;
    private Contacto contacto;
    private Integer id;
    private String q;

    @Override
    public String input() throws Exception {
        if (getId() != null) {
            setContacto(sc.find(id));
        }
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String save() {
        sc.save(getContacto());
        return "ok";
    }

    public String remove() {
        sc.remove(getId());
        return "ok";
    }

    public String list() throws Exception {
        lstContactos = sc.findAll();
        return execute();
    }

    public String search() throws Exception {
        lstContactos = sc.search(q);
        return execute();
    }

    //<editor-fold defaultstate="collapsed" desc="Getter y Setter">
    public List<Contacto> getLstContactos() {
        return lstContactos;
    }

    public void setLstContactos(List<Contacto> lstContactos) {
        this.lstContactos = lstContactos;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }
    //</editor-fold>

    

}
