package com.aluracursos.forumhub.domain.topic;

import com.aluracursos.forumhub.domain.response.Response;
import com.aluracursos.forumhub.domain.user.User;
import com.aluracursos.forumhub.domain.course.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "topics")
@Entity(name = "Topic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;
    private Boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Response> responses;

    public Topic(String title, String message, LocalDateTime creationDate, Boolean status, User user, Course course) {
        this.title = title;
        this.message = message;
        this.creationDate = creationDate;
        this.status = true;
        this.user = user;
        this.course = course;
    }


}
