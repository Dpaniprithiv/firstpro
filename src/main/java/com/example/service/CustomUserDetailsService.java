package com.example.service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load user data from your data source (e.g., database)
        // In this example, we'll use hardcoded data for demonstration purposes
        String userPassword = "encodedPassword"; // Replace with actual password hash

        // Load roles and authorities from your data source
        List<String> userRoles = getUserRolesFromDatabase(username);

        // Create a list to hold the user's authorities (roles and permissions)
        List<GrantedAuthority> authorities = new ArrayList<>();

        // Add roles as authorities (prefixed with "ROLE_")
        for (String role : userRoles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        }

        // Add additional authorities/permissions if needed
        // authorities.add(new SimpleGrantedAuthority("PERMISSION_READ"));

        // Create a UserDetails object with the user's information
        UserDetails userDetails = new User(username, userPassword, authorities);

        return userDetails;
    }

    // Simulate loading user roles from a database
    private List<String> getUserRolesFromDatabase(String username) {
        // In a real application, you would query your database to get user roles
        // Here, we'll return hardcoded roles for demonstration purposes
        List<String> roles = new ArrayList<>();
        if ("admin".equals(username)) {
            roles.add("ADMIN");
            roles.add("USER");
        } else if ("user".equals(username)) {
            roles.add("USER");
        }
        return roles;
    }
}

