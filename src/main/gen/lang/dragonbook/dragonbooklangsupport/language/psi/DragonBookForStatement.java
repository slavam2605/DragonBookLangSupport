// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DragonBookForStatement extends PsiElement {

  @NotNull
  List<DragonBookAssignment> getAssignmentList();

  @Nullable
  DragonBookDeclaration getDeclaration();

  @Nullable
  DragonBookExpression getExpression();

  @NotNull
  DragonBookStatement getStatement();

}
