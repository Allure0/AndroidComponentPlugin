package com.allure.plugin.extension

/**
 * <p>描述：(各个组件的属性配置)</p>
 * Created by Cherish on 2017/12/14.<br>
 */
class LibraryExt extends ModulesExt {
    boolean isRunAlone = false
    String runAloneSuper

    LibraryExt(String name) {
        super(name)
    }

    /**
     * Components's name about project path
     * @param name
     * @return
     */
    def name(String name) {
        this.name = name
    }

    /**
     * Components can be runAlone
     * @param isRunAlone
     * @return
     */
    def isRunAlone(boolean isRunAlone) {
        this.isRunAlone = isRunAlone
    }

    /**
     * Component is app ,Component's applicationId
     * @param applicationId
     * @return
     */
    def applicationId(String applicationId) {
        this.applicationId = applicationId
    }

    /**
     *
     * @param runAloneSuper
     * @return
     */
    def runAloneSuper(String runAloneSuper) {
        this.runAloneSuper = runAloneSuper
    }

    /**
     * Component start with Activity
     * @param mainActivity
     * @return
     */
    def mainActivity(String mainActivity) {
        this.mainActivity = mainActivity
    }

    @Override
    String toString() {
        return "name = $name, isRunAlone = $isRunAlone, applicationId = $applicationId, " +
                "runAloneSuper = $runAloneSuper, mainActivity = $mainActivity"
    }
}
