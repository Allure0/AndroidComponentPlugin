# AndroidComponentPlugin
Android 组件化自动依赖配置插件


[具体插件使用以及具体分析请查看Demo](https://www.jianshu.com/p/23b0239c45aa)
[简书分析](https://github.com/Allure0/AndroidComponentDemo)



### Step1:整个项目build.gralde之下添加以下代码

```
/**--引用插件----**/
apply plugin: 'com.allure.appconfig'

buildscript {
    repositories {
        maven {
             url  "http://dl.bintray.com/allure0/maven"
        }
    }
    dependencies {
        //格式为-->group:module:version
        classpath 'com.allure.plugin:Component:1.0.0'
    }
}
/**--引用插件----**/

```
###  Step2:在每一个组件的build.gradle下定义插件的引用
```
apply plugin: 'com.allure.appmodules'
```

## 插件解释

##### hostAppConfig:

| hostAppConfig       |解释| 
| :--------: | :-----: | 
| isDebug    | 是否开启debug模式，只有当isDebug为true时，modules的isRunAlone才能生效。 | 
| apps    | 壳工程列表,可以有多个壳工程 | 
| modules    | 各个组件Lib | 


##### app:

| app       |解释|
| :--------: | :-----: | 
|  modules  | 依赖的组件列表 | 
|   applicationId  | 启动的application,可默认为空,在测试微信支付分享时可以动态配置使用测试 | 
|   mainActivity  | 启动Activity |

##### Modules:

| app       |解释|
| :--------: | :-----: | 
|  name  | 依赖的组件列表 | 
|  isRunAlone    | 是否可以单独运行（必须在isDebug=true情况下可运行) | 
|   applicationId  | 启动的application,必须设置 | 
|   mainActivity  | 启动Activity |


