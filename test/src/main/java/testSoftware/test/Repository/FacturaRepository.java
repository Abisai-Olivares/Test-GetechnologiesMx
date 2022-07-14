package testSoftware.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import testSoftware.test.Model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
	
	List <Factura> 	findFacturasByPersona(int idPersona);
}
