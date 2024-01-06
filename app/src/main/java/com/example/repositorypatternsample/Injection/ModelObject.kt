package com.example.repositorypatternsample.Injection

import com.example.repositorypatternsample.model.samplemodel.datasource.SampleDataSource2
import com.example.repositorypatternsample.model.samplemodel.repository.SampleRepository

object ModelObject {

    fun getSampleRepository() = SampleRepository.getSampleRepository(SampleDataSource2())
}