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

public class DragonBookStatementImpl extends ASTWrapperPsiElement implements DragonBookStatement {

  public DragonBookStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DragonBookVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DragonBookVisitor) accept((DragonBookVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DragonBookAssignment getAssignment() {
    return findChildByClass(DragonBookAssignment.class);
  }

  @Override
  @Nullable
  public DragonBookBlock getBlock() {
    return findChildByClass(DragonBookBlock.class);
  }

  @Override
  @Nullable
  public DragonBookBreakStatement getBreakStatement() {
    return findChildByClass(DragonBookBreakStatement.class);
  }

  @Override
  @Nullable
  public DragonBookContinueStatement getContinueStatement() {
    return findChildByClass(DragonBookContinueStatement.class);
  }

  @Override
  @Nullable
  public DragonBookDeclaration getDeclaration() {
    return findChildByClass(DragonBookDeclaration.class);
  }

  @Override
  @Nullable
  public DragonBookDoWhileStatement getDoWhileStatement() {
    return findChildByClass(DragonBookDoWhileStatement.class);
  }

  @Override
  @Nullable
  public DragonBookForStatement getForStatement() {
    return findChildByClass(DragonBookForStatement.class);
  }

  @Override
  @Nullable
  public DragonBookFunctionCall getFunctionCall() {
    return findChildByClass(DragonBookFunctionCall.class);
  }

  @Override
  @Nullable
  public DragonBookIfStatement getIfStatement() {
    return findChildByClass(DragonBookIfStatement.class);
  }

  @Override
  @Nullable
  public DragonBookReturnStatement getReturnStatement() {
    return findChildByClass(DragonBookReturnStatement.class);
  }

  @Override
  @Nullable
  public DragonBookWhileStatement getWhileStatement() {
    return findChildByClass(DragonBookWhileStatement.class);
  }

}
