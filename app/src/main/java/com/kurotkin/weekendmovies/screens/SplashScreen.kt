package com.kurotkin.weekendmovies.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kurotkin.weekendmovies.navigation.Screens
import com.kurotkin.weekendmovies.ui.theme.WeekendMoviesTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var startAnimate by remember {
        mutableStateOf(false)
    }
    val alfaAnimation = animateFloatAsState(
        targetValue = if(startAnimate) 1f else 0f,
        animationSpec = tween(durationMillis = 3000)
    )
    LaunchedEffect(key1 = true){
        startAnimate = true
        delay(4000)
        navController.navigate(Screens.Main.route)
    }

    Splash(alfaAnimation.value)
}

@Composable
fun Splash(alpha: Float){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Icon(
            modifier = Modifier.size(120.dp).alpha(alpha),
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "",
            tint = Color.Red
        )
    }
}

@Composable
@Preview(showBackground = true)
fun splashPrev(){
    WeekendMoviesTheme {
        Splash(1f)
    }
}