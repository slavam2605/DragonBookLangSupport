package lang.dragonbook.language.psi

import com.intellij.psi.tree.IElementType
import lang.dragonbook.language.DragonBookLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class DragonBookTokenType(@NotNull @NonNls debugName: String) : IElementType(debugName, DragonBookLanguage.INSTANCE) {
    override fun toString(): String = "DragonBookTokenType.${super.toString()}"
}