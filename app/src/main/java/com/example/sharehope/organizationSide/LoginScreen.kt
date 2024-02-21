package com.example.sharehope.organizationSide


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharehope.R
import com.example.sharehope.ui.theme.fontFamily
import com.example.sharehope.organizationSide.uiElements.LoginButton
import com.example.sharehope.web3.AddressState
import com.example.sharehope.web3.initializeWeb3j


@Composable
fun LoginScreen(
    onEnterAddress: (String) -> Unit,
    onMetaMaskClick: () -> Unit,
    modifier: Modifier = Modifier,
    //state: SignInState,
    //onGoogleClick: () -> Unit
    //state: AddressState
) {
     //var state by remember{ mutableStateOf(AddressState()) }
    var text by rememberSaveable { mutableStateOf("Enter Address") }
    /*val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let {error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }*/



    Box (
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.login_background),
                contentScale = ContentScale.FillBounds
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Connect Metamask",
                fontFamily = fontFamily,
                color = Color.Black,
                fontSize = 36.sp,
                modifier = modifier,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = text ,
                onValueChange = {
                    text = it
                    //state = state.copy(text = text)
                    onEnterAddress(it)
                                },
                enabled = true,
                textStyle = TextStyle(color = Color.Black),
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color(0xFF000000),
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .width(360.dp)
                    .height(50.dp)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 10.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            LoginButton(
                buttonImage = R.drawable.metamask_icon ,
                buttonText = R.string.login_metamask,
                onContinueClick = onMetaMaskClick
            )
        }
    }
}

@Preview
@Composable
fun DisplayLoginScreen() {
    //LoginScreen(onMetaMaskClick = { }, onEnterAddress = { })
}
