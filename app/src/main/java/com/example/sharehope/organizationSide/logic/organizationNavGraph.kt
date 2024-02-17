package com.example.sharehope.organizationSide.logic

import android.app.Activity.RESULT_OK
import android.content.Context
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.LandingScreen
import com.example.sharehope.organizationSide.LoginScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.authentication.SignInViewModel
import kotlinx.coroutines.launch
import com.example.sharehope.organizationSide.authentication.GoogleAuthUIClient
import com.google.android.gms.auth.api.identity.Identity
import kotlinx.coroutines.CoroutineScope
import androidx.lifecycle.lifecycleScope


enum class OrgScreens/*(@StringRes val title: Int)*/{
    Landing,
    Login,
    Home,
    NewPost,
    Ongoing,
    DetailedOngoing,
    Dashboard
}
@Composable
fun OrganizationNavHost(
    navController: NavHostController = rememberNavController(),
    applicationContext: Context,
    lifecycleScope: LifecycleCoroutineScope
) {

    val googleAuthClient by lazy {
        GoogleAuthUIClient(
            context = applicationContext,
            onTapClient = Identity.getSignInClient(applicationContext)
        )
    }

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = OrgScreens.valueOf(
        backStackEntry?.destination?.route?: OrgScreens.Landing.name
    )


    NavHost(
        navController = navController,
        startDestination = OrgScreens.Landing.name,
        modifier = Modifier
    ) {
        composable(route = OrgScreens.Landing.name) {
            LandingScreen (
                onGetStartedClick = {
                    navController.navigate(OrgScreens.Login.name)
                }
            )
        }
        composable(route = OrgScreens.Login.name) {
            val viewModel = viewModel<SignInViewModel>()
            val state by viewModel.state.collectAsStateWithLifecycle()

            val launcher = rememberLauncherForActivityResult(
                contract = ActivityResultContracts.StartIntentSenderForResult(),
                onResult = {result ->
                    if(result.resultCode == RESULT_OK) {
                        lifecycleScope.launch {
                            val signInResult = googleAuthClient.signInWithIntent(
                                intent = result.data ?: return@launch
                            )
                            viewModel.onSignInResult(signInResult)
                        }
                    }
                }
            )

            LaunchedEffect(key1 = state.isSignInSuccessful) {
                if (state.isSignInSuccessful) {
                    Toast.makeText(
                        applicationContext,
                        "Sign in Successful!",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            LoginScreen(
                state = state,
                onGoogleClick = {
                    lifecycleScope.launch {
                        val signInIntentSender = googleAuthClient.signIn()
                        launcher.launch(
                            IntentSenderRequest.Builder(
                                signInIntentSender ?: return@launch
                            ).build()
                        )
                    }
                }
            )
        }
        composable(route = OrgScreens.Home.name) {

        }
        composable(route = OrgScreens.NewPost.name) {

        }
        composable(route = OrgScreens.Ongoing.name) {

        }
        composable(route = OrgScreens.DetailedOngoing.name) {

        }
        composable(route = OrgScreens.Dashboard.name) {

        }
    }
}







@Composable
fun BottomBarNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavBarButtons.Home.route,
        modifier = Modifier
    ) {
        composable(BottomNavBarButtons.Home.route) {
            HomeScreen()
        }
        composable(BottomNavBarButtons.Map.route) {
            //collaborations Screen
        }
        composable(BottomNavBarButtons.AddPost.route) {
            NewPostScreen()
        }
        composable(BottomNavBarButtons.Money.route) {
            //simple ongoing camp
        }
        composable(BottomNavBarButtons.Profile.route) {
            //dashboard screen
        }
    }

}