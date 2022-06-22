package com.malinskiy.marathon.ios.xctestrun

sealed class PropertyListKey(private val value: String) {
    object __xctestrun_metadata__ : PropertyListKey("__xctestrun_metadata__")
    class TargetName(targetName: String) : PropertyListKey(targetName)

    object ProductModuleName : PropertyListKey("ProductModuleName")
    object IsUITestBundle : PropertyListKey("IsUITestBundle")
    object SkipTestIdentifiers : PropertyListKey("SkipTestIdentifiers")
    object EnvironmentVariables : PropertyListKey("EnvironmentVariables")
    object TestingEnvironmentVariables : PropertyListKey("TestingEnvironmentVariables")

    fun toKeyString(): String {
        return value
    }
}
