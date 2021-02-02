package com.huya.mobile.uinspector.optional.compose

import android.content.Context
import com.huya.mobile.uinspector.hierarchy.HitTestFactory
import com.huya.mobile.uinspector.hierarchy.LayerFactory
import com.huya.mobile.uinspector.optional.compose.hirarchy.ComposeLayerFactory
import com.huya.mobile.uinspector.optional.compose.properties.*
import com.huya.mobile.uinspector.optional.compose.touch.ComposeHitTestFactory
import com.huya.mobile.uinspector.plugins.UInspectorPluginService
import com.huya.mobile.uinspector.plugins.UInspectorPlugins
import com.huya.mobile.uinspector.ui.panel.popup.UInspectorChildPanelPlugin

/**
 * @author YvesCheung
 * 2021/2/1
 */
class UInspectorComposeService : UInspectorPluginService {

    override fun onCreate(context: Context, plugins: UInspectorPlugins) {
        plugins.prepend(UInspectorChildPanelPlugin::class.java, UInspectorComposeChildPanelPlugin())
        plugins.prepend(LayerFactory::class.java, ComposeLayerFactory())
        plugins.prepend(HitTestFactory::class.java, ComposeHitTestFactory())
        plugins.append(ComposePropertiesParserFactory::class.java, DefaultComposePropertiesParserFactory())
    }

    companion object {

        const val PluginKey = "JetpackCompose"
    }
}