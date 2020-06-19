package com.friend.demoinapmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.inappmessaging.FirebaseInAppMessaging

/*
* https://medium.com/coding-blocks/exploring-firebase-in-app-messaging-e3cbcf3d6895
* */
class MainActivity : AppCompatActivity() {

    val listener = MyClickListenerBundles()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Passing true to the method prevents Firebase In-App Messaging from displaying messages, while false reenables message display
        //FirebaseInAppMessaging.getInstance().setMessagesSuppressed(true)

        FirebaseInAppMessaging.getInstance().addClickListener(listener)
//        FirebaseInAppMessaging.getInstance().isAutomaticDataCollectionEnabled = true
//        // Only needed if firebase_inapp_messaging_auto_data_collection_enabled is set to
//// false in AndroidManifest.xml
//        FirebaseInAppMessaging.getInstance().isAutomaticDataCollectionEnabled = true

    }
}
