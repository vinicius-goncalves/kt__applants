package codes.vinicius.applants

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import codes.vinicius.applants.ui.components.buttons.UIButton
import codes.vinicius.applants.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
  @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      AppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
          Home()
        }
      }
    }
  }
}

@Composable
fun Home() {
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ) {
    Column {
      Text(
        text = "plant. grow.",
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Bold
      )
      Text(
        "plant a tree, grow the earth."
      )
    }
    Column(
      modifier = Modifier.fillMaxHeight(),
      verticalArrangement = Arrangement.Bottom
    ) {
      Row {
        UIButton(
          modifier = Modifier
            .fillMaxWidth(.75f)
            .padding(bottom = 32.dp),
          text = "get started",
          fontWeight = FontWeight.Bold
        )
      }
    }
  }
}