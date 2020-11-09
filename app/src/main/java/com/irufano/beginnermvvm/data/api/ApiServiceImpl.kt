package com.irufano.beginnermvvm.data.api

import com.irufano.beginnermvvm.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiServiceImpl : ApiService {
    private val baseUrl = "https://5e510330f2c0d300147c034c.mockapi.io/"

    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get(baseUrl + "users")
            .build()
            .getObjectListSingle(User::class.java)
    }

}