package com.example.Sharehopeuig

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Second: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Se()

        }
    }

    @Composable
    fun Se() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ){
            item {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .padding(top = 20.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .weight(0.7f)
                        ) {
                            Column(
                                modifier = Modifier
                                    .weight(0.7f)
                                    .height(140.dp)
                            ) {
                                // First column
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(70.dp)
                                ) {
                                    Text(
                                        text = "Hello!",
                                        fontFamily = FontFamily.Serif,
                                        color = Color(android.graphics.Color.parseColor("#FFBB86FC")),
                                        fontSize = 50.sp,
                                        modifier = Modifier.padding(25.dp, 0.dp)
                                    )
                                }

                                // Second column aligned below the first column
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(70.dp)

                                ) {
                                    Text(
                                        text = "Your Name ",
                                        fontFamily = FontFamily.Serif,
                                        fontSize = 36.sp,
                                        color = Color.Black,
                                        modifier = Modifier.padding(25.dp, 0.dp)
                                    )
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .weight(0.3f)
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                                contentDescription = "Centered Image",
                                modifier = Modifier
                                    .fillMaxWidth(0.8f)
                                    .clip(RoundedCornerShape(25.dp))
                                    .height(70.dp)
                                    .background(Color.LightGray),
                                contentScale = ContentScale.Crop
                            )
                        }

                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 5.dp), verticalArrangement = Arrangement.Bottom) {
                    Text(
                        text = "BROWSE ORGANISATIONS",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Gray,
                        modifier = Modifier.padding(27.dp, 0.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(13.dp)
                            .padding(top = 200.dp)
                    ) {}
                }
            }
            item{
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(15.dp)
                    .background(Color.Gray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {}}
            item{
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .height(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(0.2f)
                        .height(13.dp)
                        .background(Color(android.graphics.Color.parseColor("#FFBB86FC")))
                ) {}}}
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .height(20.dp)
                ) {
                    Row {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(0.6f)
                                .height(20.dp)
                        ) {
                            Text(
                                text = "$20,300 raised",
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif
                            )

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp), horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "$75,300 gaol",
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif
                            )
                        }
                    }
                }
            }
            item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(15.dp)
                    .background(Color.Gray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {}}
            item{
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .height(15.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.4f)
                            .height(13.dp)
                            .background(Color(android.graphics.Color.parseColor("#FFBB86FC")))
                    ) {}}}
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .height(20.dp)
                ) {
                    Row {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(0.6f)
                                .height(20.dp)
                        ) {
                            Text(
                                text = "$40,300 raised",
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif, textAlign = TextAlign.End
                            )

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                            , horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                text = "$95,300 goal",
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif
                            )
                        }
                    }
                }
            }
        }

        }
    }