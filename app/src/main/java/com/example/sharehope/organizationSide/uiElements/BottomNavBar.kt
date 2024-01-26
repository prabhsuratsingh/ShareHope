package com.example.sharehope.organizationSide.uiElements


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sharehope.ui.theme.BottomBarColor

@Composable
fun BottomNavBar() {
    //transfer this list and corresponding state to view model
    var selectedItem by remember{ mutableIntStateOf(0) }
    val items = listOf("home","map","addPost","money","profile")

    NavigationBar (
        modifier = Modifier
            .alpha(0.7f)
            .blur(radius = 4.dp)
            .width(390.dp)
            .height(74.dp)
            .clip(RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp)),
        containerColor = BottomBarColor,
        contentColor = Color.Black
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index},
                icon = { /*TODO to create a sealed class with each button as an
                             object */}
            )
        }
    }
}

@Preview
@Composable
fun DisplayBottomBar() {
    BottomNavBar()
}