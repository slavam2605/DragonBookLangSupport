package lang.dragonbook.language.refactor

import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement
import lang.dragonbook.language.psi.DragonBookVarName

class DragonBookRefactoringSupportProvider : RefactoringSupportProvider() {
    override fun isMemberInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean {
        return element is DragonBookVarName
    }
}