package lang.dragonbook.language

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import lang.dragonbook.language.psi.DragonBookTypes

class DragonBookBraceMatcher : PairedBraceMatcher {
    private val pairs = arrayOf(
        BracePair(DragonBookTypes.LPAR, DragonBookTypes.RPAR, false),
        BracePair(DragonBookTypes.LBRACKET, DragonBookTypes.RBRACKET, false),
        BracePair(DragonBookTypes.LBRACE, DragonBookTypes.RBRACE, true)
    )

    override fun getPairs() = pairs

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?) = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int) = openingBraceOffset
}