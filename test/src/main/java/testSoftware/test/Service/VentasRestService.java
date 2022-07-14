package testSoftware.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testSoftware.test.Model.Factura;
import testSoftware.test.Repository.FacturaRepository;

@Service
public class VentasRestService  implements VentasService{
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Factura> findByPersona () {
		return facturaRepository.findAll();
		
	}
	@Override
	
	public Factura storeFactura (Factura factura) {
		 
			return  facturaRepository.save(factura);

	       
	}
}
