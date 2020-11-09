package com.irufano.beginnermvvm.data.api

import com.irufano.beginnermvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}