package com.example.sharehope.organizationSide

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily
import com.example.sharehope.ui.theme.Violet

@Composable
fun LandingScreen(
    modifier: Modifier = Modifier,
    onGetStartedClick: () -> Unit
) {

    Box (
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.landing_background),
                contentScale = ContentScale.FillBounds
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "ShareHope",
                modifier = Modifier
                    .offset(0.dp, 280.dp),
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.Black,
                    fontWeight = Bold
                ),
                fontSize = 70.sp
            )
            Spacer(modifier = Modifier.height(500.dp))
            Button(
                onClick = onGetStartedClick,
                colors = ButtonDefaults.buttonColors(Violet),
                modifier = Modifier
                    .width(360.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Let's get started",
                    style = TextStyle(
                        fontFamily = fontFamily,
                        color = Color.White,
                        fontWeight = Bold
                    ),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "By continuing, you are agreeing to our Terms of Service and Privacy Policies",
                modifier = Modifier
                    .width(295.dp)
                    .height(32.dp),
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.White,
                    fontWeight = Bold
                ),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun DisplayLanding() {
    LandingScreen(onGetStartedClick = {})
}