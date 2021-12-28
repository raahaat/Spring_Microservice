package com.user.service;

import com.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

   List<User> list = List.of(
           new User(0001L, "Rahat", "01677064052"),
           new User(0002L, "Annie", "01515604236"),
           new User(0003L, "rafi", "01632727273")
   );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
