package com.example.sharehope.organizationSide

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Dashboard() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                //backgroundColor = Color(0xFFAB47BC), // Purple
                cutoutShape = CircleShape,
                modifier = Modifier
                    .graphicsLayer {
                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp
                        )
                        clip = true
                    }
                    .background(
                        color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp
                        )
                    ),
                content = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Home, contentDescription = "Home")
                        }
                        IconButton(onClick = { /* Handle place icon click */ }) {
                            Icon(Icons.Filled.Place, contentDescription = "Place")
                        }
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.MailOutline, contentDescription = "Add comment")
                        }
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Lock, contentDescription = "Account balance wallet")
                        }
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Person, contentDescription = "Person")
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Dashboard",
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp),
                style = TextStyle(fontSize = 20.sp)
            )
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Settings,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(top = 2.dp, end = 8.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Column(
            modifier = Modifier.padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Person Icon",
                modifier = Modifier
                    .size(150.dp)
                    .padding(top = 32.dp)
            )
            Text(
                text = "Organisation Name",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(top = 16.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Analytics")
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Chevron Right")
                    }
                }
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Impressions")
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Chevron Right")
                    }
                }
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Camps")
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Chevron Right")
                    }
                }
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Volunteers")
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Chevron Right")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DisplayDashboard(){
    Dashboard()
}