package com.example.repositorypatternsample

class SampleDataSource : ISampleDataSource {
    private var privateDataNum:Int = 0
    private var privateDataStr: String = "綱木です。"

    override fun getIntData(): Int = privateDataNum

    override fun setIntData(num: Int) {
        privateDataNum = num
    }

    override fun getStringData(): String = privateDataStr

    override fun clearIntData() {
        privateDataNum = 0
    }
}
