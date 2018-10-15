package ru.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.university.entity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByName(String name);

}
