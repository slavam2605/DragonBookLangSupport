// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.dragonbook.dragonbooklangsupport.language.psi.DragonBookTypes.*;
import lang.dragonbook.dragonbooklangsupport.language.psi.*;

public class DragonBookComparisonExprImpl extends DragonBookExpressionImpl implements DragonBookComparisonExpr {

  public DragonBookComparisonExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitComparisonExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DragonBookComparisonOp getComparisonOp() {
    return findNotNullChildByClass(DragonBookComparisonOp.class);
  }

  @Override
  @NotNull
  public List<DragonBookExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DragonBookExpression.class);
  }

}
