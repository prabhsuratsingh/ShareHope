package com.example.sharehope.organizationSide.uiElements

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R


@Composable
fun Orgcard(
    modifier: Modifier = Modifier,
    @DrawableRes picture: Int,
    gradient: Brush

) {

    //val brush = Brush.verticalGradient(listOf(C1, C2, Color.White))

    Box (
        modifier = modifier
            .height(290.dp)
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
            .shadow(
                elevation = 70.dp,
                ambientColor = Color.Gray,

                )
            .background(
                brush = gradient,
                shape = RoundedCornerShape(20.dp),

                )
    ) {
        Image(
            painter = painterResource(picture),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .clip(RoundedCornerShape(20.dp))
                .shadow(
                    elevation = 100.dp,
                    ambientColor = Color.Gray
                )

                .align(Alignment.TopCenter),
                /*.background(
                    brush = brush,
                    shape = RoundedCornerShape(20.dp)
                )*/
                //.width(600.dp),


            alignment = Alignment.Center,


        )
        Row(

            modifier = Modifier
                //.height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween


        ) {
            Text(
                text = "Organisation Name",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold

                ),
                modifier = Modifier
                    .padding(start = 13.dp, top = 198.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.linkedin_logo),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 195.dp, end = 12.dp, start = 175.dp)
                    .size(20.dp)
                    .clip(RoundedCornerShape(3.dp))
                    .align(Alignment.CenterVertically)

            )
            Image(
                painter = painterResource(id = R.drawable.instagram_logo),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 195.dp, end = 12.dp)
                    .size(20.dp)
                    .clip(RoundedCornerShape(3.dp))
                    .align(Alignment.CenterVertically))
        }


        Text(
            text = "Description",
            style = TextStyle(
                color = Color.Black,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 13.dp, top = 215.dp)
        )
        Text(
            text = "Money raised -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 13.dp, top = 260.dp)

        )
        Text(
            text = "Impact -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 120.dp, top = 260.dp)

        )
        Text(
            text = "Volunteers -",
            style = TextStyle(
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold

            ),
            modifier = Modifier
                .padding(start = 200.dp, top = 260.dp)

        )
        Spacer(modifier = Modifier.height(14.dp))



        //val brush = Brush.verticalGradient(listOf(C1,C2,C3, C4))

    }
}




@Preview
@Composable
fun DisplayCard() {
    Orgcard(picture = R.drawable.card_image ,
        gradient =Brush.verticalGradient(listOf()) )

}
