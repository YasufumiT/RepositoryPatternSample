package com.example.repositorypatternsample.model.samplemodel.repository

import com.example.repositorypatternsample.model.samplemodel.SampleModel

interface ISampleRepository {
    fun featchData(): SampleModel
    fun addIntData(num: Int)
    fun clearData()
}