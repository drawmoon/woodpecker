package org.woodpecker.statements

import org.woodpecker.Identifier

sealed class SelectStatements : Statement, Iterable<SelectStatementElement> {

    private val selectKeyword: Identifier = Identifier("select")

    private lateinit var elements: SelectStatementElementArray

    fun addElement(element: SelectStatementElement) {
        elements.add(element)
    }

    fun removeElement(element: SelectStatementElement) {
        elements.remove(element)
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()

        stringBuilder.append(selectKeyword)
        stringBuilder.append(" ")
        stringBuilder.append(elements)

        return stringBuilder.toString()
     }

    override fun iterator(): Iterator<SelectStatementElement> {
        return elements.iterator()
    }
 }