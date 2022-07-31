package com.portfolio.nicolasazaceta.Interface;

import com.portfolio.nicolasazaceta.entity.Persona;
import java.util.List;



public interface IPersonaService {
   
    //Traer una Persona
 public List<Persona> getPersona();     

         
    //Guardar un objeto de tipo Persona
         public void savePersona(Persona persona);
         
    //Eliminar un objeto buscado por ID
         public void deletePersona(Long id);
         
    //Buscar persona por ID

         
        public Persona findPersona(long id);
         
         
         
         }
