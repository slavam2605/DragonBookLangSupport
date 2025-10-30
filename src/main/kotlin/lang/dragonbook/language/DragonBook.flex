package lang.dragonbook.language.psi.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import lang.dragonbook.language.psi.DragonBookTypes;
import com.intellij.psi.TokenType;

%%

%public
%class DragonBookLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

// Whitespace and line breaks
WHITE_SPACE = [ \t]+
NEW_LINE = \r\n | \r | \n

// Comments
LINE_COMMENT = "//" [^\r\n]*
BLOCK_COMMENT = "/*" ([^*] | \*+ [^*/])* \*+ "/"

// Identifiers and literals
ID = [a-zA-Z_][a-zA-Z0-9_]*
INT_LITERAL = [0-9]+
FLOAT_LITERAL = ([0-9]+ "." [0-9]* {EXPONENT}?) | ("." [0-9]+ {EXPONENT}?) | ([0-9]+ {EXPONENT})
EXPONENT = [eE] [+\-]? [0-9]+

%%

// Whitespace and comments
{WHITE_SPACE}           { return TokenType.WHITE_SPACE; }
{NEW_LINE}              { return TokenType.WHITE_SPACE; }
{LINE_COMMENT}          { return DragonBookTypes.COMMENT; }
{BLOCK_COMMENT}         { return DragonBookTypes.COMMENT; }

// Keywords
"if"                    { return DragonBookTypes.IF; }
"else"                  { return DragonBookTypes.ELSE; }
"for"                   { return DragonBookTypes.FOR; }
"while"                 { return DragonBookTypes.WHILE; }
"break"                 { return DragonBookTypes.BREAK; }
"continue"              { return DragonBookTypes.CONTINUE; }
"return"                { return DragonBookTypes.RETURN; }
"true"                  { return DragonBookTypes.TRUE; }
"false"                 { return DragonBookTypes.FALSE; }
"do"                    { return DragonBookTypes.DO; }
"fun"                   { return DragonBookTypes.FUN; }
"as"                    { return DragonBookTypes.AS; }

// Operators - order matters! Longer operators first
"->"                    { return DragonBookTypes.ARROW; }
"+="                    { return DragonBookTypes.PLUS_ASSIGN; }
"-="                    { return DragonBookTypes.MINUS_ASSIGN; }
"*="                    { return DragonBookTypes.STAR_ASSIGN; }
"/="                    { return DragonBookTypes.DIV_ASSIGN; }
"%="                    { return DragonBookTypes.MOD_ASSIGN; }
"=="                    { return DragonBookTypes.EQUAL; }
"!="                    { return DragonBookTypes.NOT_EQUAL; }
"<="                    { return DragonBookTypes.LESS_EQUAL; }
">="                    { return DragonBookTypes.GREATER_EQUAL; }
"&&"                    { return DragonBookTypes.AND; }
"||"                    { return DragonBookTypes.OR; }

// Single character operators
"="                     { return DragonBookTypes.ASSIGN; }
";"                     { return DragonBookTypes.SEMICOLON; }
","                     { return DragonBookTypes.COMMA; }
"*"                     { return DragonBookTypes.STAR; }
"/"                     { return DragonBookTypes.DIV; }
"%"                     { return DragonBookTypes.MOD; }
"+"                     { return DragonBookTypes.PLUS; }
"-"                     { return DragonBookTypes.MINUS; }
"("                     { return DragonBookTypes.LPAR; }
")"                     { return DragonBookTypes.RPAR; }
"{"                     { return DragonBookTypes.LBRACE; }
"}"                     { return DragonBookTypes.RBRACE; }
"["                     { return DragonBookTypes.LBRACKET; }
"]"                     { return DragonBookTypes.RBRACKET; }
"#"                     { return DragonBookTypes.HASH; }
"<"                     { return DragonBookTypes.LESS; }
">"                     { return DragonBookTypes.GREATER; }
"!"                     { return DragonBookTypes.NOT; }

// Literals and identifiers
{FLOAT_LITERAL}         { return DragonBookTypes.FLOAT_LITERAL; }
{INT_LITERAL}           { return DragonBookTypes.INT_LITERAL; }
{ID}                    { return DragonBookTypes.ID; }

// Error fallback
[^]                     { return TokenType.BAD_CHARACTER; }
