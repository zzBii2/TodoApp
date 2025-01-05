package com.sochoeun.mapper.impl;

import com.sochoeun.domain.dto.TaskListDto;
import com.sochoeun.domain.entity.TaskList;

public interface TaskListMapper {

    TaskListDto toTaskListDto(TaskList taskList);

    TaskList toTaskList(TaskListDto taskListDto);

}
