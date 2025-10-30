package lang.dragonbook.language

import com.intellij.lexer.FlexAdapter
import lang.dragonbook.language.psi.lexer.DragonBookLexer

class DragonBookLexerAdapter : FlexAdapter(DragonBookLexer(null))