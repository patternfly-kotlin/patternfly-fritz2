package org.patternfly

import dev.fritz2.dom.html.Div
import dev.fritz2.dom.html.RenderContext
import kotlinx.coroutines.Job
import org.w3c.dom.HTMLDivElement

// TODO Document me
// ------------------------------------------------------ dsl

public fun RenderContext.toolbar(
    id: String? = null,
    baseClass: String? = null,
    content: Toolbar.() -> Unit = {}
): Toolbar = register(Toolbar(id = id, baseClass = baseClass, job), content)

public fun Toolbar.toolbarContent(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarContent.() -> Unit = {}
): ToolbarContent = register(ToolbarContent(id = id, baseClass = baseClass, job), content)

public fun ToolbarContent.toolbarContentSection(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarContentSection.() -> Unit = {}
): ToolbarContentSection = register(ToolbarContentSection(id = id, baseClass = baseClass, job), content)

public fun ToolbarContentSection.toolbarGroup(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarGroup.() -> Unit = {}
): ToolbarGroup = register(ToolbarGroup(id = id, baseClass = baseClass, job), content)

public fun ToolbarContentSection.toolbarItem(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarItem.() -> Unit = {}
): ToolbarItem = register(ToolbarItem(id = id, baseClass = baseClass, job), content)

public fun ToolbarGroup.toolbarItem(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarItem.() -> Unit = {}
): ToolbarItem = register(ToolbarItem(id = id, baseClass = baseClass, job), content)

public fun ToolbarContent.toolbarExpandableContent(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarExpandableContent.() -> Unit = {}
): ToolbarExpandableContent = register(ToolbarExpandableContent(id = id, baseClass = baseClass, job), content)

public fun ToolbarExpandableContent.toolbarGroup(
    id: String? = null,
    baseClass: String? = null,
    content: ToolbarGroup.() -> Unit = {}
): ToolbarGroup = register(ToolbarGroup(id = id, baseClass = baseClass, job), content)

// ------------------------------------------------------ tag

public class Toolbar internal constructor(id: String?, baseClass: String?, job: Job) :
    PatternFlyComponent<HTMLDivElement>, Div(id = id, baseClass = classes(ComponentType.Toolbar, baseClass), job) {
    init {
        markAs(ComponentType.Toolbar)
    }
}

public class ToolbarContent internal constructor(id: String?, baseClass: String?, job: Job) :
    Div(id = id, baseClass = classes("toolbar".component("content"), baseClass), job)

public class ToolbarContentSection internal constructor(id: String?, baseClass: String?, job: Job) :
    Div(id = id, baseClass = classes("toolbar".component("content", "section"), baseClass), job)

public class ToolbarGroup internal constructor(id: String?, baseClass: String?, job: Job) :
    Div(id = id, baseClass = classes("toolbar".component("group"), baseClass), job)

public class ToolbarItem internal constructor(id: String?, baseClass: String?, job: Job) :
    Div(id = id, baseClass = classes("toolbar".component("item"), baseClass), job)

public class ToolbarExpandableContent internal constructor(id: String?, baseClass: String?, job: Job) :
    Div(id = id, baseClass = classes("toolbar".component("expandable", "content"), baseClass), job)
