package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.organizationSide.uiElements.TitleCard


@Composable
fun OngoingScreen() {
    Scaffold (){innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            Spacer(modifier = Modifier.height(26.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp),
                //.padding(top = 16.dp, start = 4.dp, end = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Ongoing Camps",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 25.sp,
                    fontStyle = FontStyle.Italic
                )
                Icon(
                    Icons.Filled.AccountCircle,
                    tint = Color.Black ,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { }
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            TitleCard()
            TitleCard()
        }

    }
}

@Preview
@Composable
fun Display() {
    OngoingScreen()
}