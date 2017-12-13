package com.ferdi.services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/servis")
public class Service {
 
    /*
     * @GET annotation bu methodun HTTP GET isteklerini iþleyeceðini gösteriyor.
     */
    @GET
    /*
     * @Path annotation servisin hizmet verdiði adresi gösterir. Bir servis
     * içinde farklý iþlemleri gerçekleþtiren hizmetler bulunabilir.
     */
    @Path("/id/{paramID}")
    /*
     * @Produces annotation istek karþýsýnda istemci gönderilecek veri tipini
     * gösterir. Hizmetin hangi veri tipiyle cevaplayacaðý belirlenir.
     */
    @Produces(MediaType.TEXT_XML)
    /*
     * @PathParam annotation @Path içinde gösterilen parametrenin adýný
     * gösterir. Servisi kullanýrken yollanacak parametreler bu iþaretle
     * belirlenir.
     */
    public String getID(@PathParam("paramID") String paramID) {
 
        String id = paramID;
        return "<Kullanici>" + "<ID>" + id + "</ID>" + "</Kullanici>";
    }
 
    @GET
    @Path("/butce/{paramButce}")
    @Produces(MediaType.TEXT_XML)
    public String getYas(@PathParam("paramButce") int paramButce) {
 
        int butce = paramButce;
 
        return "<Kullanici>" + "<Butce>" + butce + "</Butce>" + "</Kullanici>";
    }
 
}
