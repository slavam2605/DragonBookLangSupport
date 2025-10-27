package lang.dragonbook.dragonbooklangsupport.psi

import com.intellij.lang.Language

class DragonBookLanguage private constructor() : Language("DragonBookLanguage") {
    companion object {
        val INSTANCE = DragonBookLanguage()
    }
}