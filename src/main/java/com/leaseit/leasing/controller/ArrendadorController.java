package com.leaseit.leasing.controller;

import com.leaseit.leasing.entities.Arrendador;
import com.leaseit.leasing.exeption.ResourceNotFoundException;
import com.leaseit.leasing.repository.ArrendadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ArrendadorController {
    @Autowired
    private ArrendadorRepository arrendadorRepository;

    @GetMapping("/arrendadores")
    public ResponseEntity<List<Arrendador>> getAllArrendadores(){
        List<Arrendador> arrendadores=arrendadorRepository.findAll();
        return new ResponseEntity<List<Arrendador>>(arrendadores, HttpStatus.OK);
    }

    //GET=>http:localthost:8080/api/users/1
    @GetMapping("/arrendadores/{id}")
    public ResponseEntity<Arrendador> getArrendadorById(@PathVariable("id") Long id){
        Arrendador arrendador= arrendadorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found user with id="+id));


        return new ResponseEntity<Arrendador>(arrendador,HttpStatus.OK);
    }

    @PostMapping("/arrendadores")
    public ResponseEntity<Arrendador> createArrendador(@RequestBody Arrendador arrendador){
        Arrendador newArrendador= arrendadorRepository.save(
                new Arrendador(
                        arrendador.getNombre(),
                        arrendador.getTEP(),
                        arrendador.getP_recompra(),
                        arrendador.getComision(),
                        arrendador.getS_riesgo()));
        return new ResponseEntity<Arrendador>(newArrendador,HttpStatus.CREATED);
    }
    //PUT=>http:localthost:8080/api/users/1
    @PutMapping("/arrendadores/{id}")
    public ResponseEntity<Arrendador> updateArrendador(
            @PathVariable("id") Long id,
            @RequestBody Arrendador arrendador){
        Arrendador arrendadorUpdate= arrendadorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found post with id="+id));

        arrendadorUpdate.setNombre(arrendador.getNombre());
        arrendadorUpdate.setTEP(arrendador.getTEP());
        return new ResponseEntity<Arrendador>(arrendadorRepository.save(arrendadorUpdate),
                HttpStatus.OK);
    }

    @DeleteMapping("/arrendadores/{id}")
    public ResponseEntity<HttpStatus> deleteArrendador(@PathVariable("id") Long id){
        arrendadorRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
