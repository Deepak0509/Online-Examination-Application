package com.examportalbackend.services.implementation;

import com.examportalbackend.models.User;
import com.examportalbackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null)
            return user;
        throw new UsernameNotFoundException("User Not Found!");
    }
    
    /*
    public UserDetails loadUserByUseremail(String useremail) throws UseremailNotFoundException {
    	User user = userRepository.findByUseremail(useremail);
    	
    	if(user != null)
    		return user;
    	
    	throw new UseremailNotFoundException("User Not Found!");
    }
    */
    
}
