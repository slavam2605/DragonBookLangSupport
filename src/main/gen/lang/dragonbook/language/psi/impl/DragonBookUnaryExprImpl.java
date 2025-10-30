// This is a generated file. Not intended for manual editing.
package lang.dragonbook.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.dragonbook.language.psi.DragonBookTypes.*;
import lang.dragonbook.language.psi.*;

public class DragonBookUnaryExprImpl extends DragonBookExpressionImpl implements DragonBookUnaryExpr {

  public DragonBookUnaryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitUnaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DragonBookExpression getExpression() {
    return findChildByClass(DragonBookExpression.class);
  }

}
