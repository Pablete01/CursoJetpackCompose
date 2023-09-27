package com.app.todoapp.addtasks.domain

import com.app.todoapp.addtasks.data.TaskRepository
import com.app.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetTaskUseCase @Inject constructor(private val taskRepository: TaskRepository){
    operator fun invoke():Flow<List<TaskModel>>{
        return taskRepository.tasks
    }
}