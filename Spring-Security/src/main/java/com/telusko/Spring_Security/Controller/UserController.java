package com.telusko.Spring_Security.Controller;


import com.telusko.Spring_Security.Service.JwtService;
import com.telusko.Spring_Security.Service.UserService;
import com.telusko.Spring_Security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
     private UserService userService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("register")
    public User register(@RequestBody User user ){
        return userService.saveUser(user);
    }


    @PostMapping("login")
    public String login(@RequestBody User user) {

        Authentication authentication = authenticationManager
                           .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

                if(authentication.isAuthenticated()){
                    return jwtService.generateToken(user.getUsername());
                }else{
                    return " faliure";
                }
    }
}
