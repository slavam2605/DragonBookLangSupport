package lang.dragonbook.dragonbooklangsupport.language.highlighter

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookAnnotations
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookType

class DragonBookAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is DragonBookAnnotations) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .textAttributes(DragonBookHighlighterColors.ANNOTATION)
                .create()
        }

        if (element is DragonBookType) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .textAttributes(DragonBookHighlighterColors.TYPE)
                .create()
        }
    }
}