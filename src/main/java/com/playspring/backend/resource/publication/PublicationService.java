package com.playspring.backend.resource.publication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicationService {

    @Autowired
    PublicationRepository publicationRepository;

    public List<Publication> findAllPublication(){
        List<Publication> publications = new ArrayList<>();
        publicationRepository.findAll().forEach(publications::add);
        return publications;
    }

    public void savePublication(Publication publication){
        publicationRepository.save(publication);
    }

}
