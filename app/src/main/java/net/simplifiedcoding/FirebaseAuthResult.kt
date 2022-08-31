package net.simplifiedcoding


sealed class FirebaseAuthResult<D, E> {

    data class Success<D, E>(val result: D) : FirebaseAuthResult<D, E>()

    data class Failure<D, E>(val error: E) : FirebaseAuthResult<D, E>()

}