package com.example.localcravings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewAccountViewModel : ViewModel() {
    private val db = Firebase.firestore
    val auth = Firebase.auth

    private val _account: MutableLiveData<Boolean> = MutableLiveData(false)
    private val _isCreated = MutableLiveData<Boolean>()

    val account: LiveData<Boolean> get() = _account
    val isCreated: LiveData<Boolean> get() = _isCreated
    var isInitialized: Boolean = false

    // default firebase vals

    val defaultFavorites = hashMapOf("favorites" to 0)

    fun doSignUp(email: String, password: String){
        viewModelScope.launch(Dispatchers.IO) {
            auth.createUserWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    isInitialized = true
                    _account.value = true
                }.addOnFailureListener {
                    isInitialized = true
                    _account.value = false
                }
        }

    }

    private fun createNewUser(tempName: HashMap<String, String>){
        db.collection("accounts").document(auth.uid!!).set({val test = "test"})
        db.collection("accounts/${auth.uid!!}")
            .document("favorites").set(defaultFavorites)

    }

    fun createNewUserDoc(username: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val tempName = hashMapOf("name" to username)
                createNewUser(tempName)

                isInitialized = true
                _isCreated.postValue(true)

            } catch (e: Exception) {
                println("Error: ${e.message}")
                _isCreated.postValue(false)
            }
        }

        isInitialized = true
    }
}