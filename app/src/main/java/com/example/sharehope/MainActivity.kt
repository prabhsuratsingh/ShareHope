package com.example.sharehope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.LandingScreen
import com.example.sharehope.organizationSide.LoginScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.OngoingCampDetailedView
import com.example.sharehope.ui.theme.ShareHopeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShareHopeTheme {
                OngoingCampDetailedView()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShareHopeTheme {
        OngoingCampDetailedView()
    }
}