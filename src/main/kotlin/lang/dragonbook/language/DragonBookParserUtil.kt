package lang.dragonbook.language

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase

object DragonBookParserUtil : GeneratedParserUtilBase() {
    @JvmStatic
    fun consumeAnyExcept(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
        val marker = builder.mark()
        if (parser.parse(builder, level)) {
            marker.rollbackTo()
            return false
        }
        marker.drop()
        builder.advanceLexer()
        return true
    }
}