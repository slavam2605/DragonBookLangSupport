// This is a generated file. Not intended for manual editing.
package lang.dragonbook.dragonbooklangsupport.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import lang.dragonbook.dragonbooklangsupport.language.psi.impl.*;

public interface DragonBookTypes {

  IElementType ADD_SUB_EXPR = new DragonBookElementType("ADD_SUB_EXPR");
  IElementType AND_EXPR = new DragonBookElementType("AND_EXPR");
  IElementType ANNOTATIONS = new DragonBookElementType("ANNOTATIONS");
  IElementType ANNOTATION_LIST = new DragonBookElementType("ANNOTATION_LIST");
  IElementType ASSIGNMENT = new DragonBookElementType("ASSIGNMENT");
  IElementType ASSIGN_OP = new DragonBookElementType("ASSIGN_OP");
  IElementType BLOCK = new DragonBookElementType("BLOCK");
  IElementType BREAK_STATEMENT = new DragonBookElementType("BREAK_STATEMENT");
  IElementType CALL_ARGUMENTS = new DragonBookElementType("CALL_ARGUMENTS");
  IElementType CALL_EXPR = new DragonBookElementType("CALL_EXPR");
  IElementType CAST_EXPR = new DragonBookElementType("CAST_EXPR");
  IElementType COMPARISON_EXPR = new DragonBookElementType("COMPARISON_EXPR");
  IElementType COMPARISON_OP = new DragonBookElementType("COMPARISON_OP");
  IElementType CONTINUE_STATEMENT = new DragonBookElementType("CONTINUE_STATEMENT");
  IElementType DECLARATION = new DragonBookElementType("DECLARATION");
  IElementType DEREF_L_VALUE = new DragonBookElementType("DEREF_L_VALUE");
  IElementType DO_WHILE_STATEMENT = new DragonBookElementType("DO_WHILE_STATEMENT");
  IElementType EXPRESSION = new DragonBookElementType("EXPRESSION");
  IElementType FALSE_EXPR = new DragonBookElementType("FALSE_EXPR");
  IElementType FLOAT_EXPR = new DragonBookElementType("FLOAT_EXPR");
  IElementType FOR_STATEMENT = new DragonBookElementType("FOR_STATEMENT");
  IElementType FUNCTION = new DragonBookElementType("FUNCTION");
  IElementType FUNCTION_CALL = new DragonBookElementType("FUNCTION_CALL");
  IElementType FUNCTION_PARAMETER = new DragonBookElementType("FUNCTION_PARAMETER");
  IElementType FUNCTION_PARAMETERS = new DragonBookElementType("FUNCTION_PARAMETERS");
  IElementType ID_EXPR = new DragonBookElementType("ID_EXPR");
  IElementType ID_L_VALUE = new DragonBookElementType("ID_L_VALUE");
  IElementType IF_STATEMENT = new DragonBookElementType("IF_STATEMENT");
  IElementType INT_EXPR = new DragonBookElementType("INT_EXPR");
  IElementType LVALUE = new DragonBookElementType("LVALUE");
  IElementType MUL_DIV_EXPR = new DragonBookElementType("MUL_DIV_EXPR");
  IElementType OR_EXPR = new DragonBookElementType("OR_EXPR");
  IElementType PAREN_EXPR = new DragonBookElementType("PAREN_EXPR");
  IElementType RETURN_STATEMENT = new DragonBookElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new DragonBookElementType("STATEMENT");
  IElementType TRUE_EXPR = new DragonBookElementType("TRUE_EXPR");
  IElementType TYPE = new DragonBookElementType("TYPE");
  IElementType UNARY_EXPR = new DragonBookElementType("UNARY_EXPR");
  IElementType VAR_NAME = new DragonBookElementType("VAR_NAME");
  IElementType WHILE_STATEMENT = new DragonBookElementType("WHILE_STATEMENT");

