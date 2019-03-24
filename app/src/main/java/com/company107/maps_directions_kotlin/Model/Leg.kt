package com.company107.maps_directions_kotlin.Model

import com.google.gson.annotations.SerializedName

data class Leg(
    var distance: Distance,
    var duration: Duration,
    @SerializedName("end_address")
    var endAddress: String,
    @SerializedName("end_location")
    var endLocation: EndLocation,
    @SerializedName("start_address")
    var startAddress: String,
    @SerializedName("start_location")
    var startLocation: StartLocation,
    var steps: List<Step>,
    @SerializedName("traffic_speed_entry")
    var trafficSpeedEntry: List<Any>,
    @SerializedName("via_waypoint")
    var viaWaypoint: List<Any>
)