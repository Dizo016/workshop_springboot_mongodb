package com.diegosilva.workshopmongo.services;

import com.diegosilva.workshopmongo.domain.Post;
import com.diegosilva.workshopmongo.domain.User;
import com.diegosilva.workshopmongo.dto.UserDTO;
import com.diegosilva.workshopmongo.repository.PostRepository;
import com.diegosilva.workshopmongo.repository.UserRepository;
import com.diegosilva.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searcTitle(text);
    }

}