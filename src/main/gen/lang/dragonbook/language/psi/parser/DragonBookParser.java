// This is a generated file. Not intended for manual editing.
package lang.dragonbook.language.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static lang.dragonbook.language.psi.DragonBookTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DragonBookParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_SUB_EXPR, AND_EXPR, CALL_EXPR, CAST_EXPR,
      COMPARISON_EXPR, EXPRESSION, FALSE_EXPR, FLOAT_EXPR,
      ID_EXPR, INT_EXPR, MUL_DIV_EXPR, OR_EXPR,
      PAREN_EXPR, TRUE_EXPR, UNARY_EXPR),
  };

  /* ********************************************************** */
  // ID (COMMA ID)*
  public static boolean annotationList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationList")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && annotationList_1(b, l + 1);
    exit_section_(b, m, ANNOTATION_LIST, r);
    return r;
  }

  // (COMMA ID)*
  private static boolean annotationList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotationList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotationList_1", c)) break;
    }
    return true;
  }

  // COMMA ID
  private static boolean annotationList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotationList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HASH LBRACKET annotationList? RBRACKET
  public static boolean annotations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATIONS, null);
    r = consumeTokens(b, 1, HASH, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, annotations_2(b, l + 1));
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // annotationList?
  private static boolean annotations_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotations_2")) return false;
    annotationList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | DIV_ASSIGN | MOD_ASSIGN
  public static boolean assignOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_OP, "<assign op>");
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, PLUS_ASSIGN);
    if (!r) r = consumeToken(b, MINUS_ASSIGN);
    if (!r) r = consumeToken(b, STAR_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lvalue assignOp expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, "<assignment>", ID, STAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = lvalue(b, l + 1);
    r = r && assignOp(b, l + 1);
    p = r; // pin = 2
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, block_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statement*
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BREAK end
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BREAK_STATEMENT, null);
    r = consumeToken(b, BREAK);
    p = r; // pin = 1
    r = r && end(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean callArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_ARGUMENTS, "<call arguments>");
    r = expression(b, l + 1, -1);
    r = r && callArguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)*
  private static boolean callArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callArguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArguments_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean callArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LESS | GREATER | LESS_EQUAL | GREATER_EQUAL | EQUAL | NOT_EQUAL
  public static boolean comparisonOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OP, "<comparison op>");
    r = consumeToken(b, LESS);
    if (!r) r = consumeToken(b, GREATER);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, EQUAL);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE end
  public static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONTINUE_STATEMENT, null);
    r = consumeToken(b, CONTINUE);
    p = r; // pin = 1
    r = r && end(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // type varName (ASSIGN expression)?
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, null);
    r = type(b, l + 1);
    r = r && varName(b, l + 1);
    p = r; // pin = 2
    r = r && declaration_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ASSIGN expression)?
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    declaration_2_0(b, l + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STAR expression
  public static boolean derefLValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derefLValue")) return false;
    if (!nextTokenIs(b, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, DEREF_L_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // DO statement WHILE LPAR expression RPAR end
  public static boolean doWhileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileStatement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DO_WHILE_STATEMENT, null);
    r = consumeToken(b, DO);
    p = r; // pin = 1
    r = r && report_error_(b, statement(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, WHILE, LPAR)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAR)) && r;
    r = p && end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // SEMICOLON
  static boolean end(PsiBuilder b, int l) {
    return consumeToken(b, SEMICOLON);
  }

  /* ********************************************************** */
  // FOR LPAR (declaration | assignment)? SEMICOLON expression? SEMICOLON assignment? RPAR statement
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, null);
    r = consumeTokens(b, 1, FOR, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, forStatement_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, forStatement_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, SEMICOLON)) && r;
    r = p && report_error_(b, forStatement_6(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAR)) && r;
    r = p && statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (declaration | assignment)?
  private static boolean forStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_2")) return false;
    forStatement_2_0(b, l + 1);
    return true;
  }

  // declaration | assignment
  private static boolean forStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_2_0")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    return r;
  }

  // expression?
  private static boolean forStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_4")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  // assignment?
  private static boolean forStatement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_6")) return false;
    assignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // annotations? FUN functionName LPAR functionParameters? RPAR (ARROW type)? block
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = function_0(b, l + 1);
    r = r && consumeToken(b, FUN);
    p = r; // pin = 2
    r = r && report_error_(b, functionName(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LPAR)) && r;
    r = p && report_error_(b, function_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RPAR)) && r;
    r = p && report_error_(b, function_6(b, l + 1)) && r;
    r = p && block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, DragonBookParser::function_recover);
    return r || p;
  }

  // annotations?
  private static boolean function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_0")) return false;
    annotations(b, l + 1);
    return true;
  }

  // functionParameters?
  private static boolean function_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4")) return false;
    functionParameters(b, l + 1);
    return true;
  }

  // (ARROW type)?
  private static boolean function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_6")) return false;
    function_6_0(b, l + 1);
    return true;
  }

  // ARROW type
  private static boolean function_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID LPAR callArguments? RPAR
  public static boolean functionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, null);
    r = consumeTokens(b, 2, ID, LPAR);
    p = r; // pin = 2
    r = r && report_error_(b, functionCall_2(b, l + 1));
    r = p && consumeToken(b, RPAR) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // callArguments?
  private static boolean functionCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_2")) return false;
    callArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // type ID
  public static boolean functionParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, FUNCTION_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // functionParameter (COMMA functionParameter)*
  public static boolean functionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionParameter(b, l + 1);
    r = r && functionParameters_1(b, l + 1);
    exit_section_(b, m, FUNCTION_PARAMETERS, r);
    return r;
  }

  // (COMMA functionParameter)*
  private static boolean functionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionParameters_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionParameters_1", c)) break;
    }
    return true;
  }

  // COMMA functionParameter
  private static boolean functionParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && functionParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(FUN | HASH)
  static boolean function_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !function_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FUN | HASH
  private static boolean function_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_recover_0")) return false;
    boolean r;
    r = consumeToken(b, FUN);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean idLValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idLValue")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, ID_L_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // IF LPAR expression RPAR statement (ELSE statement)?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeTokens(b, 1, IF, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, RPAR)) && r;
    r = p && report_error_(b, statement(b, l + 1)) && r;
    r = p && ifStatement_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ELSE statement)?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // ELSE statement
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // idLValue | derefLValue
  public static boolean lvalue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lvalue")) return false;
    if (!nextTokenIs(b, "<lvalue>", ID, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LVALUE, "<lvalue>");
    r = idLValue(b, l + 1);
    if (!r) r = derefLValue(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // function+
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    if (!nextTokenIs(b, "", FUN, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!function(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN expression? end
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, null);
    r = consumeToken(b, RETURN);
    p = r; // pin = 1
    r = r && report_error_(b, returnStatement_1(b, l + 1));
    r = p && end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // declaration end
  //             | assignment end
  //             | functionCall end
  //             | breakStatement
  //             | continueStatement
  //             | returnStatement
  //             | ifStatement
  //             | whileStatement
  //             | doWhileStatement
  //             | forStatement
  //             | block
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = continueStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = doWhileStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declaration end
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration(b, l + 1);
    r = r && end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment end
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment(b, l + 1);
    r = r && end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionCall end
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionCall(b, l + 1);
    r = r && end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID (STAR)*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && type_1(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // (STAR)*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STAR)) break;
      if (!empty_element_parsed_guard_(b, "type_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ID
  public static boolean varName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, VAR_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // WHILE LPAR expression RPAR statement
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeTokens(b, 1, WHILE, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, RPAR)) && r;
    r = p && statement(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: BINARY(orExpr)
  // 1: BINARY(andExpr)
  // 2: BINARY(comparisonExpr)
  // 3: BINARY(addSubExpr)
  // 4: BINARY(mulDivExpr)
  // 5: POSTFIX(castExpr)
  // 6: PREFIX(unaryExpr)
  // 7: ATOM(callExpr)
  // 8: ATOM(idExpr)
  // 9: ATOM(trueExpr)
  // 10: ATOM(falseExpr)
  // 11: ATOM(intExpr)
  // 12: ATOM(floatExpr)
  // 13: ATOM(parenExpr)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = unaryExpr(b, l + 1);
    if (!r) r = callExpr(b, l + 1);
    if (!r) r = idExpr(b, l + 1);
    if (!r) r = trueExpr(b, l + 1);
    if (!r) r = falseExpr(b, l + 1);
    if (!r) r = intExpr(b, l + 1);
    if (!r) r = floatExpr(b, l + 1);
    if (!r) r = parenExpr(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, OR)) {
        r = expression(b, l, 0);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, AND)) {
        r = expression(b, l, 1);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && comparisonOp(b, l + 1)) {
        r = expression(b, l, 2);
        exit_section_(b, l, m, COMPARISON_EXPR, r, true, null);
      }
      else if (g < 3 && addSubExpr_0(b, l + 1)) {
        r = expression(b, l, 3);
        exit_section_(b, l, m, ADD_SUB_EXPR, r, true, null);
      }
      else if (g < 4 && mulDivExpr_0(b, l + 1)) {
        r = expression(b, l, 4);
        exit_section_(b, l, m, MUL_DIV_EXPR, r, true, null);
      }
      else if (g < 5 && castExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CAST_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // PLUS | MINUS
  private static boolean addSubExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addSubExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    return r;
  }

  // STAR | DIV | MOD
  private static boolean mulDivExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulDivExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, STAR);
    if (!r) r = consumeTokenSmart(b, DIV);
    if (!r) r = consumeTokenSmart(b, MOD);
    return r;
  }

  // AS type
  private static boolean castExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryExpr_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 6);
    exit_section_(b, l, m, UNARY_EXPR, r, p, null);
    return r || p;
  }

  // MINUS | NOT | STAR
  private static boolean unaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, MINUS);
    if (!r) r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, STAR);
    return r;
  }

  // functionCall
  public static boolean callExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callExpr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionCall(b, l + 1);
    exit_section_(b, m, CALL_EXPR, r);
    return r;
  }

  // ID
  public static boolean idExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idExpr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ID);
    exit_section_(b, m, ID_EXPR, r);
    return r;
  }

  // TRUE
  public static boolean trueExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trueExpr")) return false;
    if (!nextTokenIsSmart(b, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TRUE);
    exit_section_(b, m, TRUE_EXPR, r);
    return r;
  }

  // FALSE
  public static boolean falseExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "falseExpr")) return false;
    if (!nextTokenIsSmart(b, FALSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FALSE);
    exit_section_(b, m, FALSE_EXPR, r);
    return r;
  }

  // INT_LITERAL
  public static boolean intExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "intExpr")) return false;
    if (!nextTokenIsSmart(b, INT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INT_LITERAL);
    exit_section_(b, m, INT_EXPR, r);
    return r;
  }

  // FLOAT_LITERAL
  public static boolean floatExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floatExpr")) return false;
    if (!nextTokenIsSmart(b, FLOAT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FLOAT_LITERAL);
    exit_section_(b, m, FLOAT_EXPR, r);
    return r;
  }

  // LPAR expression RPAR
  public static boolean parenExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenExpr")) return false;
    if (!nextTokenIsSmart(b, LPAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPR, null);
    r = consumeTokenSmart(b, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && consumeToken(b, RPAR) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

}
