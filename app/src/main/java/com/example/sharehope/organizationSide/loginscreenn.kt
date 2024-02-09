package com.example.Sharehopeui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Contentt()

        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Contentt() {
        var text by remember { mutableStateOf(TextFieldValue()) }
        var text1 by remember {
            mutableStateOf(TextFieldValue())
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.rename),
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(3.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Column {
            Text(
                text = "Login",
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp, 100.dp, 0.dp, 0.dp)


            )
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                placeholder = { Text("Enter Email or phone number") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .border(3.dp, Color.Black)



                )
            TextField(
                value = text1,
                onValueChange = {
                    text1 = it
                },
                placeholder = {
                    Text("Enter Password")
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .border(3.dp, Color.Black)

            )
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Button(
                    onClick = {
                    }, modifier = Modifier
                        .background(Color.Transparent)
                ) {
                    Text(text = "Forgot Password?")
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Divider(
                            modifier = Modifier.weight(3f),
                            color = Color.Black
                        )
                        Text(
                            text = "or",
                            modifier = Modifier.padding(horizontal = 14.dp),
                            color = Color.Black,
                            fontSize = 25.sp
                        )
                        Divider(
                            modifier = Modifier.weight(3f),
                            color = Color.Black
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = {
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp)
                            ,
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = "Continue with Google",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )
                            }
                        }

                        Button(
                            onClick = {
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp),
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.apple),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Text(
                                    text = "Continue with Apple",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


