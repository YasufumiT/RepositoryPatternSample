package com.example.repositorypatternsample

import com.example.repositorypatternsample.sampledata.SampleModel

interface ISampleRepository {
    fun featchData(): SampleModel
    fun addIntData(num: Int)
    fun clearData()
}