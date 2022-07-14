package testSoftware.test.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testSoftware.test.Model.Persona;
import testSoftware.test.Service.DirectorioRestService;

@RestController
@RequestMapping(value="/api")
public class PersonaController {

	@Autowired
	private DirectorioRestService directorioRestService;
	
	@PostMapping("/storePersona")
	public ResponseEntity<Persona> savePersona( @Validated @RequestBody Persona persona){
			Persona person=	 directorioRestService.storePersona(persona);
			return new ResponseEntity(person, HttpStatus.CREATED);
				
		
	}
	
	@DeleteMapping("/deletePersona/{matricula}")
	public boolean deletePersona( @PathVariable("matricula") String matricula){
		long id=0;
			List <Persona> listP = directorioRestService.findPersonas();
			for (Persona persona : listP) {
			
				if(persona.getIdentificacion().equalsIgnoreCase(matricula)) {
					id=persona.getId();
					
				}
			}
				return directorioRestService.deletePersonaByIdentiicacion(id);
				
		
	}
	@GetMapping("/findbyPersona/{matricula}")
	public Persona finbypersona( @PathVariable("matricula") String matricula){
		
				return directorioRestService.findByIdentificacion(matricula);
				
		
	}
	
	
	
	@GetMapping("/findPersonas")
	public List<Persona> findPersonas(){
		return directorioRestService.findPersonas();
		
	}
	
	
	
	
}
