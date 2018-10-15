package ru.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.university.entity.Curator;

@Repository
public interface CuratorRepository extends JpaRepository<Curator, Long> {

}
