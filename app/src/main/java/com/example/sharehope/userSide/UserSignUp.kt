package com.example.sharehope.userSide

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun mai(){
    Box(modifier = Modifier
        .background(color = Color(0xFF98939C))
        .fillMaxSize()){

        Canvas(modifier = Modifier
            .fillMaxWidth()) {
            drawRoundRect(
                color = Color(0xFF8048A8),
                size = Size(width = 384.dp.toPx() , height =300.dp.toPx() ),

                cornerRadius = CornerRadius(x = 26.dp.toPx(), y = 26.dp.toPx())
            )


        }
        MyUI()
    }}
@Composable
fun MyUI() {
    Box {
        Canvas(
            modifier = Modifier
                .size(size = 300.dp)

        ) {
            drawRoundRect(

                color = Color(0xFFCBCBCC),
                size = Size(width = 340.dp.toPx(), height = 360.dp.toPx()),
                cornerRadius = CornerRadius(x = 26.dp.toPx(), y = 36.dp.toPx()),
                topLeft = Offset(x = 22.dp.toPx(), y = 91.dp.toPx())
            )

        }
        Column{
            Text(text = "Sign up",
                modifier = Modifier
                    .offset(x=100.dp,y=84.dp),
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
            EmailText()
            NumberText()
            PassText()
            Butt {

            }
            Text(text="Already have an account?",
                modifier = Modifier
                    .offset(x=110.dp,y=233.dp))
            TextButt {

            }


        }

    }
}
@Composable
fun TextButt(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick()  }, modifier = Modifier
            .offset(x=258.dp,y=200.dp)
    ) {
        Text("Sign in")
    }
}

@Composable
private fun EmailText() {





    TextField(
        modifier = Modifier
            .offset(x=50.dp,y=93.dp),
        value = " ",
        onValueChange = {
        },
        label = { Text(text = "Email") },
        placeholder = { Text(text = "Enter your Email ID") },


        )

}

@Composable
private fun NumberText() {




    TextField(
        modifier = Modifier
            .offset(x=50.dp,y=103.dp),
        value = " ",
        onValueChange = {
        },
        label = { Text(text = "Number") },
        placeholder = { Text(text = "Enter your number") }

    )
}

@Composable
private fun PassText() {




    TextField(
        modifier = Modifier
            .offset(x=50.dp,y=113.dp),
        value = " ",
        onValueChange = {
        },
        label = { Text(text = "Password") },
        placeholder = { Text(text = "Enter your Password") },


        )
}
@Composable
fun Butt(onClick: () -> Unit) {
    Button(onClick = { onClick() }, modifier = Modifier
        .offset(x = 50.dp, y = 133.dp)
        .size(width = 280.dp, height = 40.dp)
        ,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF891AD8),
        )) {
        Text(text="Sign up")
    }
}
@Preview
@Composable
fun Display(){
    mai();
}