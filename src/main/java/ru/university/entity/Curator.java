package ru.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "curators", schema = "public")
public class Curator extends AbstractEntity implements Serializable {

    private String name;
    private String surname;
    private String telephone;
    private String position;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "curator")
    private List<Group> groups;

    public Curator() {
    }

    public Curator(Long id, String name, String surname, String telephone, String position, List<Group> groups) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.position = position;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
