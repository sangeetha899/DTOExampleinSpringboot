package com.example.DTOexample.Mapper;

import com.example.DTOexample.DTO.Userdto;
import com.example.DTOexample.Model.User;

//custom Mapper
public class UserMapper {

    public static Userdto ConvertEntitytouserdto(User user){
      Userdto userdto = new Userdto();
              userdto.setUserid(user.getUserid());
              userdto.setEmail(user.getEmail());
              userdto.setFirstname(user.getFirstName());
              userdto.setLastname(user.getLastName());
              return userdto;

    }
}
