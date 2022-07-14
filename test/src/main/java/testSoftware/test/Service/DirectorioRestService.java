package testSoftware.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testSoftware.test.Model.Persona;
import testSoftware.test.Repository.PersonaRepository;

@Service
public class DirectorioRestService  implements DirectorioService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
  public Persona findByIdentificacion (String identificacion) {
		
		return personaRepository.findPersonaByIdentificacion(identificacion);	}
	
	
	
	@Override 
	public List<Persona> findPersonas(){
			return personaRepository.findAll();
	}
	
	@Override
	public boolean deletePersonaByIdentiicacion (long id) {
		 boolean existe = personaRepository.existsById(id);
		 if(existe) {
	 
			 personaRepository.deleteById(id);
			return  personaRepository.existsById( id);
		 }
		
		return false;
	}
	
	@Override
	public  Persona storePersona(Persona persona) {
		 
			return personaRepository.save(persona);
	      
	}
	
	


	
   
	
	

}
