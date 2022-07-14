package testSoftware.test.Service;

import java.util.List;

import testSoftware.test.Model.Persona;

public interface DirectorioService {
	Persona findByIdentificacion (String identifiacion);
	public  List<Persona> findPersonas();
	 boolean deletePersonaByIdentiicacion (long id);
	
	 Persona storePersona (Persona persona);

	

}
