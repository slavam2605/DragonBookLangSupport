package lang.dragonbook.language.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiNameIdentifierOwner

interface DragonBookNamedElement : PsiNameIdentifierOwner

abstract class DragonBookNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), DragonBookNamedElement