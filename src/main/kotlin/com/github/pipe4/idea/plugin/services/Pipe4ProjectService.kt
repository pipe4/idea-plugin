package com.github.pipe4.idea.plugin.services

import com.intellij.openapi.project.Project
import com.github.pipe4.idea.plugin.Pipe4Bundle

class Pipe4ProjectService(project: Project) {

    init {
        println(Pipe4Bundle.message("projectService", project.name))
    }
}
