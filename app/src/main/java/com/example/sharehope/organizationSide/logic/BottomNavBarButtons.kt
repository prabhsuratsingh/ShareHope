package com.example.sharehope.organizationSide.logic


import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.sharehope.R

sealed class BottomNavBarButtons(
    val route: String,
    @DrawableRes val icon: Int,
    val label: String
) {
    /*listOf("home","map","addPost","money","profile")*/
    object Home: BottomNavBarButtons("home", R.drawable.bar_home,"Home")
    object Map: BottomNavBarButtons("map", R.drawable.bar_map,"Map")
    object AddPost: BottomNavBarButtons("addPost", R.drawable.bar_new,"AddPost")
    object Money: BottomNavBarButtons("money", R.drawable.bar_money,"Money")
    object Profile: BottomNavBarButtons("profile", R.drawable.bar_profile,"Profile")

    /*companion object {
        var buttonList = listOf<BottomNavBarButtons>()
    }*/

}