package com.veera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class holds the Fit score categories
 */
public class DynamicFitScoreRequirementCategory {
    /**JD technologies*/
    private Map<String, Integer> technologies;
    /**From experience range*/
    private int fromExpRange;
    /**To experience range*/
    private int toExpRange;
    /**Education years*/
    private int eduYears;

    public DynamicFitScoreRequirementCategory(Map<String, Integer> technologies, int fromExpRange, int toExpRange, int eduYears) {
        this.technologies = technologies;
        this.fromExpRange = fromExpRange;
        this.toExpRange = toExpRange;
        this.eduYears = eduYears;
    }

    public Map<String, Integer> getTechnologies() {
        if(null==technologies || technologies.isEmpty())
        {
            technologies = new HashMap<>();
        }
        return technologies;
    }

    public void setTechnologies(Map<String, Integer> technologies) {
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