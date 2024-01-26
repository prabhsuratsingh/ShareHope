package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.fontFamily

@Composable
fun EnterDetailField(
    modifier: Modifier = Modifier,
    @StringRes heading: Int,
    icon: @Composable (() -> Unit) = { },
    height: Dp
) {
    Text(
        text = stringResource(heading),
        style = TextStyle(
            fontFamily = fontFamily,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        ),
        modifier = Modifier
            .padding(start = 8.dp)
    )

    OutlinedTextField(
        value = "" ,
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
            .height(height)
            .clip(RoundedCornerShape(12.dp))
            .border(width = 2.dp, Color.Black, RoundedCornerShape(12.dp))
            .background(Color.White),
        leadingIcon = icon,
        colors = OutlinedTextFieldDefaults.colors(Color.White)
    )
}

@Composable
fun DollarIcon() {
    Image(
        painter = painterResource(id = R.drawable.dollar_icon),
        contentDescription = "",
        modifier = Modifier
            .size(25.dp)
    )
}


@Preview
@Composable
fun DisplayTextField() {
    EnterDetailField(
        heading = R.string.title,
        icon = {DollarIcon()},
        height = 40.dp
    )
}

@Preview
@Composable
fun DisplayDollarIcon() {
    DollarIcon()
}