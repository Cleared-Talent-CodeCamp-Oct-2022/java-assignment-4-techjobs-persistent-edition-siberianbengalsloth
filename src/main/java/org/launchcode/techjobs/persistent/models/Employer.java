package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 50)
    private String location;

    @OneToMany(mappedBy = "employer")
    @JoinColumn
    private final List<Job> job = new ArrayList<>();

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
