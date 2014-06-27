package servicio;

import entidad.Contacto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jahd
 */
public class ServicioContacto extends AbstractFacade<Contacto> {

    public ServicioContacto() {
        super(Contacto.class);
    }

    @Override
    public List<Contacto> findAll() {
        return super.findAll();
    }

    public List<Contacto> search(String q) {
        Session openSession = HibernateUtil.getSessionFactory().openSession();
        final Criteria createCriteria = openSession.createCriteria(Contacto.class);
        createCriteria.add(Restrictions.like("nombre", q, MatchMode.ANYWHERE));
        List<Contacto> get = createCriteria.list();
        openSession.close();
        return get;
    }

    public void save(Contacto cur) {
        super.createEdit(cur);
    }

    public void remove(int nrc) {
        final Contacto find = super.find(nrc);
        if (find != null) {
            super.remove(find);
        }
    }

    public Contacto find(int nrc) {
        return super.find(nrc);
    }

}
