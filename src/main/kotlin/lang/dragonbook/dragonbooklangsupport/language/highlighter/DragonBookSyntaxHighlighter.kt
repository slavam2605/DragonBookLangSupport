package lang.dragonbook.dragonbooklangsupport.language.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import lang.dragonbook.dragonbooklangsupport.language.DragonBookLexerAdapter
import lang.dragonbook.dragonbooklangsupport.language.DragonBookTokenSets
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes
import java.util.Collections

class DragonBookSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return DragonBookLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        return pack(Attributes[tokenType])
    }

    companion object {
        private val Attributes = createAttributes()

        private fun createAttributes(): Map<IElementType, TextAttributesKey> {
            val map = mutableMapOf<IElementType, TextAttributesKey>()

            safeMap(map, DragonBookTypes.BAD_CHARACTER, DragonBookHighlighterColors.BAD_CHARACTER)
            safeMap(map, DragonBookTypes.INT_LITERAL, DragonBookHighlighterColors.NUMBER)
            safeMap(map, DragonBookTypes.FLOAT_LITERAL, DragonBookHighlighterColors.NUMBER)
            safeMap(map, DragonBookTypes.COMMENT, DragonBookHighlighterColors.COMMENT)
            safeMap(map, DragonBookTypes.COMMA, DragonBookHighlighterColors.COMMA)
            safeMap(map, DragonBookTypes.SEMICOLON, DragonBookHighlighterColors.SEMICOLON)
            safeMap(map, DragonBookTokenSets.KEYWORDS, DragonBookHighlighterColors.KEYWORD)
            safeMap(map, DragonBookTokenSets.PARENTHESIS, DragonBookHighlighterColors.PARENTHESES)
            safeMap(map, DragonBookTokenSets.BRACES, DragonBookHighlighterColors.BRACES)
            safeMap(map, DragonBookTokenSets.IDENTIFIERS, DragonBookHighlighterColors.IDENTIFIER)
            safeMap(map, DragonBookTokenSets.OPERATORS, DragonBookHighlighterColors.OPERATOR_SIGN)

            return Collections.unmodifiableMap(map)
        }
    }
}