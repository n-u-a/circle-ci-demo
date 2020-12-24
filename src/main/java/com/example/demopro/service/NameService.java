package com.example.demopro.service;

import java.util.List;

import com.example.demopro.entity.NameEntity;
import com.example.demopro.repository.NameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService {
    @Autowired
    private NameRepository repo;

    public List<NameEntity> getAll() {
        return repo.findAll();
    }
}