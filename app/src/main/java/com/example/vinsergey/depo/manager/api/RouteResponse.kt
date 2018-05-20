package com.example.vinsergey.depo.manager.api

import com.google.gson.annotations.SerializedName

data class RouteResponse (
        @SerializedName("name_route")
        var number: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("stops_forward")
        var stopsForward: List<TransportStop>? = null,
        @SerializedName("stops_back")
        var stopsBackward: List<TransportStop>? = null
)