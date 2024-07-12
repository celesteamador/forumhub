package com.aluracursos.forumhub.domain.response;

import com.aluracursos.forumhub.domain.topic.Topic;
import com.aluracursos.forumhub.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "responses")
@Entity(name = "Response")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
    private Topic topic;
    private LocalDateTime creationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private User user;
    private Boolean solution;

    public Response(User user, Topic topic, String message, Boolean solution) {
        this.user = user;
        this.topic = topic;
        this.message = message;
        this.solution = solution;
        this.creationDate = LocalDateTime.now();
    }

}
