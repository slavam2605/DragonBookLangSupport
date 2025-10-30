// This is a generated file. Not intended for manual editing.
package lang.dragonbook.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DragonBookDeclaration extends PsiElement {

  @Nullable
  DragonBookExpression getExpression();

  @NotNull
  DragonBookType getType();

  @NotNull
  DragonBookVarName getVarName();

}
