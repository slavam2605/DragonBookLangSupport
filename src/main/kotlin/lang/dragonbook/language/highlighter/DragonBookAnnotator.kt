package lang.dragonbook.language.highlighter

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.PsiElement
import lang.dragonbook.language.psi.DragonBookAnnotations
import lang.dragonbook.language.psi.DragonBookFunctionName
import lang.dragonbook.language.psi.DragonBookType

class DragonBookAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is DragonBookAnnotations -> holder.setTextAttributes(element, DragonBookHighlighterColors.ANNOTATION)
            is DragonBookType -> holder.setTextAttributes(element, DragonBookHighlighterColors.TYPE)
            is DragonBookFunctionName -> holder.setTextAttributes(element, DragonBookHighlighterColors.FUNCTION)
        }
    }

    private fun AnnotationHolder.setTextAttributes(element: PsiElement, attributes: TextAttributesKey) {
        newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(element)
            .textAttributes(attributes)
            .create()
    }
}