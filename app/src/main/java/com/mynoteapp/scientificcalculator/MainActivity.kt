package com.mynoteapp.scientificcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var secondaryTv: TextView
    lateinit var primaryTV: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bbrac1: Button
    lateinit var bbrac2: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfact: Button
    lateinit var bsquare: Button
    lateinit var bsqrt: Button
    lateinit var binv: Button
    lateinit var b0: Button
    lateinit var b9: Button
    lateinit var b8: Button
    lateinit var b7: Button
    lateinit var b6: Button
    lateinit var b5: Button
    lateinit var b4: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var bpi: Button
    lateinit var bmul: Button
    lateinit var bminus: Button
    lateinit var bplus: Button
    lateinit var bequal: Button
    lateinit var bdot: Button
    lateinit var bdiv: Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secondaryTv = findViewById(R.id.idTVSecondary)
        primaryTV = findViewById(R.id.idTVPrimary)
        bac = findViewById(R.id.bac)
        bc = findViewById(R.id.bc)
        bbrac1 = findViewById(R.id.bbrac1)
        bbrac2 = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        btan = findViewById(R.id.btan)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bfact = findViewById(R.id.bfact)
        bsquare = findViewById(R.id.bsquare)
        bsqrt = findViewById(R.id.bsqrt)
        binv = findViewById(R.id.binv)
        b0 = findViewById(R.id.b0)
        b9 = findViewById(R.id.b9)
        b8 = findViewById(R.id.b8)
        b7 = findViewById(R.id.b7)
        b6 = findViewById(R.id.b6)
        b5 = findViewById(R.id.b5)
        b4 = findViewById(R.id.b4)
        b3 = findViewById(R.id.b3)
        b2 = findViewById(R.id.b2)
        b1 = findViewById(R.id.b1)
        bpi = findViewById(R.id.bpi)
        bmul = findViewById(R.id.bmul)
        bminus = findViewById(R.id.bminus)
        bplus = findViewById(R.id.bplus)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bdiv = findViewById(R.id.bdiv)

        // adding on click listener to our all buttons.
        b1.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            primaryTV.text = (primaryTV.text.toString() + "1")
        }
        b2.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            primaryTV.text = (primaryTV.text.toString() + "2")
        }
        b3.setOnClickListener {
            // on below line we are appending
            // the expression to our text view.
            primaryTV.text = (primaryTV.text.toString() + "3")
        }
        b4.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "4")
        }
        b5.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "5")
        }
        b6.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "6")
        }
        b7.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "7")
        }
        b8.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "8")
        }
        b9.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "9")
        }
        b0.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "0")
        }
        bdot.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ".")
        }
        bplus.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "/")
        }
        bbrac1.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "(")
        }
        bbrac2.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ")")
        }
        bpi.setOnClickListener {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            primaryTV.text = (primaryTV.text.toString() + "3.142")
            secondaryTv.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "cos")
        }
        btan.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "tan")
        }
        binv.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "ln")
        }
        blog.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "log")
        }

        bminus.setOnClickListener {
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            val str: String = primaryTV.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                primaryTV.text = (primaryTV.text.toString() + "-")
            }
        }

        bmul.setOnClickListener {
            // if mul sign is not present in our
            // text view then only we are adding
            // the multiplication operator to it.
            val str: String = primaryTV.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                primaryTV.text = (primaryTV.text.toString() + "*")
            }
        }

        bsqrt.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid no", Toast.LENGTH_LONG).show()

            } else {
                val str: String = primaryTV.text.toString()   // yeh kya kiya strore?
                val r = Math.sqrt(str.toDouble())
                val result = r.toString()
                primaryTV.text = result

            }
        }
        bac.setOnClickListener {
            primaryTV.text = ""
            secondaryTv.text = ""
        }
        bc.setOnClickListener {
            var str: String = primaryTV.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                primaryTV.text = str
            }
        }
        bsquare.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid no", Toast.LENGTH_LONG).show()
            } else {
                val d: Double = primaryTV.text.toString().toDouble()
                val square = d * d
                primaryTV.text = square.toString()
                secondaryTv.text = square.toString()

            }
        }

        bfact.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "please enter a valid no", Toast.LENGTH_LONG).show()
            } else {
                val value: Int = primaryTV.text.toString().toInt()
                val fact: Int = factorial(value)
                primaryTV.text = fact.toString()
                secondaryTv.text = fact.toString()
            }
        }

        bequal.setOnClickListener {
            val str: String = primaryTV.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            primaryTV.text = r
            secondaryTv.text = str
        }


    }

    private fun factorial(n: Int): Int {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    private fun evaluate(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0

            fun nextChar() {
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            fun eat(charToEdt: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()

                if (ch == charToEdt) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                var x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected : " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x -= parseTerm()
                    else return x
                }

            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor() // multiplication
                    else if (eat('/'.toInt())) x /= parseFactor() // division
                    else return x
                }
            }

            fun parseFactor(): Double {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+'.toInt())) return parseFactor() // unary plus
                if (eat('-'.toInt())) return -parseFactor() // unary minus
                // creating a double variable for ans.
                var x: Double
                // on below line we are creating
                // a variable for position.
                val startPos = pos
                // on below line we are checking
                // for opening and closing parenthesis.
                if (eat('('.toInt())) { // parentheses
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    // numbers
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    // on below line we are getting sub string from our string using start and pos.
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    // calling a method to parse our factor.
                    x = parseFactor()
                    // on below line we are checking for square root.
                    x =
                        if (func == "sqrt") Math.sqrt(x)
                        // on below line we are checking for sin function
                        // and calculating sin function using Math class.
                        else if (func == "sin") Math.sin(
                            Math.toRadians(x)
                            // on below line we are calculating the cos value
                        ) else if (func == "cos") Math.cos(
                            Math.toRadians(x)
                            // on below line we are calculating
                            // the tan value of our expression.
                        ) else if (func == "tan")
                            Math.tan(Math.toRadians(x))
                        // on below line we are calculating
                        // log value of the expression.
                        else if (func == "log")
                            Math.log10(x)
                        // on below line we are calculating
                        // ln value of expression.
                        else if (func == "ln") Math.log(x)
                        // f we get any error then
                        // we simply return the exception.
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                // on below line we are calculating the power of the expression.
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }
            // at last calling a parse for our expression.
        }.parse()
    }
}