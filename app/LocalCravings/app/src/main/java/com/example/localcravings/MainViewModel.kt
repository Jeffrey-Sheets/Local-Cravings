package com.example.localcravings

import android.media.Image
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.CircularBounds
import com.google.android.libraries.places.api.model.OpeningHours
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.net.PlacesClient
import com.google.android.libraries.places.api.net.SearchNearbyRequest
import java.util.Arrays


data class Restaurant(
    val name : String,
    val hours: OpeningHours,
    val image: Image
)

class MainViewModel : ViewModel() {
    private val _data = MutableLiveData<MutableList<Restaurant>>(mutableListOf())
    val restaurant get(): LiveData<MutableList<Restaurant>> = _data
    var placesClient: PlacesClient =


    val placeFields: List<Place.Field> = Arrays.asList(Place.Field.ID, Place.Field.NAME)
    var center: LatLng = LatLng(40.7580, -73.9855)
    var circle: CircularBounds = CircularBounds.newInstance(center,  /* radius = */1000.0)
    val searchNearbyRequest : SearchNearbyRequest =
        SearchNearbyRequest.builder(circle, placeFields)
            .setMaxResultCount(10)
            .build()
}