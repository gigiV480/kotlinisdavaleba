package com.example.gigisdavaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var coast:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coast=findViewById(R.id.coast)
        coast.setOnClickListener {
            Toast.makeText(this, "ფასი : 200 ლარი", Toast.LENGTH_LONG).show()
        }
    }
}


class car{
    var model:String="undefined" //default
    var color:String="undefined" //default
    var turbo:Double=0.0 //default

    fun better(anotherCar:car) {
        if(anotherCar is car){
            if(this.turbo>anotherCar.turbo){
                print("${this.turbo}>${anotherCar.turbo}")

            }else{

                print("${this.turbo}<${anotherCar.turbo}")

            }

        }

    }

    fun agawera(){
        print("\nmodel-${this.model}\ncolor-${this.color}\nturbo-${this.turbo}\n")
    }
}

fun main(){
    var car1=car()
    car1.turbo=3.4
    car1.color="black"
    car1.model="bmw"
    car1.agawera()

    var car2=car()
    car2.turbo=2.3
    car2.color="red"
    car2.model="audi"

    car1.better(car2)

    car2.agawera()

}