// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes.*;
import lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookNamedElementImpl;
import lang.dragonbook.dragonbooklangsupport.language.psi.*;

public class DragonBookVarNameImpl extends DragonBookNamedElementImpl implements DragonBookVarName {

  public DragonBookVarNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitVarName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public @NotNull String getName() {
    return DragonBookPsiImplUtil.getName(this);
  }

  @Override
  public @NotNull PsiElement setName(@NotNull String newName) {
    return DragonBookPsiImplUtil.setName(this, newName);
  }

  @Override
  public @NotNull PsiElement getNameIdentifier() {
    return DragonBookPsiImplUtil.getNameIdentifier(this);
  }

}
