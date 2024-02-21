package com.example.sharehope.web3

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
//import androidx.compose.runtime.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.web3j.protocol.core.DefaultBlockParameterName
import org.web3j.protocol.core.methods.response.EthGetBalance
import java.math.BigInteger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.future.await
import kotlinx.coroutines.withContext
import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService
import org.web3j.protocol.core.methods.response.NetVersion
import retrofit2.http.Tag

private val TAG = "MyActivity"

suspend fun initializeWeb3j(
/*viewModel: AddressViewModel*/
    address: String
): Web3j? {

    //val address by viewModel.state
    Log.i(TAG,address)
    val infuraApiKey = address
    val infuraUrl = "https://mainnet.infura.io/v3/73544f6a59474e47944ec133f6c1440b"

        /*val web3j = withContext(Dispatchers.IO) {
            Web3j.build(HttpService(infuraUrl))
        }*/
    val web3j =  Web3j.build(HttpService(infuraUrl))

        // Check if the connection was successful using coroutine's 'await()'
        val netVersion: NetVersion = web3j.netVersion().sendAsync().await()

        if (netVersion.hasError()) {
             return null
        } else {
            // Connection successful
            return web3j
        }


}


/*
suspend fun getBalance(
)*/
/*: BigInteger?*//*
 {
    val infuraApiKey = "73544f6a59474e47944ec133f6c1440b"
    val infuraUrl = "https://sepolia.infura.io/v3/$infuraApiKey"


        try {
            val web3j = Web3j.build(HttpService(infuraUrl))
            if (web3j.netVersion().send().hasError()) {

            }
            return web3j
        } catch (e: Exception) {

        }


    val address = AddressState::text.toString()



    rememberCoroutineScope {
        GlobalScope.launch(Dispatchers.IO) {
            // Query Ether balance for an Ethereum address
            val balance: EthGetBalance =
                web3j.ethGetBalance(address, DefaultBlockParameterName.LATEST).send()
            val weiBalance: BigInteger = balance.balance


            // Update state on the main thread
            launch(Dispatchers.Main) {
                ethereumBalance = weiBalance
            }
        }
    }

    */
/*return ethereumBalance*//*

}

var ethereumBalance by remember{
    mutableStateOf<BigInteger?>(null)
}*/
