/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.edu.reniec;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import upc.edu.entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
@WebService(serviceName = "ServicioReniec")
public class ServicioReniec {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "ConsultaPorDni")
    public Persona ConsultaPorDni(@WebParam(name = "dni") String dni) {
        ArrayList<Persona> LstPersona = new ArrayList<Persona>();
        Persona persona1 = new Persona();
        persona1.setDni("12345678");
        persona1.setEdad(25);
        persona1.setDireccion("Av Arequipa 1799");
        persona1.setDepartamento("Lima");
        persona1.setProvincia("Lima");
        persona1.setDistrito("San Isidro");
        persona1.setEstadoCivil("Soltero");
        persona1.setFechaNacimiento("09/04/1988");
        persona1.setPrimerApellido("Romero");
        persona1.setSegundoApellido("Flores");
        persona1.setPrimerNombre("Jorge");
        persona1.setSegundoNombre("");
        persona1.setSexo("Masculino");
        persona1.setUbigeo("010101");
        persona1.setMensaje("Si");
        
        Persona persona2 = new Persona();
        persona2.setDni("87654321");
        persona2.setEdad(25);
        persona2.setDireccion("Av Wilson 1799");
        persona2.setDepartamento("Lima");
        persona2.setProvincia("Lima");
        persona2.setDistrito("surco");
        persona2.setEstadoCivil("Casado");
        persona2.setFechaNacimiento("09/06/2000");
        persona2.setPrimerApellido("Perez");
        persona2.setSegundoApellido("Ramirez");
        persona2.setPrimerNombre("Juan");
        persona2.setSegundoNombre("Jose");
        persona2.setSexo("Masculino");
        persona2.setUbigeo("010101");
        persona2.setMensaje("Si");
        
        Persona persona3 = new Persona();
        persona3.setDni("88888888");
        persona3.setEdad(25);
        persona3.setDireccion("Av Canada 2020");
        persona3.setDepartamento("Lima");
        persona3.setProvincia("Lima");
        persona3.setDistrito("San Luis");
        persona3.setEstadoCivil("Soltera");
        persona3.setFechaNacimiento("09/06/1987");
        persona3.setPrimerApellido("Martinez");
        persona3.setSegundoApellido("Sajami");
        persona3.setPrimerNombre("Rosa");
        persona3.setSegundoNombre("Luz");
        persona3.setSexo("Femenino");
        persona3.setUbigeo("010101");
        persona3.setMensaje("Si");
        
        LstPersona.add(persona1);
        LstPersona.add(persona2);
        LstPersona.add(persona3);
        
        Persona PersonaRespuesta = new Persona();
        PersonaRespuesta.setMensaje("No");
        Persona PersonaBusqueda = new Persona();
        for( int i=0; i <LstPersona.size(); i++ )
        {
           PersonaBusqueda= LstPersona.get(i);
           if(PersonaBusqueda.getDni().equalsIgnoreCase(dni))
           {
            PersonaRespuesta=PersonaBusqueda;
           }
        }
        
        return PersonaRespuesta;
    }
    
        
    
}
