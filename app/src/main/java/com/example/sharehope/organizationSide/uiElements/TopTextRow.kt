package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily

@Composable
fun TopTextRow(
    modifier: Modifier = Modifier,
    @StringRes heading: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = stringResource(heading),
            modifier = Modifier
                .padding(8.dp),
            style = TextStyle(
                fontFamily = fontFamily,
                fontSize = 27.sp,
                color = Color.Black
            )
        )
        Image(
            painter = painterResource(id = R.drawable.profile_icon),
            contentDescription = "",
            modifier = Modifier
                .padding(8.dp)
                .size(30.dp)
                .align(Alignment.CenterVertically),
            alignment = Alignment.Center
        )
    }
}


@Preview
@Composable
fun DisplayTopRow() {
    TopTextRow(heading = R.string.top_greeting)
}