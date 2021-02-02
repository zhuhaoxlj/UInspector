package com.huya.mobile.uinspector.optional.fresco

import android.content.Context
import com.huya.mobile.uinspector.impl.properties.view.ViewPropertiesParserPlugin
import com.huya.mobile.uinspector.plugins.UInspectorPluginService
import com.huya.mobile.uinspector.plugins.UInspectorPlugins

/**
 * @author YvesCheung
 * 2021/2/1
 */
open class UInspectorFrescoService : UInspectorPluginService {

    override fun onCreate(context: Context, plugins: UInspectorPlugins) {
        plugins.append(ViewPropertiesParserPlugin::class.java, FrescoPropertiesParserPlugin())
    }
}