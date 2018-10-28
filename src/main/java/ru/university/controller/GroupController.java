package ru.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.university.entity.Group;
import ru.university.service.GroupService;
import ru.university.service.Service;

@RestController
@RequestMapping("/group")
public class GroupController extends AbstractController<Group> {

    @Autowired
    private GroupService groupService;

    //@PreAuthorize("hasAnyRole('ADMIN, USER')")
    @GetMapping("/name/{name}")
    public ResponseEntity<Group> getGroupByName(@PathVariable String name) {
        Group group = groupService.findByName(name);
        if ( group == null ) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(group, httpHeaders, HttpStatus.OK);
    }
    @Override
    public Service<Group> getService() {
        return groupService;
    }
}
