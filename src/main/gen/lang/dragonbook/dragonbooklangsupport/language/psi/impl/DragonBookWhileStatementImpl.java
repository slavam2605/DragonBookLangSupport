// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import lang.dragonbook.dragonbooklangsupport.language.psi.*;

public class DragonBookWhileStatementImpl extends ASTWrapperPsiElement implements DragonBookWhileStatement {

  public DragonBookWhileStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitWhileStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DragonBookExpression getExpression() {
    return findNotNullChildByClass(DragonBookExpression.class);
  }

  @Override
  @NotNull
  public DragonBookStatement getStatement() {
    return findNotNullChildByClass(DragonBookStatement.class);
  }

}
