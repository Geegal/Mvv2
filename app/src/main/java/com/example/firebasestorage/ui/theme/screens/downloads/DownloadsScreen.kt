package com.example.firebasestorage.ui.theme.screens.downloads



import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.R
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.Teal200

@Composable
fun DownloadsScreen(navController:NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ){

        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Clothing")},
            backgroundColor = Color.Cyan
        )
        //Start of Box **(to write words on top of aan image)**
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
            contentAlignment = Alignment.BottomStart){
            Image(painter = painterResource(id = R  .drawable.ic_launcher_background),
                contentDescription =" Car",
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {

                        Toast.makeText(mContext,"Clicked on image!",
                            Toast.LENGTH_SHORT).show()
                    }
                ,
                contentScale = ContentScale.FillBounds)
            Column {
                Text(
                    text = "Winter Collection",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp))

                Text(
                    text = "Purchase your clothes",
                    color = Color.White,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }//column for text



        }
//End of Box*****
        Spacer(modifier = Modifier.height(20.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Row {
                //Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill the entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "NewYork",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.1800",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
                //Card 2

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Ibiza",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.1500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card

            }//end of first row
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                //Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(160.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "NewYork",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.2100",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
                //Card 2

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Ibiza",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.2000",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card

            }//end of first row
            Row {
                //Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "NewYork",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.1600",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
                //Card 2

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Ibiza",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.3200",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card

            }//end of first row
            Row {
                //Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "NewYork",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.2500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
                //Card 2

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    elevation = 8.dp
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Ibiza",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        Text(text = "Kshs.5000",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)
                        OutlinedButton(onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                        },
                            shape = RoundedCornerShape(5.dp),
                            colors = ButtonDefaults.buttonColors(Teal200),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp, end = 30.dp)) {
                            Text(text = "Pay")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card

            }//end of first row


        }




    }

}

@Preview
@Composable
fun DownloadsScreenPreview() {
    DownloadsScreen(rememberNavController())
}