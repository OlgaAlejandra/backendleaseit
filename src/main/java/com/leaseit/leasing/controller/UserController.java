package com.leaseit.leasing.controller;

import com.leaseit.leasing.entities.User;
import com.leaseit.leasing.exeption.ResourceNotFoundException;
import com.leaseit.leasing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users=userRepository.findAll();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    //GET=>http:localthost:8080/api/users/1
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
        User user= userRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found user with id="+id));


        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser= userRepository.save(
                        new User(
                                user.getName(),
                                user.getRUC(),
                                user.getEmail(),
                                user.getPassword()));
        return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
    }
    //PUT=>http:localthost:8080/api/users/1
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable("id") Long id,
            @RequestBody User user){
        User userUpdate= userRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found post with id="+id));

        userUpdate.setEmail(user.getEmail());
        userUpdate.setPassword(user.getPassword());
        return new ResponseEntity<User>(userRepository.save(userUpdate),
                HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id){
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
