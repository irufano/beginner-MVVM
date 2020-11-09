package com.irufano.beginnermvvm.data.repository

import com.irufano.beginnermvvm.data.api.ApiHelper
import com.irufano.beginnermvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}