// This is a generated file. Not intended for manual editing.
package lang.dragonbook.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.dragonbook.language.psi.DragonBookTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import lang.dragonbook.language.psi.*;

public class DragonBookForStatementImpl extends ASTWrapperPsiElement implements DragonBookForStatement {

  public DragonBookForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DragonBookAssignment> getAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DragonBookAssignment.class);
  }

  @Override
  @Nullable
  public DragonBookDeclaration getDeclaration() {
    return findChildByClass(DragonBookDeclaration.class);
  }

  @Override
  @Nullable
  public DragonBookExpression getExpression() {
    return findChildByClass(DragonBookExpression.class);
  }

  @Override
  @Nullable
  public DragonBookStatement getStatement() {
    return findChildByClass(DragonBookStatement.class);
  }

}
