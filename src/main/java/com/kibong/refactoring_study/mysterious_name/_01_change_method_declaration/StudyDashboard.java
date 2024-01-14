package com.kibong.refactoring_study.mysterious_name._01_change_method_declaration;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * StudyDashboard 클래스는 학습용 대시보드를 나타냅니다. 이 클래스는 GitHub issue에서 리뷰를 불러오고,
 * 사용자 이름을 검색하고 리뷰를 검색하는 기능을 제공합니다.
 */
public class StudyDashboard {

    private Set<String> usernames = new HashSet<>();

    private Set<String> reviews = new HashSet<>();


    /**
     * GitHub 이슈로부터 리뷰를 불러옵니다.
     *
     * @throws IOException 리뷰를 불러오는 동안 I/O 에러가 발생할 경우
     */
    private void loadReviews() throws IOException {

        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        List<GHIssueComment> comments = issue.getComments();
        for (GHIssueComment comment : comments) {
            usernames.add(comment.getUserName());
            reviews.add(comment.getBody());
        }
    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public Set<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) throws IOException {

        StudyDashboard studyDashboard = new StudyDashboard();

        //선언부가 적절한가?
        //스터디 리뷰를 하는지 읽어오는지 명확하지 않다.
        //studyDashboard.studyReviews(issue);

        studyDashboard.loadReviews();
        studyDashboard.getUsernames().forEach(System.out::println);
        studyDashboard.getReviews().forEach(System.out::println);
    }
}
