package lang.dragonbook.language

import com.intellij.psi.tree.TokenSet
import lang.dragonbook.language.psi.DragonBookTypes

object DragonBookTokenSets {
    val IDENTIFIERS = TokenSet.create(DragonBookTypes.ID)

    val COMMENTS = TokenSet.create(DragonBookTypes.COMMENT)

    val PARENTHESIS = TokenSet.create(
        DragonBookTypes.LPAR,
        DragonBookTypes.RPAR
    )

    val BRACES = TokenSet.create(
        DragonBookTypes.LBRACE,
        DragonBookTypes.RBRACE
    )

    val KEYWORDS = TokenSet.create(
        DragonBookTypes.BREAK,
        DragonBookTypes.CONTINUE,
        DragonBookTypes.DO,
        DragonBookTypes.WHILE,
        DragonBookTypes.FOR,
        DragonBookTypes.IF,
        DragonBookTypes.ELSE,
        DragonBookTypes.FUN,
        DragonBookTypes.AS,
        DragonBookTypes.RETURN
    )

    val OPERATORS = TokenSet.create(
        DragonBookTypes.PLUS,
        DragonBookTypes.MINUS,
        DragonBookTypes.STAR,
        DragonBookTypes.DIV,
        DragonBookTypes.MOD,
        DragonBookTypes.OR,
        DragonBookTypes.AND,
        DragonBookTypes.LESS,
        DragonBookTypes.LESS_EQUAL,
        DragonBookTypes.GREATER,
        DragonBookTypes.GREATER_EQUAL,
        DragonBookTypes.EQUAL,
        DragonBookTypes.NOT_EQUAL,
        DragonBookTypes.ARROW,
        DragonBookTypes.ASSIGN,
        DragonBookTypes.NOT
    )
}