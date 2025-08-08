package codes.vinicius.applants.ui.components.buttons

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import codes.vinicius.applants.ui.theme.AppTheme

@Composable
fun UIButton(
  text: String,
  fontWeight: FontWeight = FontWeight.Normal,
  onClick: () -> Unit = {},
  @SuppressLint("ModifierParameter") modifier: Modifier = Modifier,
) {
  AppTheme {
    Button(
      shape = RoundedCornerShape(size = 2.dp),
      onClick = onClick,
      modifier = modifier,
    ) {
      Text(
        text,
        fontWeight = fontWeight
      )
    }
  }
}

@Preview(showBackground = true, device = Devices.PIXEL_7)
@Composable
fun UIButtonPreview() {
  UIButton(text = "Button")
}