package com.hm.sistema.servicioglassfish.servicioweb;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hm.sistema.servicioglassfish.model.TbcmPaisOrigen;
import com.hm.sistema.servicioglassfish.servicio.PaisServicio;
import com.sun.jersey.api.json.JSONWithPadding;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("paises")
public class PaisServicioWeb {
    
    @EJB
    private PaisServicio paisServicio;
    
    /*
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TbcmPaisOrigen> listaPaises(){
        return paisServicio.listaPaises();
    }
    */


    @GET
    @Path("find")
    @Produces({"application/x-javascript"})
    //@Produces(MediaType.APPLICATION_JSON)
    public String Pais(@QueryParam("tbcmPaisOrigen") String tbcmPaisOrigen) {
        
        TbcmPaisOrigen paisOrigen = paisServicio.pais(tbcmPaisOrigen);
        
        Gson gson = new Gson();
        String json = gson.toJson(paisOrigen,TbcmPaisOrigen.class);
        //System.out.println(json);
        //return cuerpoClass.toString();
        return "tbcmPaisOrigen("+json+")";
        
    }
    
    @GET
    @Path("all")
    @Produces({"application/x-javascript"})
    //@Produces(MediaType.APPLICATION_JSON)
    public String listaPaises(@QueryParam("lista") String callback) {

        List<TbcmPaisOrigen> paisOrigen = paisServicio.listaPaises();
        
        Gson gson = new Gson();
        String json = gson.toJson(paisOrigen);
        JsonElement nombreClass = gson.toJsonTree(paisOrigen);
        JsonObject cuerpoClass = new JsonObject();
        cuerpoClass.add("tbcmPaisOrigen", nombreClass);
        //System.out.println(cuerpoClass.toString());
        return "lista(" + cuerpoClass.toString() + ")";
        
    }
    
    
}
