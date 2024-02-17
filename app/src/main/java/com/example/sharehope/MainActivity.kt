package com.example.sharehope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.LandingScreen
import com.example.sharehope.organizationSide.LoginScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.OngoingCampDetailedView
import com.example.sharehope.organizationSide.logic.OrganizationNavHost
import com.example.sharehope.ui.theme.ShareHopeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShareHopeTheme {
                //val scope = lifecycleScope.launch {  }
                val context = applicationContext
                OrganizationNavHost(applicationContext = context, lifecycleScope = lifecycleScope)
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