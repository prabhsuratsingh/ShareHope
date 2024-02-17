package com.example.sharehope.organizationSide.uiElements


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R

@Composable
fun TitleCard() {
    Box(
        //modifier = Modifier.width(420.dp)
    ) {
        Column(
            modifier = Modifier
                .width(420.dp)
                .height(320.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.title_card),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    //.size(390.dp)
                    .width(390.dp)
                    .height(250.dp)
                    //.aspectRatio(1f, matchHeightConstraintsFirst = false)
                    .padding(start = 10.dp, end = 10.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Title",
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(start = 10.dp)
            )

            Text(
                text = "Description",
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
            Divider(
                color = Color.DarkGray,
                thickness = 3.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
                    .width(10.dp)
            )

        }
    }
}

@Preview
@Composable
fun DisplayCard() {
    TitleCard()
}