package com.devansh.temperatureconvertor

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devansh.temperatureconvertor.databinding.ActivityMainBinding
import com.devansh.temperatureconvertor.ui.theme.TemperatureConvertorTheme


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.convert.setOnClickListener {
            val result = when(binding.radioGroup.checkedRadioButtonId)
            {
                R.id.radioButton -> (binding.editTextNumberDecimal.text.toString().toDouble()-32)*5/9
                else->(binding.editTextNumberDecimal.text.toString().toDouble()*9/5)+32
            }
            binding.textView2.text=result.toString()

        }
    }
}


