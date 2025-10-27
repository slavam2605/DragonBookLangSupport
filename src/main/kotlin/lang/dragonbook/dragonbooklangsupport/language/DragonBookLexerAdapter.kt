package lang.dragonbook.dragonbooklangsupport.language

import com.intellij.lexer.FlexAdapter
import lang.dragonbook.dragonbooklangsupport.language.psi.lexer.DragonBookLexer

class DragonBookLexerAdapter : FlexAdapter(DragonBookLexer(null))