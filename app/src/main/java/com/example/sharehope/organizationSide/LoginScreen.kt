package com.example.sharehope.organizationSide


import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.organizationSide.authentication.SignInState
import com.example.sharehope.ui.theme.fontFamily
import com.example.sharehope.organizationSide.uiElements.LoginButton

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: SignInState,
    onGoogleClick: () -> Unit
) {

    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let {error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }
    Box (
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.login_background),
                contentScale = ContentScale.FillBounds
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Login",
                fontFamily = fontFamily,
                color = Color.Black,
                fontSize = 36.sp,
                modifier = modifier,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                    value = "email",
            onValueChange = {},
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 10.dp)
                )
                .width(360.dp)
                .height(50.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 10.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = "password",
                onValueChange = {},
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color(0xFF000000),
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .width(360.dp)
                    .height(50.dp)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 10.dp))
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = "-",
                    modifier = Modifier
                        .padding(0.dp, 18.dp)
                        .width(146.dp)
                        .height(1.dp)
                        .background(color = Color.Black)
                )
                Text(
                    text ="or",
                    style = TextStyle(
                        fontSize = 26.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight(400)
                    )
                )
                Text(
                    text = "-",
                    modifier = Modifier
                        .padding(0.dp, 18.dp)
                        .width(146.dp)
                        .height(1.dp)
                        .background(color = Color.Black)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            LoginButton(
                buttonImage = R.drawable._icon__google_ ,
                buttonText = R.string.login_google,
                onSignInClick = onGoogleClick
            )
            Spacer(modifier = Modifier.height(10.dp))
            LoginButton(
                buttonImage = R.drawable._icon__apple_ ,
                buttonText = R.string.login_apple,
                onSignInClick = {}
            )
        }
    }
}

@Preview
@Composable
fun DisplayLoginScreen() {
    //LoginScreen(onGoogleClick = {})
}
