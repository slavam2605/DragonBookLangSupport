package lang.dragonbook.language.highlighter

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.modcommand.ActionContext
import com.intellij.modcommand.ModCommand
import com.intellij.modcommand.ModCommandAction
import com.intellij.modcommand.Presentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.project.DumbAware
import com.intellij.psi.PsiElement
import lang.dragonbook.language.psi.DragonBookAnnotations
import lang.dragonbook.language.psi.DragonBookErrorStatement
import lang.dragonbook.language.psi.DragonBookFunctionName
import lang.dragonbook.language.psi.DragonBookType

class DragonBookAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is DragonBookAnnotations -> holder.setTextAttributes(element, DragonBookHighlighterColors.ANNOTATION)
            is DragonBookType -> holder.setTextAttributes(element, DragonBookHighlighterColors.TYPE)
            is DragonBookFunctionName -> holder.setTextAttributes(element, DragonBookHighlighterColors.FUNCTION)
            is DragonBookErrorStatement -> {
                val annotation = holder
                    .newAnnotation(HighlightSeverity.ERROR, "Malformed statement")
                    .range(element)

                annotation.newFix(DeleteMalformedStatementFix(element)).registerFix()
                annotation.create()
            }
        }
    }

    private class DeleteMalformedStatementFix(private val element: PsiElement) : ModCommandAction, DumbAware {
        override fun getFamilyName() = "Remove statement"

        override fun getPresentation(context: ActionContext) = Presentation.of(familyName)

        override fun perform(context: ActionContext): ModCommand {
            return ModCommand.psiUpdate(element) { a -> a.delete() }
        }
    }

    private fun AnnotationHolder.setTextAttributes(element: PsiElement, attributes: TextAttributesKey) {
        newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element)
            .textAttributes(attributes)
            .create()
    }
}