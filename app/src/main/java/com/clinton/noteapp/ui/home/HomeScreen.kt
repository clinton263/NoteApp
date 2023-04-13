package com.clinton.noteapp.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.test.withTestContext


@Composable
fun HomeScreen() {
    Scaffold() {
        LazyColumn{
            items(3){
                Text(text = "test")
            }
            item {
                Box (modifier = Modifier.fillMaxWidth()){
                    Button(
                        modifier = Modifier.align(Alignment.Center),
                        onClick = { }) {
                        Text(text = "add note")
                        
                    }

                }

            }

            }
        }
        

    }
    


@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}