/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newregistrationandlogin;

public class Login {
    private  String username;
    private  String password;
    
  
    public boolean checkUserName(String username) {
        // Check if username meets requirements
        return !username.isEmpty();
    }

    
    public boolean checkPasswordComplexity(String password) {
       // Please Check if password meets the requirements 
       return password.matches("^(?=.[A-Za-z])(?=.\\d)(?=.[!@#$%&()_+=|<>?{}\\[\\]~-]).{8,}$");
        
    }


    
    public String registerUser(String username, String password, String firstName, String lastName) { 
        if (checkUserName(username) && checkPasswordComplexity(password)) {
            this.username = username;
            this.password = password;
            return "User registered successfully!";
        } else {
            return "Registration failed. Please check username and password complexity";
        }
    }
    
   
  public boolean LoginUser(String username, String password) { //Removed duplicate declaration
    return username.equals(username) && password.equals(password); // Fixed typo
 
  }
}
