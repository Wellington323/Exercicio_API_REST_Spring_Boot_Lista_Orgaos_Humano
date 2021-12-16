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

import com.humano.c_humano.models.Humano;
import com.humano.c_humano.repository.HumanoRepository;

@RestController 
@RequestMapping(value="/api")
public class HumanoController {


@Autowired
 HumanoRepository  humanoRepository; 


@GetMapping("/humano")
 private List<Humano> listahumanos(){
	return humanoRepository.findAll();  
 }
 
  @GetMapping("/humano/{id}")
  private Humano listaHumanoUnico(@PathVariable(value="id") long id ){
	  return humanoRepository.findById(id); 
  }
  
  @PostMapping("/humano")
  private Humano salvaHumano(@RequestBody Humano humano){
    return humanoRepository.save(humano); 
  }  
    @DeleteMapping("/humano")
    public void deleteHumano(@RequestBody Humano humano) { 
       humanoRepository.delete(humano);
    }  
      
      @PutMapping("/humano")
      public Humano alutalizarHumano(@RequestBody Humano humano) {
        return humanoRepository.save(humano);  
     }

}





















     

