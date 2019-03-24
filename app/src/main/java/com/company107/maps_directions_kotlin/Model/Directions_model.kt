package com.company107.maps_directions_kotlin.Model

import com.google.gson.annotations.SerializedName

data class Directions_model(
    @SerializedName("geocoded_waypoints")
    var geocodedWaypoints: List<GeocodedWaypoint>,
    var routes: List<Route>,
    var status: String
)