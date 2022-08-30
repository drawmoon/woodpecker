package org.woodpecker.statements

class SelectStatementElementArray : ArrayList<SelectStatementElement>(10) {

    override fun toString(): String {
        return this.joinToString(", ")
    }
}