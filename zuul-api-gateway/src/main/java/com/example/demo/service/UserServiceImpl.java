/*
 * package com.example.demo.service;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.demo.AccountProxy; import
 * com.example.demo.model.AccountDetails; import
 * com.example.demo.model.UserModel; import
 * com.example.demo.repository.UserRepo;
 * 
 * 
 * @Service public class UserServiceImpl implements UserService {
 * 
 * @Autowired AccountProxy proxy;
 * 
 * @Autowired UserRepo repo;
 * 
 * @Override public boolean createUser(UserModel user) { // TODO Auto-generated
 * method stub AccountDetails details =
 * proxy.getByAccName(user.getAccountName()); UserModel userDetails = new
 * UserModel(details.getEmailId(), details.getPassword(),
 * details.getAccountName()); repo.save(userDetails); return true; }
 * 
 * @Override public UserModel getLoginDetails(UserModel user) { // TODO
 * Auto-generated method stub Optional<UserModel> temp =
 * repo.findById(user.getAccountName()); if(temp.isPresent()) { temp.get(); }
 * return user; }
 * 
 * 
 * 
 * }
 */