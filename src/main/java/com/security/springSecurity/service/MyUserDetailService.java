package com.security.springSecurity.service;


import com.security.springSecurity.model.Users;
import com.security.springSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Users user=userRepo.findByUserName(username);

        if(user==null){
            System.out.println("User is not found");
            throw  new UsernameNotFoundException("Username not found");
        }
    }
}
