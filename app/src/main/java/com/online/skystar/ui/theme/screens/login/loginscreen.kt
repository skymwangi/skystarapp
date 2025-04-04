package com.online.skystar.ui.theme.screens.login

import android.graphics.drawable.Icon
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.online.skystar.navigation.route_register
import java.nio.file.WatchEvent
import androidx.compose.runtime.mutableStateOf as mutableStateOf1
import androidx.compose.runtime.remember as remember


@Composable
fun Loginscreen(navController: NavHostController ){
var email by remember{ mutableStateOf1(TextFieldValue("")) }
var password by remember { mutableStateOf1(TextFieldValue("")) }
     Column(
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center,
         modifier = Modifier
             .background(Color.White)
             .fillMaxSize()
     ) {
         Text(text = "Login page",
             color = Color.Black,
             fontSize = 30.sp,
             fontFamily = FontFamily.Cursive,
             fontStyle = FontStyle.Italic
             )
      Spacer(modifier = Modifier)
      OutlinedTextField(
          value = email,
          onValueChange = {email=it},
          label = { Text(text = "Enter Email") },
          leadingIcon = {
              Icon(
                  Icons.Default.Email,
                  contentDescription = "Email"
              )


          },
          shape = RoundedCornerShape(20.dp),
          modifier = Modifier.padding(16.dp)



      )
      OutlinedTextField(
          value = password,
          onValueChange = {password=it},
          label = { Text(text = "Enter Password") },
          leadingIcon = {
              Icon(
                  Icons.Default.Lock,
                  contentDescription = "Password"
              )
          },
          shape = RoundedCornerShape(20.dp),
          modifier = Modifier.padding(16.dp)


      )
         Spacer(modifier = Modifier.height(50.dp))
         Button(
             onClick = { /*TODO*/ },
             modifier = Modifier.width(300.dp),
             colors = ButtonDefaults.buttonColors(
                 containerColor = Color.Blue
             )
         ) {
             Text(
                 "Login",
                 fontSize = 30.sp,
                 fontFamily = FontFamily.Cursive
             )
         }
         Spacer(modifier = Modifier.height(20.dp))
         Text(text = "Don't have an account?" +
                 "Click here to sign up now!!!",
             color = Color.Black,
             fontSize = 20.sp,
             fontFamily = FontFamily.Cursive,
             modifier = Modifier.clickable{navController.navigate(route_register)}
         )




     }
}



@Preview
@Composable
private fun Loginprev() {
    Loginscreen(rememberNavController())
    

    
}