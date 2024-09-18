
ckage com.example.close.data.auth


sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}
ckage com.example.close.data.auth


sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}
ckage com.example.close.data.auth


sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}
ckage com.example.close.data.auth


sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}
ckage com.example.close.data

import android.content.Context
import com.example.close.data.auth.UserDataSource
import com.example.close.data.cometChat.CometChatAuthImp
import com.example.close.data.users.CloseUserDataSource
import com.example.close.data.location.LocationDataSource
import com.example.close.data.messaging.CloseMessagingDataSource
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer {
    val userDataSource: UserDataSource
    val closeUserDataSource: CloseUserDataSource
    val locationDataSource: LocationDataSource
    val cometChatAuthImp: CometChatAuthImp
    val closeMessagingDataSource: CloseMessagingDataSource
}

class DefaultContainer(
    private val applicationContext: Context,
    private val auth: FirebaseAuth,
    private val firestoreDb: FirebaseFirestore,
    private val cometAppID: String,
    private val cometRegion: String,
    private val cometRestApiKey: String,

): AppContainer {

    private val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext)


