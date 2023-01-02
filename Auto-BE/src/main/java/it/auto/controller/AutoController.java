package it.auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.auto.model.Automobile;
import it.auto.model.AutomobileDto;
import it.auto.service.AutoService;

@RestController
@RequestMapping("/autoController")
@CrossOrigin(value="http://localhost:4200/")
public class AutoController {
	
	@Autowired
	private AutoService autoService;
	
	
	@PostMapping(value="/salvaAuto", consumes="application/json")
	public AutomobileDto salvaAuto(@RequestBody AutomobileDto autoView) {
		return this.autoService.saveAuto(autoView);
	}
	
	@GetMapping(value="/getListaAuto", produces="application/json")
	public List<AutomobileDto>  getListaAuto() {
		return this.autoService.getListaAuto();
	}
	@GetMapping(value="/getById/{id}", produces="application/json")
	public AutomobileDto  getById(@PathVariable Long id) {
		return this.autoService.getById(id);
	}
	@DeleteMapping(value="/deleteById/{id}", produces="application/json")
	public AutomobileDto  deleteById(@PathVariable Long id) {
		return this.autoService.deleteById(id);
	}
	@PutMapping(value="/updateAuto/{id}", consumes="application/json")
	public AutomobileDto salvaAuto(@RequestBody AutomobileDto autoView,@PathVariable Long id) {
		return this.autoService.updateAuto(autoView,id);
	}

}
