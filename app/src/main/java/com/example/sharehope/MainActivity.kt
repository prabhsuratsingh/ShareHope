package com.example.sharehope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sharehope.organizationSide.HomeScreen
import com.example.sharehope.organizationSide.LandingScreen
import com.example.sharehope.organizationSide.LoginScreen
import com.example.sharehope.organizationSide.NewPostScreen
import com.example.sharehope.organizationSide.OngoingCampDetailedView
import com.example.sharehope.organizationSide.logic.OrganizationNavHost
import com.example.sharehope.ui.theme.ShareHopeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import org.web3j.protocol.core.Ethereum

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShareHopeTheme {
                val scope = lifecycleScope
                val context = applicationContext
                OrganizationNavHost(lifecycleScope = scope, context = context )
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