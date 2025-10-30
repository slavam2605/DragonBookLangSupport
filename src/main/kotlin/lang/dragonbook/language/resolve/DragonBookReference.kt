package lang.dragonbook.language.resolve

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import lang.dragonbook.language.psi.DragonBookBlock
import lang.dragonbook.language.psi.DragonBookForStatement
import lang.dragonbook.language.psi.DragonBookIdExpr
import lang.dragonbook.language.psi.DragonBookStatement

class DragonBookReference(element: PsiElement) : PsiReferenceBase<PsiElement>(element) {
    override fun resolve(): PsiElement? {
        val name = (element as? DragonBookIdExpr)?.text ?: return null

        var parentElement: PsiElement? = element.parent
        while (parentElement != null) {
            if (parentElement is DragonBookBlock) {
                parentElement.children.forEach { child ->
                    val declaration = (child as? DragonBookStatement)?.declaration ?: return@forEach
                    if (declaration.varName.name == name) {
                        return declaration.varName
                    }
                }
            }
            if (parentElement is DragonBookForStatement) {
                val declaration = parentElement.declaration
                if (declaration != null && declaration.varName.name == name) {
                    return declaration.varName
                }
            }

            parentElement = parentElement.parent
        }

        return null
    }
}