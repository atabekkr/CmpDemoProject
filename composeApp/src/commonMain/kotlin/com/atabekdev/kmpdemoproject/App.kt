package com.atabekdev.kmpdemoproject

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmpdemoproject.composeapp.generated.resources.Res
import kmpdemoproject.composeapp.generated.resources.ic_android_black_24dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val versionName = Greeting().greet()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Screen 1")
            Icon(
                modifier = Modifier.clickable {
                    println("Tapped!")
                },
                painter = painterResource(Res.drawable.ic_android_black_24dp),
                contentDescription = null,
            )
            Text(text = versionName)
            Spacer(Modifier.height(50.dp))
            Button(onClick = {
            }) {
                Text(text = "Go to Screen 2")
            }
        }
    }
}