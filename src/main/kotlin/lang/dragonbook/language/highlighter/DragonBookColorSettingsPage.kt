package lang.dragonbook.language.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import lang.dragonbook.icons.DragonBookIcons
import org.jetbrains.annotations.NonNls

class DragonBookColorSettingsPage : ColorSettingsPage {
    override fun getIcon() = DragonBookIcons.File

    override fun getHighlighter(): SyntaxHighlighter {
        return DragonBookSyntaxHighlighter()
    }

    override fun getDemoText(): @NonNls String {
        return """
            // Example function
            fun foo(float x, int y) -> float {
                float result = x * y as float + 1.0;
                int* ptr = malloc(8) as int*;
                *ptr = 0;
                /*
                    Block comment
                */
                for (int i = 0; i < 10; i += 1) {
                    *ptr = *ptr + result as int / (*ptr + 1);
                }
                free(ptr);
                return result;
            }
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String?, TextAttributesKey?>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor?> {
        return Descriptions
    }

    override fun getColorDescriptors(): Array<out ColorDescriptor?> {
        return emptyArray()
    }

    override fun getDisplayName() = "DragonBook"

    companion object {
        private val Descriptions = arrayOf(
            AttributesDescriptor("Text//Keyword", DragonBookHighlighterColors.KEYWORD),
            AttributesDescriptor("Text//Identifier", DragonBookHighlighterColors.IDENTIFIER),
            AttributesDescriptor("Text//Number", DragonBookHighlighterColors.NUMBER),
            AttributesDescriptor("Text//Comment", DragonBookHighlighterColors.COMMENT),
            AttributesDescriptor("Symbols//Braces", DragonBookHighlighterColors.BRACES),
            AttributesDescriptor("Symbols//Parenthesis", DragonBookHighlighterColors.PARENTHESES),
            AttributesDescriptor("Symbols//Operators", DragonBookHighlighterColors.OPERATOR_SIGN),
            AttributesDescriptor("Symbols//Comma", DragonBookHighlighterColors.COMMA),
            AttributesDescriptor("Symbols//Semicolon", DragonBookHighlighterColors.SEMICOLON),
        )
    }
}