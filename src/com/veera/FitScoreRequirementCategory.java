package com.veera;

import java.util.ArrayList;
import java.util.List;

/**
 * This class holds the Fit score categories
 */
public class FitScoreRequirementCategory {
    /**JD technologies*/
    private List<String> technologies;
    /**From experience range*/
    private int fromExpRange;
    /**To experience range*/
    private int toExpRange;
    /**Education years*/
    private int eduYears;

    public FitScoreRequirementCategory(List<String> technologies, int fromExpRange, int toExpRange, int eduYears) {
        this.technologies = technologies;
        this.fromExpRange = fromExpRange;
        this.toExpRange = toExpRange;
        this.eduYears = eduYears;
    }

    public List<String> getTechnologies() {
        if(null==technologies || technologies.isEmpty())
        {
            technologies = new ArrayList<>();
        }
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public int getFromExpRange() {
        return fromExpRange;
    }
    public void setFromExpRange(int fromExpRange) {
        this.fromExpRange = fromExpRange;
    }

    public int getToExpRange() {
        return toExpRange;
    }
    public void setToExpRange(int toExpRange) {
        this.toExpRange = toExpRange;
    }

    public int getEduYears() {
        return eduYears;
    }
    public void setEduYears(int eduYears) {
        this.eduYears = eduYears;
    }
}