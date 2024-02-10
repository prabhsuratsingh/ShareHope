package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sharehope.R
import com.example.sharehope.organizationSide.uiElements.Orgcard
import com.example.sharehope.organizationSide.uiElements.TopTxtRow
import com.example.sharehope.ui.theme.C1
import com.example.sharehope.ui.theme.C2
import com.example.sharehope.ui.theme.C5
import ui.elements.BottomNavBar


@Composable
fun Collaborations() {
    Scaffold (
        bottomBar = { BottomNavBar() }
    ){innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {

            TopTxtRow(heading = R.string.new_post_heading)
            Orgcard(picture = R.drawable.card_image, gradient = Brush.verticalGradient(listOf(C1, C1,
                C5,)) )
            Spacer(modifier = Modifier.height(19.dp))
            Orgcard(picture = R.drawable.card_image, gradient = Brush.verticalGradient(listOf(C2, C2,
                C5)) )

        }}}
@Preview
@Composable
fun DisplayOrganisationCollaborations() {
    Collaborations()

}


