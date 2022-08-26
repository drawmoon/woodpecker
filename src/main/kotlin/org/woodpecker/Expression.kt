package org.woodpecker

interface Expression {

    fun accept(visitor: ExpressionVisitor): StringBuilder;
}