package com.colisa.quick.features.tasks.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.colisa.quick.core.ui.navigation.QuickDestination
import com.colisa.quick.features.tasks.TasksRoute

object TasksDestination : QuickDestination {
    override val route: String = "tasks_route"
}

@ExperimentalLifecycleComposeApi
@ExperimentalMaterialApi
fun NavGraphBuilder.tasksGraph(
    openSettings: () -> Unit,
    openAddTask: () -> Unit,
    openEditTask: (String) -> Unit
) {
    composable(TasksDestination.route) {
        TasksRoute(
            openSettings = openSettings,
            openAddTask = openAddTask,
            openEditTask = openEditTask
        )
    }
}