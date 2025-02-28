package com.emelsoft.wtv_sl_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(45) { index -> // Generiert 45 Buttons
                    Button(
                        onClick = { /* Handle button click for item ${index + 1} */ },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "${index + 1} : Button",
                            textAlign = TextAlign.Start,
                            color = Color.Yellow
                        )
                    }
                }
            }
        }
    }
}