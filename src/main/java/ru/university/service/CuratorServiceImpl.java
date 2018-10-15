package ru.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.university.entity.Curator;
import ru.university.repository.CuratorRepository;

import java.util.List;

@Service
public class CuratorServiceImpl implements CuratorService{
    @Autowired
    private CuratorRepository curatorRepository;
    @Override
    public Curator read(Long id) {
        return curatorRepository.getOne(id);
    }

    @Override
    public List<Curator> read() {
        return curatorRepository.findAll();
    }

    @Override
    public void save(Curator entity) {
        curatorRepository.save(entity);
    }

    @Override
    public void delete(Curator entity) {
        curatorRepository.delete(entity);
    }
}
