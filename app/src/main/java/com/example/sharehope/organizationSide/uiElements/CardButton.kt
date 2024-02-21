package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily

@Composable
fun CardButton(
    modifier: Modifier = Modifier,
    @DrawableRes background: Int,
    @StringRes text: Int,
    width: Dp,
    onBoxClick: () -> Unit
) {
    Box (
        modifier = modifier
            .width(width)
            .height(165.dp)
            .clip(RoundedCornerShape(8.dp, 8.dp, 8.dp, 8.dp))
            .paint(
                painterResource(id = background),
                contentScale = ContentScale.FillBounds
            )
            .clickable(
                enabled = true,
                onClick = onBoxClick
            )
    ){
        Text(
            text = stringResource(text),
            //textAlign = Alignment.BottomStart,
            style = TextStyle(
                fontFamily = fontFamily,
                color = Color.White,
                fontSize = 20.sp
            ),
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.BottomStart)
                .height(50.dp)
                .width(98.dp)
        )
    }
}


@Preview
@Composable
fun DisplayCardButton() {
    CardButton(
        background = R.drawable.ongoing_camp,
        width = 175.dp,
        text = R.string.ongoing_camps,
        onBoxClick = { }
        )
}

