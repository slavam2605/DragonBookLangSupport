// This is a generated file. Not intended for manual editing.
package lang.dragonbook.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DragonBookStatement extends PsiElement {

  @Nullable
  DragonBookAssignment getAssignment();

  @Nullable
  DragonBookBlock getBlock();

  @Nullable
  DragonBookBreakStatement getBreakStatement();

  @Nullable
  DragonBookContinueStatement getContinueStatement();

  @Nullable
  DragonBookDeclaration getDeclaration();

  @Nullable
  DragonBookDoWhileStatement getDoWhileStatement();

  @Nullable
  DragonBookErrorStatement getErrorStatement();

  @Nullable
  DragonBookForStatement getForStatement();

  @Nullable
  DragonBookFunctionCall getFunctionCall();

  @Nullable
  DragonBookIfStatement getIfStatement();

  @Nullable
  DragonBookReturnStatement getReturnStatement();

  @Nullable
  DragonBookWhileStatement getWhileStatement();

}
