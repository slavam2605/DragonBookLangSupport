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

public class DragonBookFunctionImpl extends ASTWrapperPsiElement implements DragonBookFunction {

  public DragonBookFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DragonBookAnnotations getAnnotations() {
    return findChildByClass(DragonBookAnnotations.class);
  }

  @Override
  @NotNull
  public DragonBookBlock getBlock() {
    return findNotNullChildByClass(DragonBookBlock.class);
  }

  @Override
  @Nullable
  public DragonBookFunctionParameters getFunctionParameters() {
    return findChildByClass(DragonBookFunctionParameters.class);
  }

  @Override
  @Nullable
  public DragonBookType getType() {
    return findChildByClass(DragonBookType.class);
  }

}
