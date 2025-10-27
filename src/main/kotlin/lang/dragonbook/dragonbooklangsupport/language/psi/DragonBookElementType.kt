package lang.dragonbook.dragonbooklangsupport.language.psi

import com.intellij.psi.tree.IElementType
import lang.dragonbook.dragonbooklangsupport.language.DragonBookLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class DragonBookElementType(@NotNull @NonNls debugName: String) : IElementType(debugName, DragonBookLanguage.INSTANCE)