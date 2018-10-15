package ru.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.university.entity.Group;
import ru.university.repository.GroupRepository;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group findByName(String name) {
        return groupRepository.findByName(name);
    }

    @Override
    public Group read(Long id) {
        return groupRepository.getOne(id);
    }

    @Override
    public List<Group> read() {
        return groupRepository.findAll();
    }

    @Override
    public void save(Group entity) {
        groupRepository.save(entity);
    }

    @Override
    public void delete(Group entity) {
        groupRepository.delete(entity);
    }
}
