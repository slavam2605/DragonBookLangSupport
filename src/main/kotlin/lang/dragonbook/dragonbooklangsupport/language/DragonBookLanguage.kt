package lang.dragonbook.dragonbooklangsupport.language

import com.intellij.lang.Language

class DragonBookLanguage private constructor() : Language("DragonBookLanguage") {
    companion object {
        val INSTANCE = DragonBookLanguage()
    }
}