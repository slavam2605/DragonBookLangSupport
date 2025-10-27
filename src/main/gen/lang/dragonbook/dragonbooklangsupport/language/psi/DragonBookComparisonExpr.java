// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DragonBookComparisonExpr extends DragonBookExpression {

  @NotNull
  DragonBookComparisonOp getComparisonOp();

  @NotNull
  List<DragonBookExpression> getExpressionList();

}
