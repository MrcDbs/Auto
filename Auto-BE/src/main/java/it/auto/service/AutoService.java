package it.auto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.auto.model.Automobile;
import it.auto.model.AutomobileDto;
import it.auto.model.Dettaglio;
import it.auto.model.DettaglioDto;
import it.auto.repo.AutomobileRepo;
import it.auto.repo.DettaglioRepo;

@Service
public class AutoService {
	
	@Autowired
	private AutomobileRepo autoRepo;
	
	@Autowired
	private DettaglioRepo dettaglioRepo;
	
	@Transactional
	public AutomobileDto saveAuto(AutomobileDto auto) {
		Dettaglio dettaglioEntity = new Dettaglio();
		Automobile autoEntity = new Automobile();
		dettaglioEntity.setColore(auto.getDettagli().getColore());
		dettaglioEntity.setCavalli(auto.getDettagli().getCavalli());
		dettaglioEntity.setCilindrata(auto.getDettagli().getCilindrata());
		dettaglioEntity.setInterni(auto.getDettagli().getInterni());
		dettaglioEntity.setKm(auto.getDettagli().getKm());
		dettaglioEntity.setTipoMotore(auto.getDettagli().getTipoMotore());
		Dettaglio dettaglio = this.dettaglioRepo.save(dettaglioEntity);
		autoEntity.setMarca(auto.getMarca());
		autoEntity.setModello(auto.getModello());
		autoEntity.setAnno(auto.getAnno());
		autoEntity.setTarga(auto.getTarga());
		autoEntity.setDettaglio(dettaglio);
		if(this.autoRepo.save(autoEntity) != null) {
			return auto;
		}
		return null;
		
	}
	
	public List<AutomobileDto> getListaAuto(){
		List<Automobile> listaAuto = this.autoRepo.findAll();
		List<AutomobileDto> listaDto = new ArrayList<>();
		listaAuto.stream().forEach(a -> {
			AutomobileDto dto = new AutomobileDto();
			DettaglioDto dedto = new DettaglioDto();
			dto.setId(a.getId());
			dto.setMarca(a.getMarca());
			dto.setModello(a.getModello());
			dto.setAnno(a.getAnno());
			dto.setTarga(a.getTarga());
			dto.setFoto(null);
			dedto.setKm(a.getDettaglio().getKm());
			dedto.setColore(a.getDettaglio().getColore());
			dedto.setInterni(a.getDettaglio().getColore());
			dedto.setCavalli(a.getDettaglio().getCavalli());
			dedto.setCilindrata(a.getDettaglio().getCilindrata());
			dedto.setTipoMotore(a.getDettaglio().getTipoMotore());
			dto.setDettagli(dedto);
			listaDto.add(dto);
		});
		return listaDto;
	}
	
	public AutomobileDto getById(Long id){
		AutomobileDto dto = new AutomobileDto();
		Automobile a = this.autoRepo.findById(id).get();
		DettaglioDto dedto = new DettaglioDto();
		dto.setId(a.getId());
		dto.setMarca(a.getMarca());
		dto.setModello(a.getModello());
		dto.setAnno(a.getAnno());
		dto.setTarga(a.getTarga());
		dto.setFoto(null);
		dedto.setKm(a.getDettaglio().getKm());
		dedto.setColore(a.getDettaglio().getColore());
		dedto.setInterni(a.getDettaglio().getColore());
		dedto.setCavalli(a.getDettaglio().getCavalli());
		dedto.setCilindrata(a.getDettaglio().getCilindrata());
		dedto.setTipoMotore(a.getDettaglio().getTipoMotore());
		dto.setDettagli(dedto);
		return dto;
	} 
}
