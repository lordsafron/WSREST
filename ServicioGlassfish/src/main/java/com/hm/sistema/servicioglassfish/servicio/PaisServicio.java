package com.hm.sistema.servicioglassfish.servicio;

import com.hm.sistema.servicioglassfish.model.TbcmPaisOrigen;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class PaisServicio {
    
    @PersistenceContext(name="UnitMysql")
    private EntityManager em;
    
    
   public List<TbcmPaisOrigen> listaPaises() {
       Query consultaListaPaises = em.createQuery("SELECT p FROM TbcmPaisOrigen p ORDER BY p.pais");
       return consultaListaPaises.getResultList();
   }
   
   public TbcmPaisOrigen pais(String callback) {
       Query consultaPais = em.createQuery("SELECT p FROM TbcmPaisOrigen p WHERE p.pais = ?1");
       consultaPais.setParameter(1, callback);
       TbcmPaisOrigen origen = (TbcmPaisOrigen) consultaPais.getSingleResult();
       //System.out.println("Resultado: " + origen);
       return origen;
   }
    
}
