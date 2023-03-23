package com.edecursojava.workshopmongo.services;

import com.edecursojava.workshopmongo.domain.Post;
import com.edecursojava.workshopmongo.repository.PostRepository;
import com.edecursojava.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Optional<Post> findById(String id){
        Optional<Post> user = repository.findById(id);
        if(user == null){
            throw new ObjectNotFoundException("objeto não encontrado");
        }
        return user;
    }


 }
