package com.allure.plugin.extension

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

/**
 * <p>描述：(App的基础配置入口)</p>
 * Created by Cherish on 2017/12/15.<br>
 */
class AppConfigExt {

    boolean isDebug = false
    NamedDomainObjectContainer<AppExt> apps
    NamedDomainObjectContainer<LibraryExt> modules

    AppConfigExt(Project project){
        apps = project.container(AppExt)
        modules = project.container(LibraryExt)
    }

    def isDebug(boolean isDebug){
        this.isDebug = isDebug
    }

    def apps(Closure closure){
        apps.configure(closure)
    }


    def modules(Closure closure){
        modules.configure(closure)
    }

    @Override
    String toString() {
        return "isDebug: $debugEnable\n" +
                "apps: ${apps.isEmpty()? "is empty" : "$apps"}"+
                "modules: ${modules.isEmpty()? "is empty" : "$modules"}"
    }
}
