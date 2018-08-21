package com.allure.plugin.extension

/**
 * <p>描述：(宿主App)</p>
 * Created by Cherish on 2017/12/14.<br>
 */
class AppExt extends ModulesExt{
    String dependMethod = "implementation"
    List<String> modules = new ArrayList<>()

    AppExt(String name) {
        super(name)
    }

    /**
     *
     * @param name
     * @return
     */
    def name(String name){
        this.name = name
    }

    /**
     *
     * @param applicationId
     * @return
     */
    def applicationId(String applicationId){
        this.applicationId = applicationId
    }

    /**
     *
     * @param dependMethod
     * @return
     */
    def dependMethod(String dependMethod){
        this.dependMethod = dependMethod
    }

    /**
     *
     * @param mainActivity
     * @return
     */
    def mainActivity(String mainActivity){
        this.mainActivity = mainActivity
    }

    /**
     *
     * @param modules
     * @return
     */
    def modules(String... modules){
        this.modules.addAll(modules)
    }

    @Override
    String toString() {
        return "app = $name, applicationId = $applicationId, dependMethod = $dependMethod\n" +
                "modules: ${modules.isEmpty()? "is empty" : "$modules"}"
    }
}
