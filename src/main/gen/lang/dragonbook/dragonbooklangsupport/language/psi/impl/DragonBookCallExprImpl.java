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

public class DragonBookCallExprImpl extends DragonBookExpressionImpl implements DragonBookCallExpr {

  public DragonBookCallExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitCallExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DragonBookFunctionCall getFunctionCall() {
    return findNotNullChildByClass(DragonBookFunctionCall.class);
  }

}
