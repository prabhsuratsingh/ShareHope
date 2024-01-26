package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sharehope.R
import com.example.sharehope.organizationSide.uiElements.BottomNavBar
import com.example.sharehope.organizationSide.uiElements.DollarIcon
import com.example.sharehope.organizationSide.uiElements.EnterDetailField
import com.example.sharehope.organizationSide.uiElements.GradientIconCard
import com.example.sharehope.organizationSide.uiElements.TopTextRow

@Composable
fun NewPostScreen() {

    Scaffold (
        bottomBar = { BottomNavBar() }
    ){innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {

            TopTextRow(heading = R.string.new_post_heading)

            GradientIconCard(
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            EnterDetailField(
                heading = R.string.title,
                height = 50.dp
            )
            Spacer(modifier = Modifier.height(20.dp))
            EnterDetailField(
                heading = R.string.location,
                height = 50.dp
            )
            Spacer(modifier = Modifier.height(20.dp))
            EnterDetailField(
                heading = R.string.description,
                height = 130.dp
            )
            Spacer(modifier = Modifier.height(20.dp))
            EnterDetailField(
                heading = R.string.amount_to_be_raised,
                icon = { DollarIcon() },
                height = 50.dp
            )
        }
    }
}


@Preview
@Composable
fun DisplayNewPostScreen() {
    NewPostScreen()
}