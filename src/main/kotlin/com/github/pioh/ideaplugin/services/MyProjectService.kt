package com.github.pioh.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.pioh.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
