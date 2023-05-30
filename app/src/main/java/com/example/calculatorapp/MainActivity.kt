package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import android.util.Log
import net.objecthunter.exp4j.ExpressionBuilder



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fun calculate(expression: String): String {
            val newexpression = expression.replace("×", "*").toString()
            val result = ExpressionBuilder(newexpression).build().evaluate()
            return result.toString()
        }
        binding.ac.setOnClickListener {
            binding.expression.text = ""
            binding.result.text = ""
        }
        binding.one.setOnClickListener {
            val res = binding.expression.text.toString() + "1"
            binding.expression.text = res
            Log.d("ClickTag", "onCreate: Clicked")
        }
        binding.two.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "2"
        }
        binding.three.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "3"
        }
        binding.four.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "4"
        }
        binding.five.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "5"
        }
        binding.six.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "6"
        }
        binding.seven.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "7"
        }
        binding.eight.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "8"
        }
        binding.nine.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "9"
        }
        binding.zero.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "0"
        }
        binding.period.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "."
        }
        binding.plus.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "+"
        }
        binding.minus.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "-"
        }
        binding.divide.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "/"
        }
        binding.multiply.setOnClickListener {
            binding.expression.text = binding.expression.text.toString() + "×"
        }
//        binding.percent.setOnClickListener {
//            binding.expression.text = binding.expression.text.toString() + "%"
//        }
        binding.erase.setOnClickListener {
            binding.expression.text = binding.expression.text.toString()
                .slice(0 until binding.expression.text.toString().length - 1)
        }
        binding.equal.setOnClickListener {
            val expr = binding.expression.text.toString()
            binding.result.text = calculate(expr)
        }
    }
}