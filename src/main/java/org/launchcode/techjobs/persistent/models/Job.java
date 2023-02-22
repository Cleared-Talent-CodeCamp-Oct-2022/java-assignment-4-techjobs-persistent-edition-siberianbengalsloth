package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity {

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

    @ManyToOne
    private Employer employer;
 // private String skills;

    public Job() {
    }

    public Job(Employer employer) {
        super();
        this.employer = employer;
    //  this.skills = someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;}

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
