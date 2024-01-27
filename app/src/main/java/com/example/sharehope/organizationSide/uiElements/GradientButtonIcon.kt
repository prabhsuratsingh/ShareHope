package com.example.sharehope.organizationSide.uiElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.C1
import com.example.sharehope.ui.theme.C2
import com.example.sharehope.ui.theme.C3
import com.example.sharehope.ui.theme.C4

@Composable
fun GradientIconCard(
    modifier: Modifier = Modifier,
) {

    val brush = Brush.verticalGradient(listOf(C1, C2, C3, C4))

    Box (
        modifier = modifier
            .height(200.dp)
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
            .background(
                brush = brush,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.add_post_icon),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.Center)
                .size(50.dp),
            alignment = Alignment.Center
        )
    }
}


@Preview
@Composable
fun DisplayIconCard() {
    GradientIconCard()
}