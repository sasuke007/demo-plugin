package com.github.sasuke007.demoplugin.services

import com.intellij.openapi.project.Project
import com.github.sasuke007.demoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
