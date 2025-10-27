package lang.dragonbook.dragonbooklangsupport.language.commenter

import com.intellij.lang.Commenter

class DragonBookCommenter : Commenter {
    override fun getLineCommentPrefix() = "//"

    override fun getBlockCommentPrefix() = "/*"

    override fun getBlockCommentSuffix() = "*/"

    override fun getCommentedBlockCommentPrefix() = null

    override fun getCommentedBlockCommentSuffix() = null
}