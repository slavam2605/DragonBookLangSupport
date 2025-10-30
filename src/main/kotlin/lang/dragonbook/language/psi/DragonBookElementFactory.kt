package lang.dragonbook.language.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import lang.dragonbook.language.DragonBookFile
import lang.dragonbook.language.DragonBookFileType

object DragonBookElementFactory {
    fun createVarName(project: Project, name: String): DragonBookVarName {
        val statement = createStatement(project, "int $name;")
        return statement.declaration!!.varName
    }

    fun createIdExpr(project: Project, name: String): DragonBookIdExpr {
        return createExpression(project, name) as DragonBookIdExpr
    }

    fun createExpression(project: Project, text: String): DragonBookExpression {
        val statement = createStatement(project, "_ = $text;")
        return statement.assignment!!.expression
    }

    fun createStatement(project: Project, text: String): DragonBookStatement {
        val psiFile = createFile(project, "fun _() { $text }")
        return (psiFile.firstChild as DragonBookFunction)
            .block.statementList[0]
    }

    fun createFile(project: Project, text: String): DragonBookFile {
        return PsiFileFactory.getInstance(project)
            .createFileFromText("dummy.dg", DragonBookFileType, text) as DragonBookFile
    }
}