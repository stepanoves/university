package ru.university.service;

import ru.university.entity.Group;

public interface GroupService extends Service<Group> {

    Group findByName(String name);

}
