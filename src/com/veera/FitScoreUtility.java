package com.veera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This utility class to identifies the fit score for both {@link Employer} and {@link JobSeeker}
 */
public class FitScoreUtility {


    /**
     * This method calculates the {@link Employer} fit score for the given both candidate and job seeker
     *
     * @return
     */
    public static int findEmpFitScore(Employer employer) {
        int fitScore = 0;

        return fitScore;
    }

    /**
     * This method calculates the {@link JobSeeker} fit score for the given both candidate and job seeker
     *
     * @return {@link FitScoreResponse}
     */
    public static FitScoreResponse findJobSeekerFitScore(JobSeeker jobSeeker, FitScoreRequirementCategory fitScoreCategory) {
        FitScoreResponse fitScoreResponse = new FitScoreResponse();
        int originalFitScore = 100;
        int expectedFitScore = 0;
        if ((jobSeeker.getExperienceLevel() >= fitScoreCategory.getFromExpRange() && jobSeeker.getExperienceLevel() <= fitScoreCategory.getToExpRange())
                && (jobSeeker.getEduYears() >= fitScoreCategory.getEduYears())) {
            List<String> jobSeekerTechnologies = jobSeeker.getTechnologies();
            List<String> fitScoreCategoryTechnologies = fitScoreCategory.getTechnologies();
            int eachCategoryScore = originalFitScore / fitScoreCategoryTechnologies.size();
            System.out.println("Each category score : " + eachCategoryScore);
            fitScoreCategoryTechnologies.addAll(jobSeekerTechnologies);
            List<String> distinctList = jobSeekerTechnologies.stream().distinct().collect(Collectors.toList());
            expectedFitScore = distinctList.size() * eachCategoryScore;
        }
        fitScoreResponse.setId(jobSeeker.getId());
        fitScoreResponse.setName(jobSeeker.getName());
        fitScoreResponse.setScore(expectedFitScore);
        return fitScoreResponse;
    }

    /**
     * This will have the fixed matching categories
     *
     * @return {@link FitScoreRequirementCategory}
     */
    public static FitScoreRequirementCategory matchingBucket() {
        List<String> technologies = new ArrayList<>(Arrays.asList("Java", "Angular", "Spring", "SpringBoot", "Python"));
        return new FitScoreRequirementCategory(technologies, 3, 15, 15);
    }
}