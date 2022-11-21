package com.leaseit.leasing.controller;

import com.leaseit.leasing.entities.Activo;
import com.leaseit.leasing.entities.User;
import com.leaseit.leasing.exeption.ResourceNotFoundException;
import com.leaseit.leasing.repository.ActivoRepository;
import com.leaseit.leasing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ActivoController {
    @Autowired
    private ActivoRepository activoRepository;

    @GetMapping("/activos")
    public ResponseEntity<List<Activo>> getAllUsers(){
        List<Activo> activos=activoRepository.findAll();
        return new ResponseEntity<List<Activo>>(activos, HttpStatus.OK);
    }

    //GET=>http:localthost:8080/api/users/1
    @GetMapping("/activos/{id}")
    public ResponseEntity<Activo> getActivoById(@PathVariable("id") Long id){
        Activo activo= activoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found user with id="+id));


        return new ResponseEntity<Activo>(activo,HttpStatus.OK);
    }

    @PostMapping("/activos")
    public ResponseEntity<Activo> createActivo(@RequestBody Activo activo){
        Activo newActivo= activoRepository.save(
                new Activo(
                        activo.getNombre(),
                        activo.getPrecio(),
                        activo.getPrecio()));
        return new ResponseEntity<Activo>(newActivo,HttpStatus.CREATED);
    }
    //PUT=>http:localthost:8080/api/users/1
    @PutMapping("/activos/{id}")
    public ResponseEntity<Activo> updateActivo(
            @PathVariable("id") Long id,
            @RequestBody Activo activo){
        Activo activoUpdate= activoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found post with id="+id));

        activoUpdate.setNombre(activo.getNombre());
        activoUpdate.setPrecio(activo.getPrecio());
        activoUpdate.setG_inicial(activo.getG_inicial());
        return new ResponseEntity<Activo>(activoRepository.save(activoUpdate),
                HttpStatus.OK);
    }

    @DeleteMapping("/activos/{id}")
    public ResponseEntity<HttpStatus> deleteActivo(@PathVariable("id") Long id){
        activoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
