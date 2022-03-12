package com.veera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is to test the Employer and Job Seeker fit score.
 */
public class FitScoreTest {
    public static void main(String[] args) {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setId("N123");
        jobSeeker.setName("Veera Kakarla");
        jobSeeker.setEduYears(15);
        jobSeeker.setExperienceLevel(15);
        List<String> technologies = new ArrayList<>(Arrays.asList("Java","JSP","Servlets"));
        jobSeeker.setTechnologies(technologies);
        FitScoreRequirementCategory fitScoreCategory = FitScoreUtility.matchingBucket();
        FitScoreResponse fitScoreResponse = FitScoreUtility.findJobSeekerFitScore(jobSeeker, fitScoreCategory);

        System.out.println(fitScoreResponse.toString());
    }
}
