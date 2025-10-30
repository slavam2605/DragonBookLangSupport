package lang.dragonbook.dragonbooklangsupport.language.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.AbstractElementManipulator

class DragonBookIdExprManipulator : AbstractElementManipulator<DragonBookIdExpr>() {
    override fun handleContentChange(element: DragonBookIdExpr, range: TextRange, newContent: String): DragonBookIdExpr {
        val newId = DragonBookElementFactory.createIdExpr(element.project, newContent)
        element.replace(newId)
        return element
    }
}