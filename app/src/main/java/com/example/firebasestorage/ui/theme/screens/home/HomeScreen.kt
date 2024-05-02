package com.example.firebasestorage.ui.theme.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.R
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.Teal200

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Home") },
             colors = TopAppBarDefaults.mediumTopAppBarColors(Teal200),
            navigationIcon = {
                IconButton(onClick = {   }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White)

                }
            }

        )


        //Start of Box **(to write words on top of aan image)**
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription =" Car",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds)
            Text(
                text = "Take Your Pick",
                fontSize = 35.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                textAlign = TextAlign.Center)

        }
//End of Box*****
        Spacer(modifier = Modifier.height(5.dp))

//Start of  SearchBar ** How to create a searchbar in Jetpack Compose**

        var search by remember{ mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange ={search = it},
            placeholder = { Text(text = "Find Your Book")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search,
                contentDescription ="Search" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //End of searchbar
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Recently Viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column {

            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
//Card 1
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 2
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
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

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 3
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Bali",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 4
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Maldives",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 5
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "California",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
//Card 6
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                ) {
                    Column {
                        //Image to fill yhe entire width of the card **
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(170.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription ="car",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )

                        }

                        Text(text = "Beach",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp)

                    }

                }
                Spacer(modifier = Modifier.width(5.dp))

//End of Card
            }
            Spacer(modifier = Modifier.height(5.dp))
            

        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}