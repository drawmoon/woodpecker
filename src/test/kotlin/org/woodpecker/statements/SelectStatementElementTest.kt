package org.woodpecker.statements

import org.woodpecker.Identifier
import kotlin.test.Test
import kotlin.test.assertEquals

class SelectStatementElementTest {

    @Test
    fun testToString() {
        val element = SelectStatementElement(Identifier("name"))

        assertEquals("name", element.toString())
    }

    @Test
    fun testToStringWithAlias() {
        val element = SelectStatementElement(Identifier("name"), Identifier("username"))

        assertEquals("name as username", element.toString())
    }
}