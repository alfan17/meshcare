package com.appsid.meshcare.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("data")
    @Expose
    var data: String? = null

    class User {
        @SerializedName("id")
        @Expose
        var id: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("email")
        @Expose
        var email: String? = null

        @SerializedName("phone")
        @Expose
        var phone: String? = null

        @SerializedName("age")
        @Expose
        var age: String? = null

        @SerializedName("gender")
        @Expose
        var gender: String? = null

        @SerializedName("created_at")
        @Expose
        var created_at: String? = null

        @SerializedName("updated_at")
        @Expose
        var updated_at: String? = null

        @SerializedName("deleted_at")
        @Expose
        var deleted_at: String? = null
    }
}