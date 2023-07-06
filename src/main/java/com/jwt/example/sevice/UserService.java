package com.jwt.example.sevice;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {

        store.add(new User(UUID.randomUUID().toString(),"Ankit Gond","ankit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul Lata","rahul@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ram Avadh","Ram@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Aman Gupta","aman@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
