package com.example.repositorypatternsample.model.samplemodel.datasource

class SampleDataSource2 : ISampleDataSource {
    private var privateDataNum = 3
    private var privateDataStr: String = "綱木です。その２"

    override fun getIntData(): Int = privateDataNum

    override fun setIntData(num: Int) {
        privateDataNum = num
    }

    override fun getStringData(): String = privateDataStr

    override fun clearIntData() {
        privateDataNum = 3
    }
}
