package org.woodpecker

/**
 * An object representing a database column.
 */
class ColumnExpression : Expression {

    override fun accept(visitor: ExpressionVisitor): StringBuilder {
        return visitor.visit(this)
    }
}