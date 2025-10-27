package lang.dragonbook.dragonbooklangsupport.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class DragonBookFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DragonBookLanguage.INSTANCE) {
    override fun getFileType() = DragonBookFileType

    override fun toString() = "DragonBook File"
}