package com.toniolocode.myutils

class MyMath {

    companion object {
        fun Plus(a: Int, b: Int): Int = a + b

        fun Minus(a: Int, b: Int): Int = a - b

        fun Multiplied(a: Int, b: Int): Int = a * b

        fun Div(a: Int, b: Int): Float {
            return (if (b == 0) throw IllegalArgumentException("Div by Zero error") else a / b).toFloat()
        }
    }
}