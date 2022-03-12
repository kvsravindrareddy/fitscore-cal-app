package com.veera;

/**
 * This class results the Fit score response for both the {@link JobSeeker} and {@link Employer}
 */
public class FitScoreResponse {
    /**Job seeker or employer id*/
    private String id;
    /**Job seeker or employer name*/
    private String name;
    /**Job seeker or employer fit score*/
    private int score;

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

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FitScoreResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}