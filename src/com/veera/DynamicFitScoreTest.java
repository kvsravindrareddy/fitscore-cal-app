package com.veera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is to test the Employer and Job Seeker fit score.
 */
public class DynamicFitScoreTest {
    public static void main(String[] args) {
        DynamicJobSeeker jobSeeker = new DynamicJobSeeker();
        jobSeeker.setId("N123");
        jobSeeker.setName("Veera Kakarla");
        jobSeeker.setEduYears(15);
        jobSeeker.setExperienceLevel(15);
        List<String> technologies = new ArrayList<>(Arrays.asList("Java","JSP","Servlets"));
        jobSeeker.setTechnologies(technologies);
        DynamicFitScoreRequirementCategory fitScoreCategory = DynamicFitScoreUtility.matchingBucket();
        FitScoreResponse fitScoreResponse = DynamicFitScoreUtility.findJobSeekerFitScore(jobSeeker, fitScoreCategory);
        System.out.println(fitScoreResponse.toString());
    }
}