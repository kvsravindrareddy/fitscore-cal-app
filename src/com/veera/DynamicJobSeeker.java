package com.veera;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds the Job seeker data to calculate the fit score
 */
public class DynamicJobSeeker {
    /**Unique id for the job seeker*/
    private String id;
    /**Job seeker first name and last name*/
    private String name;
    /**Job seeker technologies*/
    private List<String> technologies;
    /**Job seeker experience level*/
    private int experienceLevel;
    /**Job seeker education years*/
    private int eduYears;

    public List<String> getTechnologies() {
        return technologies;
    }
    public void setTechnologies(List<String> technologies) {
        if(null==technologies || technologies.isEmpty())
        {
            technologies = new ArrayList<>();
        }
        this.technologies = technologies;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }
    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public int getEduYears() {
        return eduYears;
    }
    public void setEduYears(int eduYears) {
        this.eduYears = eduYears;
    }
}