  IElementType AND = new DragonBookTokenType("AND");
  IElementType ARROW = new DragonBookTokenType("ARROW");
  IElementType AS = new DragonBookTokenType("AS");
  IElementType ASSIGN = new DragonBookTokenType("ASSIGN");
  IElementType BAD_CHARACTER = new DragonBookTokenType("bad_char");
  IElementType BREAK = new DragonBookTokenType("BREAK");
  IElementType COMMA = new DragonBookTokenType("COMMA");
  IElementType COMMENT = new DragonBookTokenType("comment");
  IElementType CONTINUE = new DragonBookTokenType("CONTINUE");
  IElementType DIV = new DragonBookTokenType("DIV");
  IElementType DIV_ASSIGN = new DragonBookTokenType("DIV_ASSIGN");
  IElementType DO = new DragonBookTokenType("DO");
  IElementType ELSE = new DragonBookTokenType("ELSE");
  IElementType EQUAL = new DragonBookTokenType("EQUAL");
  IElementType FALSE = new DragonBookTokenType("FALSE");
  IElementType FLOAT_LITERAL = new DragonBookTokenType("FLOAT_LITERAL");
  IElementType FOR = new DragonBookTokenType("FOR");
  IElementType FUN = new DragonBookTokenType("FUN");
  IElementType GREATER = new DragonBookTokenType("GREATER");
  IElementType GREATER_EQUAL = new DragonBookTokenType("GREATER_EQUAL");
  IElementType HASH = new DragonBookTokenType("HASH");
  IElementType ID = new DragonBookTokenType("ID");
  IElementType IF = new DragonBookTokenType("IF");
  IElementType INT_LITERAL = new DragonBookTokenType("INT_LITERAL");
  IElementType LBRACE = new DragonBookTokenType("LBRACE");
  IElementType LBRACKET = new DragonBookTokenType("LBRACKET");
  IElementType LESS = new DragonBookTokenType("LESS");
  IElementType LESS_EQUAL = new DragonBookTokenType("LESS_EQUAL");
  IElementType LPAR = new DragonBookTokenType("LPAR");
  IElementType MINUS = new DragonBookTokenType("MINUS");
  IElementType MINUS_ASSIGN = new DragonBookTokenType("MINUS_ASSIGN");
  IElementType MOD = new DragonBookTokenType("MOD");
  IElementType MOD_ASSIGN = new DragonBookTokenType("MOD_ASSIGN");
  IElementType NOT = new DragonBookTokenType("NOT");
  IElementType NOT_EQUAL = new DragonBookTokenType("NOT_EQUAL");
  IElementType OR = new DragonBookTokenType("OR");
  IElementType PLUS = new DragonBookTokenType("PLUS");
  IElementType PLUS_ASSIGN = new DragonBookTokenType("PLUS_ASSIGN");
  IElementType RBRACE = new DragonBookTokenType("RBRACE");
  IElementType RBRACKET = new DragonBookTokenType("RBRACKET");
  IElementType RETURN = new DragonBookTokenType("RETURN");
  IElementType RPAR = new DragonBookTokenType("RPAR");
  IElementType SEMICOLON = new DragonBookTokenType("SEMICOLON");
  IElementType STAR = new DragonBookTokenType("STAR");
  IElementType STAR_ASSIGN = new DragonBookTokenType("STAR_ASSIGN");
  IElementType TRUE = new DragonBookTokenType("TRUE");
  IElementType WHILE = new DragonBookTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_SUB_EXPR) {
        return new DragonBookAddSubExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new DragonBookAndExprImpl(node);
      }
      else if (type == ANNOTATIONS) {
        return new DragonBookAnnotationsImpl(node);
      }
      else if (type == ANNOTATION_LIST) {
        return new DragonBookAnnotationListImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new DragonBookAssignmentImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new DragonBookAssignOpImpl(node);
      }
      else if (type == BLOCK) {
        return new DragonBookBlockImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new DragonBookBreakStatementImpl(node);
      }
      else if (type == CALL_ARGUMENTS) {
        return new DragonBookCallArgumentsImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new DragonBookCallExprImpl(node);
      }
      else if (type == CAST_EXPR) {
        return new DragonBookCastExprImpl(node);
      }
      else if (type == COMPARISON_EXPR) {
        return new DragonBookComparisonExprImpl(node);
      }
      else if (type == COMPARISON_OP) {
        return new DragonBookComparisonOpImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new DragonBookContinueStatementImpl(node);
      }
      else if (type == DECLARATION) {
        return new DragonBookDeclarationImpl(node);
      }
      else if (type == DEREF_L_VALUE) {
        return new DragonBookDerefLValueImpl(node);
      }
      else if (type == DO_WHILE_STATEMENT) {
        return new DragonBookDoWhileStatementImpl(node);
      }
      else if (type == FALSE_EXPR) {
        return new DragonBookFalseExprImpl(node);
      }
      else if (type == FLOAT_EXPR) {
        return new DragonBookFloatExprImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new DragonBookForStatementImpl(node);
      }
      else if (type == FUNCTION) {
        return new DragonBookFunctionImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new DragonBookFunctionCallImpl(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new DragonBookFunctionParameterImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new DragonBookFunctionParametersImpl(node);
      }
      else if (type == ID_EXPR) {
        return new DragonBookIdExprImpl(node);
      }
      else if (type == ID_L_VALUE) {
        return new DragonBookIdLValueImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new DragonBookIfStatementImpl(node);
      }
      else if (type == INT_EXPR) {
        return new DragonBookIntExprImpl(node);
      }
      else if (type == LVALUE) {
        return new DragonBookLvalueImpl(node);
      }
      else if (type == MUL_DIV_EXPR) {
        return new DragonBookMulDivExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new DragonBookOrExprImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new DragonBookParenExprImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new DragonBookReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new DragonBookStatementImpl(node);
      }
      else if (type == TRUE_EXPR) {
        return new DragonBookTrueExprImpl(node);
      }
      else if (type == TYPE) {
        return new DragonBookTypeImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new DragonBookUnaryExprImpl(node);
      }
      else if (type == VAR_NAME) {
        return new DragonBookVarNameImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new DragonBookWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
