package com.example.sharehope.userSide

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.ShareHopeTheme

@Composable
fun Briefing(donated:Int =8890, raised: Int =83400, goal: Int= 100000){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(13.dp, 0.dp)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.04f)
        )

        TopScreen()

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.015f)
        )
        Box(
            modifier = Modifier
                .background(
                    Color(221, 214, 214, 255),
                    shape = RoundedCornerShape(20.dp)
                )
                .fillMaxWidth()
                .fillMaxHeight(0.3f)
        ) {

        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.035f)
        )

        Text(
            text = "ORGANIZATION NAME , PLACE",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.03f)
        )

        Row(
            verticalAlignment = Alignment.Bottom
        ) {
            PlacingIcons()

            Spacer(modifier = Modifier.fillMaxWidth(0.23f))

            Text(text = "+$donated donated", fontWeight = FontWeight.Light)
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.03f)
        )

        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                    " tempor incididunt ut labore et dolore magna aliqua. Adipiscing vitae proin" +
                    " sagittis nisl rhoncus mattis rhoncus urna neque. Commodo sed egestas egestas" +
                    " fringilla phasellus faucibus scelerisque eleifend donec. Rhoncus dolor purus " +
                    "non enim praesent elementum facilisis leo vel. Diam maecenas sed enim ut sem. " +
                    "tellus. Vel turpis nunc eget lorem dolor sed viverra.\n"+
                    "Vehicula ipsum a arcu cursus vitae congue mauris rhoncus aenean. Arcu non " +
                    "sodales neque sodales ut etiam sit amet nisl. Libero enim sed faucibus turpis in" +
                    " eu mi bibendum. Faucibus purus in massa tempor nec feugiat nisl pretium. " +
                    "Tristique nulla aliquet enim tortor at auctor urna.Ultrices sagittis orci a" +
                    " scelerisque purus. Sollicitudin ac orci phasellus egestas tellus rutrum ",
            softWrap = true,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 15.sp
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.07f)
        )

        GoalsAndRaisedButns(raised, goal)

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(120, 95, 190, 255)
            ),
            contentPadding = PaddingValues(0.dp, 0.dp, 0.dp, 5.dp)
        ) {
            Text(
                text = "DONATE NOW!",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun TopScreen(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /* Handle first button click */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(153, 125, 230, 221)
            ),
            modifier = Modifier.wrapContentSize(Alignment.Center)

        ) {
            Icon(
                painter = painterResource(id = R.drawable.leftarrow),
                contentDescription = "Return",
                modifier = Modifier.size(25.dp),
                tint = Color.Black
            )
        }

        Button(
            onClick = { /* Handle second button click */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(153, 125, 230, 221)
            )
        ) {
            Text(text = "Share", color = Color.Black, fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}

@Composable
fun GoalsAndRaisedButns(raised: Int, goal: Int) {
    Row() {
        Spacer(modifier = Modifier.fillMaxWidth(0.05f))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(175, 152, 238, 221)
            )
        ) {
            Text(
                text = "$$raised raised",
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.fillMaxWidth(0.15f))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(175, 152, 238, 221)
            )
        ) {
            Text(
                text = "$$goal  goal",
                color = Color.Black
            )
        }


    }
}

@Composable
fun PlacingIcons() {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.ellipse8),
            contentDescription = "",
            modifier = Modifier.size(28.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse10),
            contentDescription = "",
            modifier = Modifier
                .offset(24.dp)
                .size(28.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse11),
            contentDescription = "",
            modifier = Modifier
                .offset(48.dp)
                .size(28.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse9),
            contentDescription = "",
            modifier = Modifier
                .offset(72.dp)
                .size(28.dp)
        )
    }
}

@Preview
@Composable
fun Apreview(){
    ShareHopeTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Briefing()
        }
    }
}
