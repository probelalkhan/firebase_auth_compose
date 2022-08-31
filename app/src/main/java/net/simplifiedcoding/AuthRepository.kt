package net.simplifiedcoding

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseUser
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class AuthRepository {

    suspend fun register(
        email: String,
        password: String
    ): FirebaseAuthResult<FirebaseUser, FirebaseAuthException> =
        suspendCoroutine { coroutine ->
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    coroutine.resume(FirebaseAuthResult.Success(it.user!!))
                }.addOnFailureListener { exception ->
                    coroutine.resume(FirebaseAuthResult.Failure(exception as FirebaseAuthException))
                }
        }
}