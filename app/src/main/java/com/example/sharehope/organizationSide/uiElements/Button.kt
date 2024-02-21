package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily

@Composable
fun LoginButton(
    modifier: Modifier = Modifier,
    @DrawableRes buttonImage: Int,
    @StringRes buttonText: Int,
    onContinueClick: () -> Unit
) {
    Button(
        onClick = onContinueClick,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(Color.White),
        modifier = Modifier
            .border(
                width = 2.dp,
                color = Color.Black,
                shape = RoundedCornerShape(8.dp)
            )
            .width(360.dp)
            .height(50.dp)
    ) {
        Image(
            painter = painterResource(buttonImage),  //painterResource(id = R.drawable._icon__google_) ,
            contentDescription = "",
            modifier = Modifier
                .size(20.dp),
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = stringResource(buttonText), //"Continue with Google",
            fontFamily = fontFamily,
            color = Color.Black,
            fontSize = 14.sp,
            modifier = modifier,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun DisplayButton() {
    LoginButton(
        buttonImage = R.drawable.metamask_icon,
        buttonText = R.string.login_metamask,
        onContinueClick = { }
    )
}