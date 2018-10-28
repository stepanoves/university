package ru.university.controller;


import javafx.application.Application;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.university.entity.AbstractEntity;
import ru.university.service.Service;

import javax.annotation.PostConstruct;
import java.util.List;


public abstract class AbstractController<T extends AbstractEntity> {

    protected HttpHeaders httpHeaders;
    public abstract Service<T> getService();

    @PostConstruct
    public void init() {
        httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    }
    @GetMapping
    public ResponseEntity<List<T>> get() {
        List<T> entities = getService().read();
        if (entities.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(entities, httpHeaders, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable Long id) {
        T entity = getService().read(id);
        if (entity == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(entity, httpHeaders, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody T entity) {
        getService().save(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> put(@RequestBody T entity) {
        getService().save(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        getService().delete( getService().read(id) );
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
