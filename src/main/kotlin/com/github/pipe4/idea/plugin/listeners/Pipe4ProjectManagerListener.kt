package com.github.pipe4.idea.plugin.listeners

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.pipe4.idea.plugin.services.Pipe4ProjectService

internal class Pipe4ProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<Pipe4ProjectService>()
    }
}
