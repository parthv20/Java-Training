package com.telusko.Spring_Security.Config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
      @Autowired
      private  UserDetailsService userDetailsService;

      @Autowired
      private JwtFilter jwtFilter;

        @Bean
        public AuthenticationProvider authenticationProvider() {
            DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
            provider.setUserDetailsService(userDetailsService);
         //   provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); normal usage
            provider.setPasswordEncoder(new BCryptPasswordEncoder(12));//fro bcrypt thingy

            return provider;
        }

    //Disabling csrf token

    @Bean
    public SecurityFilterChain  securityFilterChain(HttpSecurity http)throws Exception{

   http.csrf(customizer -> customizer.disable());
   http.authorizeHttpRequests(request -> request
           .requestMatchers("register","login")//this is in that case where while rgistering suer login wont be asked
           .permitAll()//2nd line of code for not asking login and permitall to register
           .anyRequest().authenticated());
  // http.formLogin(Customizer.withDefaults());// formlogin not required when stateless is mentioned in the code
   http.httpBasic(Customizer.withDefaults());
   http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
           .addFilterBefore(jwtFilter,UsernamePasswordAuthenticationFilter.class);//code for making the resdt api stateless it was stateful by default
  return http.build();
    }


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
            return authenticationConfiguration.getAuthenticationManager();
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user = User
//                .withDefaultPasswordEncoder()//use this method only  for learning process,otherwise it is deproicated
//                .username("Parth")
//                .password("p@1234")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User
//                .withDefaultPasswordEncoder()//use this method only  for learning process,otherwise it is deproicated
//                .username("admin")
//                .password("a@1234")
//                .roles("ADMIN")
//                .build();
//
//
//        return new InMemoryUserDetailsManager();
//    }

}
