package lang.dragonbook.dragonbooklangsupport.language.highlighter

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class DragonBookSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, file: VirtualFile?): SyntaxHighlighter {
        return DragonBookSyntaxHighlighter()
    }
}