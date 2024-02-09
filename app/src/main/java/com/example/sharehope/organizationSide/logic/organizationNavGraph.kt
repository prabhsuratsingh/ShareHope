package com.example.sharehope.organizationSide.logic

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.OngoingCampDetailedView

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
    navController: NavHostController = rememberNavController()
) {
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

        }
        composable(route = OrgScreens.Login.name) {

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