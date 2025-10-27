package lang.dragonbook.dragonbooklangsupport.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes
import lang.dragonbook.dragonbooklangsupport.language.psi.parser.DragonBookParser

private val FILE = IFileElementType(DragonBookLanguage.INSTANCE)

class DragonBookParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return DragonBookLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return DragonBookParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return DragonBookTokenSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode): PsiElement {
        return DragonBookTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return DragonBookFile(viewProvider)
    }
}