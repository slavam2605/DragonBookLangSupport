package lang.dragonbook.dragonbooklangsupport.language

import com.intellij.psi.tree.TokenSet
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes

object DragonBookTokenSets {
    val IDENTIFIERS = TokenSet.create(DragonBookTypes.ID)
    val COMMENTS = TokenSet.create(DragonBookTypes.COMMENT)
}