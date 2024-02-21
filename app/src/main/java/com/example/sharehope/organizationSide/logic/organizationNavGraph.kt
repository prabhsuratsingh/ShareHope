package com.example.sharehope.organizationSide.logic

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.LandingScreen
import com.example.sharehope.organizationSide.LoginScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.OngoingCampDetailedView
import com.example.sharehope.web3.AddressState
import com.example.sharehope.web3.initializeWeb3j
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


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
    lifecycleScope: CoroutineScope,
    context: Context
) {

    /*val googleAuthClient by lazy {
        GoogleAuthUIClient(
            context = applicationContext,
            onTapClient = Identity.getSignInClient(applicationContext)
        )
    }*/

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

            /*val viewModel = viewModel<SignInViewModel>()
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
                    navController.navigate(OrgScreens.Home.name)
                }
            }*/

            /*LoginScreen(
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
            )*/

            val state by remember{ mutableStateOf(AddressState())}

            LoginScreen(
                //state = state,
                onEnterAddress = {newAddress ->
                                 state.text = newAddress
                },
                onMetaMaskClick = {
                    lifecycleScope.launch {
                        val web3j = initializeWeb3j(state.text)
                        if (web3j != null) {
                            Toast.makeText(
                                context,
                                "Successful",
                                Toast.LENGTH_LONG
                            ).show()
                            navController.navigate(OrgScreens.Home.name)
                        } else {
                            Toast.makeText(
                                context,
                                "Unsuccessful",
                                Toast.LENGTH_LONG
                            ).show()
                            return@launch
                        }
                    }
                },
            )
        }
        composable(route = OrgScreens.Home.name) {
            HomeScreen(
                onOngoingClick = {navController.navigate(OrgScreens.Ongoing.name)},
                onAllCampsClick = {navController.navigate(OrgScreens.NewPost.name)},
                onDashboardClick = {navController.navigate(OrgScreens.Dashboard.name)},
            )
        }
        composable(route = OrgScreens.NewPost.name) {
            NewPostScreen()
        }
        composable(route = OrgScreens.Ongoing.name) {

        }
        composable(route = OrgScreens.DetailedOngoing.name) {
            OngoingCampDetailedView()
        }
        composable(route = OrgScreens.Dashboard.name) {

        }
    }
}







@Composable
fun BottomBarNavGraph(
    navController: NavHostController,
    items: List<BottomNavBarButtons>,
) {

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    NavHost(
        navController = navController,
        startDestination = BottomNavBarButtons.Home.route,
        modifier = Modifier
    ) {
        composable(BottomNavBarButtons.Home.route) {
            BottomNavBarButtons.Home.onClick = {navController.navigate(OrgScreens.Home.name)}

        }
        composable(BottomNavBarButtons.Map.route) {
            //collaborations Screen
        }
        composable(BottomNavBarButtons.AddPost.route) {
            BottomNavBarButtons.Home.onClick = {navController.navigate(OrgScreens.NewPost.name)}

        }
        composable(BottomNavBarButtons.Money.route) {
            //simple ongoing camp
        }
        composable(BottomNavBarButtons.Profile.route) {
            //dashboard screen
        }

    }

}