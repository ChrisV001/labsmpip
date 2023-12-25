package com.example.moviesapp.data

class FakeApiProvider {
    companion object {
        @Volatile
        private var INSTANCE: FakeApi? = null

        @JvmStatic
        fun getFakeApi(): FakeApi {
            return INSTANCE ?: synchronized(this) {
                val instance = createFakeApi()
                INSTANCE = instance
                instance
            }
        }
        private fun createFakeApi(): FakeApi {
            return FakeApi()
        }
    }
}
