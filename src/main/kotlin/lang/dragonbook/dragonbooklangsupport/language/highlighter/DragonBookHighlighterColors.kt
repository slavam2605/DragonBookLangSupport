package lang.dragonbook.dragonbooklangsupport.language.highlighter

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object DragonBookHighlighterColors {
    val KEYWORD = createTextAttributesKey("DRAGON_BOOK_KEYWORD",
        DefaultLanguageHighlighterColors.KEYWORD)
    val IDENTIFIER = createTextAttributesKey("DRAGON_BOOK_IDENTIFIER",
        DefaultLanguageHighlighterColors.IDENTIFIER)
    val NUMBER = createTextAttributesKey("DRAGON_BOOK_NUMBER",
        DefaultLanguageHighlighterColors.NUMBER)
    val COMMENT = createTextAttributesKey("DRAGON_BOOK_COMMENT",
        DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BAD_CHARACTER = createTextAttributesKey("DRAGON_BOOK_BAD_CHARACTER",
        HighlighterColors.BAD_CHARACTER)
    val BRACES = createTextAttributesKey("DRAGON_BOOK_BRACES",
        DefaultLanguageHighlighterColors.BRACES)
    val PARENTHESES = createTextAttributesKey("DRAGON_BOOK_PARENTHESES",
        DefaultLanguageHighlighterColors.PARENTHESES)
    val OPERATOR_SIGN = createTextAttributesKey("DRAGON_BOOK_OPERATOR_SIGN",
        DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val COMMA = createTextAttributesKey("DRAGON_BOOK_COMMA",
        DefaultLanguageHighlighterColors.COMMA)
    val SEMICOLON = createTextAttributesKey("DRAGON_BOOK_SEMICOLON",
        DefaultLanguageHighlighterColors.SEMICOLON)
}