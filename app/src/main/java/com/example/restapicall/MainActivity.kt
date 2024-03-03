package com.example.restapicall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.restapicall.ui.theme.RESTAPICallTheme
import com.example.restapicall.viewmodel.NYCViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RESTAPICallTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    NYCApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun NYCApp(){
   // val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val nycViewModel: NYCViewModel = viewModel()
  var text1: String ="Hello"
    text1 = nycViewModel.nycUiState
    Text(text = text1)
   // Text(text="svdv")

}
/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RESTAPICallTheme {
        Greeting("Android")
    }
}*/
