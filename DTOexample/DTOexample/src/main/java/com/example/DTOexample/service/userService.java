package com.example.DTOexample.service;

import com.example.DTOexample.DTO.Userdto;
import com.example.DTOexample.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface userService {
    User createuser(User user);
    List<Userdto> getAlluser();

    Userdto getuserbyId(Long id);

//    String deleteuserbyId(int id);

}
