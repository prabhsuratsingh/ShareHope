package com.example.sharehope.organizationSide

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.sharehope.organizationSide.uiElements.CardButton

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
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
        Spacer(modifier = Modifier.height(8.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(165.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
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

    }
}

@Preview
@Composable
fun DisplayHomeScreen() {
    HomeScreen()
}