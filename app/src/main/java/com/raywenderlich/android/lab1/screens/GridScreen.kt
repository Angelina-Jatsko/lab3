package com.raywenderlich.android.lab1.screens

import android.content.Intent.ShortcutIconResource
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items = listOf(
    Icons.Filled.Check,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.Delete,
    Icons.Filled.Home,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.ThumbUp
)

@Composable
fun GridScreen() {
    GridView(columCount = 3)

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun GridView(columCount: Int) {
    TODO("Not yet implemented")
}
@Composable
fun RowItem(rowItems: List<IconResource>) {

}

@Composable
fun RowScope.GridIcon(iconResource: IconResource) {

}
data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)