package com.company107.maps_directions_kotlin.Model

import com.google.gson.annotations.SerializedName

data class Step(
    var distance: Distance,
    var duration: Duration,
    @SerializedName("end_location")
    var endLocation: EndLocation,
    @SerializedName("html_instructions")
    var htmlInstructions: String,
    var polyline: Polyline,
    @SerializedName("start_location")
    var startLocation: StartLocation,
    @SerializedName("travel_mode")
    var travelMode: String,
    var maneuver: String
)