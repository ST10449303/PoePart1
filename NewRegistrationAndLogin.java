/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newregistrationandlogin;
import java.util.Scanner;

public class NewRegistrationAndLogin {

    public static void main(String[] args) {
       
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("~~~Registration~~~: ");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        String username = "";
        while(true) {
            System.out.println("Enter username, must contain underscore and not more than 5 characters");
            username = scanner.nextLine();
            if(username.contains("_") && username.length() <= 5) {
                System.out.println("Username is Valid");
                break;
            } else {
                System.out.println("Username must contain underscore and not more than 5 characters");
            }
        }
        String password = "";
        while(true) {
            System.out.println("Enter password (must at least be 8 characters, contain special characters, numbers, alphabets and capital letter:) ");
            password = scanner.nextLine();
            if(password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%&*()_+=|<>?{}\\[\\]~-])(?=.*[A-Z]).{8,}$")) {
                System.out.println("Password is Valid! ");
                break;
            } else {
                System.out.println("Password must at least be 8 characters, contain special characters, numbers, alphabets and capital letter. Try again.");
            }
        }
        String registrationResult = login.registerUser(username, password, firstName, lastName);
        System.out.println(registrationResult);
        System.out.println("***********************************");
        System.out.println("Login:");
        System.out.println("Enter username: ");
        String LoginUsername = scanner.nextLine();
        System.out.println("Enter password: ");
        String LoginPassword = scanner.nextLine();
        boolean loginResult = login.LoginUser(LoginUsername, LoginPassword);
        if(loginResult) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again! ");
        } else {
            System.out.println("Login failed. check username and password. if username or passowrd is incorrect, Try again. ");
        }
    }
}



          

        
    

        
    
    
   
    



        