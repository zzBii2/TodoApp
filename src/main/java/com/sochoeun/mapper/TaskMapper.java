package com.sochoeun.mapper;

import com.sochoeun.domain.dto.TaskDto;
import com.sochoeun.domain.entity.Task;

public interface TaskMapper {

    Task toTask(TaskDto taskDto);

    TaskDto toTaskDto(Task task);
}
