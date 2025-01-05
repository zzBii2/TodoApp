package com.sochoeun.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TaskListDto(
                String id,
                String title,
                String description,

                @JsonProperty("task_list") List<TaskDto> tasks,

                @JsonProperty("created_at") String createdAt,

                @JsonProperty("updated_at") String updatedAt) {

}
