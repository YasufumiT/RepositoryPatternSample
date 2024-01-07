package com.example.repositorypatternsample.model.samplemodel.repository

import com.example.repositorypatternsample.model.samplemodel.datasource.ISampleDataSource
import com.example.repositorypatternsample.model.samplemodel.SampleModel

class SampleRepository(private val sampleDataSource: ISampleDataSource) : ISampleRepository {

    private val cache: MutableMap<String, String> = HashMap()
    private val INT_CACHE_KEY = "int_cache_key"
    private val STRING_CACHE_KEY = "string_cache_key"

    override fun featchData(): SampleModel = if (cache.containsKey(INT_CACHE_KEY)) {
        SampleModel(cache.getValue(INT_CACHE_KEY).toInt(), cache.getValue(STRING_CACHE_KEY))
    } else {
        SampleModel(sampleDataSource.getIntData(), sampleDataSource.getStringData())
    }

    override fun addIntData(addNum: Int) {
        sampleDataSource.setIntData(addNum)
        SampleModel(sampleDataSource.getIntData(), sampleDataSource.getStringData())
        cache[INT_CACHE_KEY] = sampleDataSource.getIntData().toString()
        cache[STRING_CACHE_KEY] = sampleDataSource.getStringData()
    }

    override fun clearData() {
        sampleDataSource.clearIntData()
        SampleModel(sampleDataSource.getIntData(), sampleDataSource.getStringData())
        cache.clear()
    }

    companion object{
        fun getSampleRepository(sampleDataSource: ISampleDataSource) =
            SampleRepository(sampleDataSource)
    }
}
