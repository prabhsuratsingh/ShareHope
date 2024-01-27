package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily
import com.example.sharehope.organizationSide.uiElements.BottomNavBar
import com.example.sharehope.organizationSide.uiElements.SingleGradientBox
import com.example.sharehope.organizationSide.uiElements.TopTextRow

@Composable
fun OngoingCampDetailedView() {

    Scaffold (
        bottomBar = { BottomNavBar()}
    ){innerPadding ->

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ){

            TopTextRow(heading = R.string.ongoing_camps)

            Box(
                modifier = Modifier
                    .width(365.dp)
                    .height(230.dp)
                    .paint(
                        painterResource(id = R.drawable.ongoing_pic),
                        contentScale = ContentScale.FillBounds
                    )
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = "Title",//title of camp will come here
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.Black,
                    fontSize = 32.sp
                ),
                modifier = Modifier
                    .padding(start = 22.dp, top = 10.dp)
            )
            Text(
                text = "Description",//brief description of camp, one line only, will add animation
                style = TextStyle(
                    fontFamily = fontFamily,
                    color = Color.Black,
                    fontSize = 20.sp
                ),
                modifier = Modifier
                    .padding(start = 22.dp)
            )
            Spacer(modifier = Modifier.height(18.dp))


            val titles = listOf(R.string.total_money_raised,R.string.amount_left,R.string.impressions,R.string.volunteers)
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.height(350.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
                ) {
                items(titles.size){
                    SingleGradientBox(heading = titles[it] )
                }
                /*item {
                    SingleGradientBox()
                }
                item {
                    SingleGradientBox()
                }
                item {
                    SingleGradientBox()
                }
                item {
                    SingleGradientBox()
                }*/
            }

        }

    }
}


@Preview
@Composable
fun DisplayOngoingCamp() {
    OngoingCampDetailedView()
}