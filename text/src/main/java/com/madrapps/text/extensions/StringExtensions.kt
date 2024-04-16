package com.madrapps.text.extensions

class StringExtensions {

    fun divideString(string: String, delimiter: Char): List<String> {
        return string.split(delimiter)
    }
}