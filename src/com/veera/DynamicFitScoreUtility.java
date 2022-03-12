package com.veera;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This utility class to identifies the fit score for both {@link Employer} and {@link JobSeeker}
 */
public class DynamicFitScoreUtility {


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
    public static FitScoreResponse findJobSeekerFitScore(DynamicJobSeeker jobSeeker, DynamicFitScoreRequirementCategory fitScoreCategory) {
        FitScoreResponse fitScoreResponse = new FitScoreResponse();
        int originalFitScore = 100;
        int expectedFitScore = 0;
        if ((jobSeeker.getExperienceLevel() >= fitScoreCategory.getFromExpRange() && jobSeeker.getExperienceLevel() <= fitScoreCategory.getToExpRange())
                && (jobSeeker.getEduYears() >= fitScoreCategory.getEduYears())) {
            List<String> jobSeekerTechnologies = jobSeeker.getTechnologies();
            //List<String> fitScoreCategoryTechnologies = fitScoreCategory.getTechnologies();
            Map<String, Integer> fitScoreCategoryTechnologies = new HashMap<>();
            int eachCategoryScore = originalFitScore / fitScoreCategoryTechnologies.size();
            System.out.println("Each category score : " + eachCategoryScore);
            //fitScoreCategoryTechnologies.addAll(jobSeekerTechnologies);
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
    public static DynamicFitScoreRequirementCategory matchingBucket() {
        //List<String> technologies = new ArrayList<>(Arrays.asList("Java", "Angular", "Spring", "SpringBoot", "Python"));
        Map<String, Integer> technologies = new HashMap<>();
        technologies.put("AWS", 10);
        technologies.put("Java",30);
        technologies.put("SpringBoot",30);
        technologies.put("HTML",10);
        technologies.put("Angular",20);
        return new DynamicFitScoreRequirementCategory(technologies, 3, 15, 15);
    }
}