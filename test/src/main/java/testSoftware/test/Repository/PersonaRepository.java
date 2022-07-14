package testSoftware.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import testSoftware.test.Model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
Persona findPersonaByIdentificacion (String identificacion);
}
