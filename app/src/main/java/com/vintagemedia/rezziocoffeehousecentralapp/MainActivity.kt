package com.vintagemedia.rezziocoffeehousecentralapp

import android.app.Activity
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.vintagemedia.rezziocoffeehousecentralapp.devUtilities.DefaultPlaceholder
import com.vintagemedia.rezziocoffeehousecentralapp.ui.theme.RezzioCoffeeHouseCentralAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RezzioCoffeeHouseCentralAppTheme {
                // A surface container using the 'background' color from the theme
                    // below is for defaulting to landscape
                    val activity = (LocalContext.current as Activity)
                    activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                    // from util
                    DefaultPlaceholder()
                }
            }
        }
    }
