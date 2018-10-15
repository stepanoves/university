package ru.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.university.entity.Curator;
import ru.university.entity.Group;
import ru.university.service.CuratorService;
import ru.university.service.GroupService;
import ru.university.service.Service;

@RestController
@RequestMapping("/curator")
public class CuratorController extends AbstractController<Curator> {

    @Autowired
    private CuratorService curatorService;


    @Override
    public Service<Curator> getService() {
        return curatorService;
    }
}
