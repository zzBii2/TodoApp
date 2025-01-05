package com.sochoeun.mapper.impl;

import com.sochoeun.domain.dto.TaskDto;
import com.sochoeun.domain.entity.Task;
import com.sochoeun.mapper.TaskMapper;

public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task toTask(TaskDto taskDto) {
        return Task.builder()
                .id(taskDto.id())
                .title(taskDto.title())
                .description(taskDto.description())
                .status(taskDto.status())
                .priority(taskDto.priority())
                .taskList(taskDto.taskList())
                .build();
    }

    @Override
    public TaskDto toTaskDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getStatus(),
                task.getPriority(),
                task.getTaskList(),
                task.getCreatedAt(),
                task.getUpdatedAt())s;
    }

}
