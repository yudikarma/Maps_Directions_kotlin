package com.company107.maps_directions_kotlin.Model

import com.google.gson.annotations.SerializedName

data class Route(
    var bounds: Bounds,
    var copyrights: String,
    var legs: List<Leg>,
    @SerializedName("overview_polyline")
    var overviewPolyline: OverviewPolyline,
    var summary: String,
    var warnings: List<Any>,
    @SerializedName("waypoint_order")
    var waypointOrder: List<Any>
)