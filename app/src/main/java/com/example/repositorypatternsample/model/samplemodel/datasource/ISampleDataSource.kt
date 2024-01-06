package com.example.repositorypatternsample.model.samplemodel.datasource

interface ISampleDataSource {
    fun getIntData(): Int
    fun getStringData(): String
    fun setIntData(num: Int)
    fun clearIntData()
}