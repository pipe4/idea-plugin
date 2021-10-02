package com.github.pipe4.idea.plugin.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


class Pipe4FileType private constructor() : LanguageFileType(Pipe4Language.INSTANCE) {
    override fun getName(): String {
        return "Pipe4 File"
    }

    override fun getDescription(): String {
        return "Pipe4 language file"
    }

    override fun getDefaultExtension(): String {
        return "pipe4"
    }

    override fun getIcon(): Icon? {
        return Pipe4Icons.FILE
    }

    companion object {
        val INSTANCE = Pipe4FileType()
    }
}