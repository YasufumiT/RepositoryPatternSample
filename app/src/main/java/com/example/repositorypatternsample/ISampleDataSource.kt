package com.example.repositorypatternsample

interface ISampleDataSource {
    fun getIntData(): Int
    fun getStringData(): String
    fun setIntData(num: Int)
    fun clearIntData()
}