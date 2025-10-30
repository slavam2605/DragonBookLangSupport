package lang.dragonbook.language

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.util.NlsSafe
import lang.dragonbook.icons.DragonBookIcons
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

object DragonBookFileType : LanguageFileType(DragonBookLanguage.INSTANCE) {
    override fun getName(): @NonNls String = "DragonBook File"

    override fun getDescription(): @NlsContexts.Label String = "DragonBook language file"

    override fun getDefaultExtension(): @NlsSafe String = "dg"

    override fun getIcon(): Icon = DragonBookIcons.File
}