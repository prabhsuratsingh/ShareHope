package com.example.sharehope.organizationSide.logic


import android.graphics.drawable.Icon
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
    //val icon: Icon
    @DrawableRes val icon: Int,
    val label: String,
    var onClick: () -> Unit
) {
    /*listOf("home","map","addPost","money","profile")*/
    object Home: BottomNavBarButtons("home", R.drawable.bar_home,"home", {})
    object Map: BottomNavBarButtons("map", R.drawable.bar_map,"map", {})
    object AddPost: BottomNavBarButtons("addPost", R.drawable.bar_new,"addPost", {})
    object Money: BottomNavBarButtons("money", R.drawable.bar_money,"money", {})
    object Profile: BottomNavBarButtons("profile", R.drawable.bar_profile,"profile", {})

    /*companion object {
        var buttonList = listOf<BottomNavBarButtons>()
    }*/

}