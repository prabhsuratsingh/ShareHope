package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.sharehope.R
import com.example.sharehope.organizationSide.logic.BottomBarNavGraph
import com.example.sharehope.organizationSide.logic.BottomNavBarButtons
import com.example.sharehope.organizationSide.uiElements.BottomNavBar
import com.example.sharehope.organizationSide.uiElements.CardButton
import com.example.sharehope.organizationSide.uiElements.GradientCard
import com.example.sharehope.organizationSide.uiElements.TopTextRow

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold (
        bottomBar = { BottomNavBar(
            navController = rememberNavController(),
            items = listOf(
                BottomNavBarButtons.Home,
                BottomNavBarButtons.Map,
                BottomNavBarButtons.AddPost,
                BottomNavBarButtons.Money,
                BottomNavBarButtons.Profile
            )
        )}
    ){innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            TopTextRow(heading = R.string.top_greeting)
            //Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(165.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                CardButton(
                    background = R.drawable.ongoing_camp,
                    modifier = Modifier.padding(horizontal = 10.dp),
                    width = 175.dp,
                    text = R.string.ongoing_camps
                )
                CardButton(
                    background = R.drawable.all_camps,
                    modifier = Modifier.padding(horizontal = 10.dp),
                    width = 175.dp,
                    text = R.string.all_camps
                )

            }
            Spacer(modifier = Modifier.height(14.dp))
            GradientCard()
            Spacer(modifier = Modifier.height(14.dp))
            CardButton(
                modifier = Modifier.padding(
                    bottom = 8.dp,
                    start = 10.dp,
                    end = 10.dp
                ),
                background = R.drawable.dashboard_pic,
                text = R.string.dashboard,
                width = 375.dp
            )
        }
    }
}

@Preview
@Composable
fun DisplayHomeScreen() {
    HomeScreen()
}