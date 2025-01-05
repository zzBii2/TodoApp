package com.sochoeun.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sochoeun.domain.entity.Priority;
import com.sochoeun.domain.entity.Status;
import com.sochoeun.domain.entity.TaskList;

public record TaskDto(
        UUID id,
        String title,
        String description,

        @JsonProperty("due_date") LocalDateTime dueDate,
        Status status,
        Priority priority,

        @JsonProperty("task_list_id") TaskList taskList,

        @JsonProperty("created_at") LocalDateTime createdAt,
        @JsonProperty("updated_at") LocalDateTime updatedAt) {
}
