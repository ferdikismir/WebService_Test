package com.ferdi.services;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/servis")
public class Service {
 
    /*
     * @GET annotation bu methodun HTTP GET isteklerini i�leyece�ini g�steriyor.
     */
    @GET
    /*
     * @Path annotation servisin hizmet verdi�i adresi g�sterir. Bir servis
     * i�inde farkl� i�lemleri ger�ekle�tiren hizmetler bulunabilir.
     */
    @Path("/id/{paramID}")
    /*
     * @Produces annotation istek kar��s�nda istemci g�nderilecek veri tipini
     * g�sterir. Hizmetin hangi veri tipiyle cevaplayaca�� belirlenir.
     */
    @Produces(MediaType.TEXT_XML)
    /*
     * @PathParam annotation @Path i�inde g�sterilen parametrenin ad�n�
     * g�sterir. Servisi kullan�rken yollanacak parametreler bu i�aretle
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
