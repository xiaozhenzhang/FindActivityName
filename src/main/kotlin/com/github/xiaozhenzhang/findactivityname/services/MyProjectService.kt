package com.github.xiaozhenzhang.findactivityname.services

import com.intellij.openapi.project.Project
import com.github.xiaozhenzhang.findactivityname.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
