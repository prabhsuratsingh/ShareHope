package com.example.sharehope.organizationSide.uiElements


import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sharehope.R
import com.example.sharehope.organizationSide.logic.BottomNavBarButtons
import com.example.sharehope.organizationSide.logic.BottomNavBarButtons.AddPost.route
import com.example.sharehope.organizationSide.logic.OrgScreens
import com.example.sharehope.ui.theme.BottomBarColor

@Composable
fun BottomNavBar(
    navController: NavHostController,
    items: List<BottomNavBarButtons>,
    //onBottomClick: () -> Unit
) {

    /*val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route*/

    /*@Composable
    fun currentRoute(navController: NavHostController): String? {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        return navBackStackEntry?.arguments?.getString(route)
    }*/

    //val currentRoute = currentRoute(navController)

    BottomAppBar(
        modifier = Modifier
            .width(392.dp)
            .height(60.dp)
            .background(color = Color.White)
            .clip(RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp)),
        containerColor = BottomBarColor,
        //contentColor = Color.Black
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            items.forEach(){item ->
                Image(
                    painter = painterResource(item.icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                                item.onClick
                            //onBottomClick()
                        }
                )
            }
        }

    }
}




@Preview
@Composable
fun DisplayBottomBar() {
    BottomNavBar( navController = rememberNavController(),
        items = listOf(
            BottomNavBarButtons.Home,
            BottomNavBarButtons.Map,
            BottomNavBarButtons.AddPost,
            BottomNavBarButtons.Money,
            BottomNavBarButtons.Profile),
        //onBottomClick = {}
    )
}