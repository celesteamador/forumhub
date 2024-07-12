package com.aluracursos.forumhub.domain.topic;

import java.time.LocalDateTime;

public record TopicListData(
        String title,
        String message,
        LocalDateTime creationDate,
        Boolean status,
        Long user,
        Long course
) {
    public TopicListData(Topic topic){
        this(topic.getTitle(), topic.getMessage(), topic.getCreationDate(), topic.getStatus(), topic.getUser().getId(), topic.getCourse().getId()
        );
    }

}
