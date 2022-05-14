package com.example.verificationscreen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.verificationscreen.ui.theme.Blue

@Composable
fun OTPScreen() {
    val context = LocalContext.current
    var otpValue: String? = null

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Verification Screen",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image",
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
        Spacer(modifier = Modifier.height(75.dp))
        Text(
            text = "Enter the OTP",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        OTPTextFields(
            length = 4
        ) {
            otpValue = it
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                if (otpValue != null) {
                    Toast.makeText(context, "One Time Password Verification", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(45.dp)
                .background(Blue),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Get Otp",
                fontSize = 15.sp,
                color = Color.White
            )
        }
    }
}