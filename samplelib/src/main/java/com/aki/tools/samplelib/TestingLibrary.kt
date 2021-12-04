package com.aki.tools.samplelib

class TestingLibrary {
    internal var count:Int = 0

    fun getFinCount():Int{
        sumCount()
        return count
    }

    internal fun sumCount(){
        count+=10
    }
}