package com.humano.c_humano.controller;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humano.c_humano.models.Orgaos;
import com.humano.c_humano.repository.OrgaosRepository;
 
@RestController
@RequestMapping(value="/api")
public class OrgaosController {
	
	@Autowired
	OrgaosRepository orgaosRepository;
	
	@GetMapping("/orgaos")
	private List<Orgaos>listaorgaos(){
	  return orgaosRepository.findAll(); 
   }	  
	  @GetMapping("/orgaos/{id}")
	  private Orgaos listaOrgaosuUnico (@PathVariable(value="id") long id){  
	   return orgaosRepository.findById(id);  
   }   
	  @PostMapping("orgaos")
	    private Orgaos salvarOrgaos(@RequestBody Orgaos orgaos){  
	     return orgaosRepository.save(orgaos); 
   }   
	   
	  @DeleteMapping("orgaos")
	    private void deleterOrgaos(@RequestBody Orgaos orgaos) {
	      orgaosRepository.delete(orgaos); 
	      
   }	      
	   @PutMapping("orgaos")
	   private Orgaos autalizarOrgaos(@RequestBody Orgaos orgaos){
		 return orgaosRepository.save(orgaos);   

}
   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
  