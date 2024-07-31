package com.example.DTOexample.serviceImpl;

import com.example.DTOexample.DTO.Userdto;
import com.example.DTOexample.Mapper.UserMapper;
import com.example.DTOexample.Model.User;
import com.example.DTOexample.Repository.userRepository;
import com.example.DTOexample.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {

    @Autowired
    userRepository userrepo;

    @Override
    public User createuser(User user) {
      return userrepo.save(user);
    }

    @Override
    public List<Userdto> getAlluser() {
       List<User> userList=userrepo.findAll();
       List<Userdto> userdtoList= new ArrayList<>();
       for(User user:userList) {
           //Custom Mapper
           Userdto userdtos = UserMapper.ConvertEntitytouserdto(user);

           // ModelMapper
           //UserDto userDto = modelMapper.map(user, UserDto.class);

           userdtoList.add(userdtos);
       }
       return userdtoList;
    }

    @Override
    public Userdto getuserbyId(Long id) {
      Optional<User> getuserbyid = userrepo.findById(id);
      Userdto getuserbyiddto=UserMapper.ConvertEntitytouserdto(getuserbyid.get());
      return getuserbyiddto;
    }

//    @Override
//    public String deleteuserbyId(int id) {
//        return null;
//    }
}
