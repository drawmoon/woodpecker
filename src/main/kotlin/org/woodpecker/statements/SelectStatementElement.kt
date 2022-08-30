package org.woodpecker.statements

import org.woodpecker.Identifier

class SelectStatementElement(val name: Identifier, val alias: Identifier?) {

    private val asKeyword: Identifier = Identifier("as")

    constructor(name: Identifier) : this(name, null)

    override fun toString(): String {
        if (alias != null) {
            return "$name $asKeyword $alias"
        }

        return name.toString()
    }
}