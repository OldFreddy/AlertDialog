package com.oldfredddy.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        createSimpleDialog()

        createSimpleMultiChoiceDialog()

    }

    private fun createSimpleDialog() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is my first Alert Dialog")
//        builder.setNeutralButton("Info", DialogInterface.OnClickListener { dialogInterface, i ->  })
        builder.setNeutralButton("Info") { dialogInterface, i -> Toast.makeText(this, "qwe", Toast.LENGTH_SHORT).show() }
        builder.setNegativeButton("No") { dialogInterface, i -> }
        builder.setPositiveButton("Yes") { dialod, i -> }


        builder.show()
    }

    private fun createSimpleMultiChoiceDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Что вам больше нравится")

//        builder.setMultiChoiceItems(R.array.multi_item,null,DialogInterface.OnMultiChoiceClickListener { dialog, i, b ->  })
        builder.setMultiChoiceItems(R.array.multi_item, null, DialogInterface.OnMultiChoiceClickListener { dialog, wich, choice ->
            Log.d("MyLog", "My Choice is: " + wich + "/ Is: " + choice)
        })


        builder.setNeutralButton("Info") { dialogInterface, i -> Toast.makeText(this, "qwe", Toast.LENGTH_SHORT).show() }
        builder.setNegativeButton("No") { dialogInterface, i -> }
        builder.setPositiveButton("Yes") { dialog, i -> }

        builder.show()
    }


}