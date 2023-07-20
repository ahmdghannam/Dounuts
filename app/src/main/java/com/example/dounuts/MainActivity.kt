package com.example.dounuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dounuts.ui.theme.DounutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DounutsTheme {
                DonatDescriptionScreen()
            }
        }
    }

    @Composable
    private fun DonatDescriptionScreen() {

        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(44.dp))

            Image(
                painter = painterResource(R.drawable.ic_back),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.height(12.dp))
            Image(
                painter = painterResource(R.drawable.donat_smallll),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight(0.3f)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Strawberry Wheel",
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "About Gonut",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Quantity",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row() {
                Spacer(modifier = Modifier.width(40.dp))
                Text(
                    text = "-",
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = "1", fontSize = 22.sp
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = "+",
                    fontSize = 22.sp
                )
            }
            Spacer(modifier = Modifier.height(44.dp))
            Row() {
                Text(
                    text = "£16", fontSize = 30.sp
                )
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .padding(horizontal = 22.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFF7074))
                ) {
                    Text(text = "Get Started",color= Color.White)
                }

            }


        }
    }

    @Composable
    private fun OnBoardingScreen() {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.donats),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.fillMaxSize(0.5f))
            Text(
                text = "Gonuts\nwith\nDonuts",
                fontSize = 40.sp,
                lineHeight = 42.sp
            )
            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(60.dp))

            Button(
                onClick = {

                },
                modifier = Modifier
                    .padding(40.dp, 22.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(text = "Get Started")
            }

        }
    }

    @Composable
    private fun HomeScreen() {

    }


}