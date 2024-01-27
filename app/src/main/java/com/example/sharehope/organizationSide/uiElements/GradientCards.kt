package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily
import com.example.sharehope.ui.theme.C1
import com.example.sharehope.ui.theme.C2
import com.example.sharehope.ui.theme.C3
import com.example.sharehope.ui.theme.C4

val brush = Brush.verticalGradient(listOf(C1, C2, C3, C4))
@Composable
fun GradientCard(
    modifier: Modifier = Modifier,
) {

    Box (
        modifier = modifier
            .height(300.dp)
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
            .background(
                brush = brush,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Column {
            Text(
                text = "Total Raised",
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.White,
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(top = 18.dp, start = 18.dp)
            )
            Text(
                text = "$1,30,000",
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.White,
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(start = 18.dp)
            )

            Spacer(modifier = Modifier.height(55.dp))

            Row (
                modifier = modifier
                    .padding(start = 21.dp),
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
                    text ="x",
                    style = TextStyle(
                        fontSize = 26.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight(400),
                        color = Color.Black
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

            Text(
                text = "To be Raised",
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.White,
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(start = 18.dp)
            )
            Text(
                text = "$1,30,000",
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.White,
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(start = 18.dp)
            )
        }
    }
}

@Composable
fun SingleGradientBox(
    @StringRes heading: Int
) {
    Box (
        modifier = Modifier
            //.fillMaxSize()
            .height(150.dp)
            .padding(horizontal = 10.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(15.dp),
                ambientColor = Color.DarkGray
            )
            .background(
                brush = brush,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Text(
            text = stringResource(heading),
            style = TextStyle(
                fontFamily = fontFamily,
                color = Color.White,
                fontSize = 20.sp
            ),
            modifier = Modifier
                .padding(top = 18.dp, start = 18.dp)
        )
    }
}

@Preview
@Composable
fun DisplayGradientCard() {
    GradientCard()
}

@Preview
@Composable
fun DisplaySingleCard() {
    SingleGradientBox(
        heading = R.string.total_money_raised
    )
}