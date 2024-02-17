package com.example.sharehope.organizationSide.authentication

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)