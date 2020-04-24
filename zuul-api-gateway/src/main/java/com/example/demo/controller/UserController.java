/*
 * package com.example.demo.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.model.UserModel; import
 * com.example.demo.service.UserServiceImpl;
 * 
 * @RestController public class UserController {
 * 
 * @Autowired UserServiceImpl service;
 * 
 * @Value("${spring.security.user.name}") private String username;
 * 
 * @Value("${spring.security.user.password}") private String password;
 * 
 * @GetMapping("/login") public void logindetails(UserModel user) { UserModel
 * test = service.getLoginDetails(user); username = test.getEmailId(); password
 * = test.getPassword();
 * 
 * }
 * 
 * @GetMapping("/adduser") public boolean addUser(UserModel user) { return
 * service.createUser(user); } }
 */