package com.company107.maps_directions_kotlin.Model

import com.google.gson.annotations.SerializedName

data class GeocodedWaypoint(
    @SerializedName("geocoder_status")
    var geocoderStatus: String,
    @SerializedName("place_id")
    var placeId: String,
    var types: List<String>
)