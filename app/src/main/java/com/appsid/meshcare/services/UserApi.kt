package com.appsid.meshcare.services

import com.appsid.meshcare.api.UserRequest
import com.appsid.meshcare.api.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("login")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}