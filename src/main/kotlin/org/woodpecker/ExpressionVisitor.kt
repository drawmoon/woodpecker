package org.woodpecker

import org.woodpecker.functions.FunctionVisitor

interface ExpressionVisitor : FunctionVisitor {

    fun visit(expression: ColumnExpression): StringBuilder;
}