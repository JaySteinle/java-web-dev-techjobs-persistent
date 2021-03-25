package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    @NotBlank
    @Size(min=1, max=100, message="location contains too many characters(100 max)")
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<> ();

    public Employer() {}

    public Employer(@Size(min = 1, max = 100, message = "location contains too many characters(100 max)") String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
