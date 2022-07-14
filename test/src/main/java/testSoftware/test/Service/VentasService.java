package testSoftware.test.Service;

import java.util.List;

import testSoftware.test.Model.Factura;

public interface VentasService {
	
public	List<Factura> findByPersona ();
	 Factura storeFactura (Factura factura) ;

}
