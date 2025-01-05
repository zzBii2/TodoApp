package com.sochoeun.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sochoeun.domain.entity.Priority;
import com.sochoeun.domain.entity.Status;

public record TaskDto(
        String id,
        String title,
        String description,

        @JsonProperty("due_date") LocalDateTime dueDate,
        Status status,
        Priority priority,

        @JsonProperty("task_list_id") UUID taskList,

        @JsonProperty("created_at") String createdAt,
        @JsonProperty("updated_at") String updatedAt) {
}
