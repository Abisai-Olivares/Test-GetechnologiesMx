package testSoftware.test.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testSoftware.test.Model.Factura;
import testSoftware.test.Service.VentasRestService;

@RestController
@RequestMapping(value="/api")
public class FacturaController {
	@Autowired
	private VentasRestService ventasRestService;
	
	@PostMapping("/storeFactura")
	public ResponseEntity<Factura> saveFactura ( @Validated @RequestBody Factura factura){
		Factura fact= ventasRestService.storeFactura(factura);
		return new ResponseEntity(fact, HttpStatus.CREATED);

		
	}
	
	
	@GetMapping("/facturaFindbyPersona/{id}")
public List<Factura> finbypersona( @PathVariable("id") int ind){
		
		
		List<Factura>  listP = ventasRestService.findByPersona();
		
		for(int i =0; i<=listP.size();i++) {
			if(listP.get(i).getId()==ind) {
				listP.add(listP.get(i));
				
			}
			
		}
		return listP;
		
		
				}
	

}
