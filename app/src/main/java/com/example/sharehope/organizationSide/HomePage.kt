package com.example.sharehope.organizationSide

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.fontFamily
import com.example.sharehope.organizationSide.uiElements.BottomNavBar
import com.example.sharehope.organizationSide.uiElements.CardButton
import com.example.sharehope.organizationSide.uiElements.GradientCard

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold (
        bottomBar = {BottomNavBar()}
    ){innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Good Evening, John",
                    modifier = Modifier
                        .padding(8.dp),
                    style = TextStyle(
                        fontFamily = fontFamily,
                        fontSize = 27.sp,
                        color = Color.Black
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.profile_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(30.dp)
                        .align(Alignment.CenterVertically),
                    alignment = Alignment.Center
                )
            }
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