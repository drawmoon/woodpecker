package org.woodpecker.statements

import org.woodpecker.Identifier

sealed class SelectStatements : Statement {

    private val selectKeyword: Identifier = Identifier("select");

    override fun toString(): String {
         TODO("Not yet implemented")
     }
 }