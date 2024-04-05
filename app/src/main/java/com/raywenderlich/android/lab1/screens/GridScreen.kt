package com.raywenderlich.android.lab1.screens

import android.content.Intent.ShortcutIconResource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import kotlin.math.ceil

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
fun GridView(columCount: Int) { val itemSize = items.size
    val rowCount = ceil(itemSize.toFloat() / columCount).toInt()
    val gridItems = mutableListOf<List<IconResource>>()
    val position = 0
    for (i in 0 <= until < rowCount) {
       val rowItem = mutableListOf<IconResource>()
        for (j in 0 <= until < columCount) {
           if (position.inc() <= itemSize) {
               rowItem.add(IconResource(items[position++],true))
           }
        }
    }
     val itemsToFill = columCount - rowItem.size
     for (j in 0 <= until < itemsToFill) {
         rowItem.add(IconResource(Icons.Filled.Delete, false))
     }
    gridItems.add(rowItem)
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(gridItems) {items ->
            RowItem(items)
        }
    }
}


@Composable
fun RowItem(rowItems: List<IconResource>) {
  Row {
      for (element in rowItems)
          GridIcon(element)
  }
}

@Composable
fun RowScope.GridIcon(iconResource: IconResource) {

}
data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)