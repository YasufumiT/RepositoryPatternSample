package com.example.repositorypatternsample.Injection

import com.example.repositorypatternsample.SampleDataSource
import com.example.repositorypatternsample.SampleDataSource2
import com.example.repositorypatternsample.SampleRepository

object ModelObject {

    fun getSampleRepository() = SampleRepository.getSampleRepository(SampleDataSource2())
}