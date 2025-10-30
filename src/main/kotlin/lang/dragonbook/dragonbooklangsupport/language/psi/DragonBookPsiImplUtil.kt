package lang.dragonbook.dragonbooklangsupport.language.psi

import com.intellij.psi.PsiElement
import lang.dragonbook.dragonbooklangsupport.language.resolve.DragonBookReference

object DragonBookPsiImplUtil {
    @JvmStatic
    fun getName(element: DragonBookVarName): String {
        return element.node.text
    }

    @JvmStatic
    fun setName(element: DragonBookVarName, newName: String): PsiElement {
        val newVarName = DragonBookElementFactory.createVarName(element.project, newName)
        return element.replace(newVarName)
    }

    @JvmStatic
    fun getNameIdentifier(element: DragonBookVarName): PsiElement {
        return element
    }

    @JvmStatic
    fun getReference(element: DragonBookIdExpr): DragonBookReference {
        return DragonBookReference(element)
    }
}