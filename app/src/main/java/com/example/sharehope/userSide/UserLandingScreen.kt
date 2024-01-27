package com.example.sharehope.userSide


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.ui.theme.fontFamily2
import com.example.sharehope.ui.theme.Violet2

@Composable
fun UserLandingScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(310.dp)
                    .clip(RoundedCornerShape(0.dp, 0.dp, 640.dp, 640.dp))
                    .background(Color.LightGray)

            )
            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.LightGray, shape = RectangleShape)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text (
                text = "ShareHope",
                modifier = Modifier,
                style = TextStyle(
                    fontFamily = fontFamily2,
                    color = Violet2,
                    fontWeight = FontWeight.Bold
                ),
                fontSize = 50.sp
            )

            Text(
                text = "Believing in the power of collective impact. Our mission is to provide a platform where individuals, communities, and organizations come together to make a positive change in the world.",
                modifier = Modifier
                    .width(310.dp)
                    .height(90.dp)
                    .padding(top = 15.dp),
                style = TextStyle(
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Violet2),
                modifier = Modifier
                    .width(360.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "GET STARTED",
                    style = TextStyle(
                        fontFamily = fontFamily2,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    ),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "By continuing, you are agreeing to our Terms of Service and Privacy Policies",
                modifier = Modifier
                    .width(360.dp)
                    .height(40.dp),
                style = TextStyle(
                    fontFamily = fontFamily2,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview
@Composable
fun DisplayHomeScreen() {
    UserLandingScreen()
}
