package com.example.DTOexample.controller;

import com.example.DTOexample.DTO.Userdto;
import com.example.DTOexample.Model.User;
import com.example.DTOexample.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Reference Link: https://github.com/LuisSalas94/Spring-Boot-User-DTO/tree/main/src/main/java/com/userdemo/dto
@RestController
@RequestMapping("/api")
public class Usercontroller {
   @Autowired
    private userService userservice;

   @PostMapping("/createuser")
   public ResponseEntity<User> createuser(@RequestBody User user){
      User savedUser =userservice.createuser(user);
      return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
   }

   @GetMapping("/getalluser")
   public ResponseEntity<List<Userdto>> getalluser(){
      List<Userdto> getallusers =userservice.getAlluser();
      return new ResponseEntity<>(getallusers,HttpStatus.OK);
   }

   @GetMapping("/getuserbyid/{id}")
    public ResponseEntity<Userdto> getuserbyId(@PathVariable(name = "id") Long userid){
        Userdto getuserdtobyId =userservice.getuserbyId(userid);
        return new ResponseEntity<>(getuserdtobyId,HttpStatus.OK);
   }

}
