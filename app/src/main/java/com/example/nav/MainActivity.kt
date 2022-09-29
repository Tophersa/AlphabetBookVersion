package com.example.nav

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nav.databinding.ActivityMainBinding
import com.example.nav.ui.notifications.NotificationsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)





        val buttonA = findViewById<Button>(R.id.buttonA)
        val buttonB = findViewById<Button>(R.id.buttonB)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonD = findViewById<Button>(R.id.buttonD)
        val buttonE = findViewById<Button>(R.id.buttonE)
        val buttonF = findViewById<Button>(R.id.buttonF)
        val buttonG = findViewById<Button>(R.id.buttonG)
        val buttonH = findViewById<Button>(R.id.buttonH)
        val buttonI = findViewById<Button>(R.id.buttonI)
        val buttonJ = findViewById<Button>(R.id.buttonJ)
        val buttonK = findViewById<Button>(R.id.buttonK)
        val buttonL = findViewById<Button>(R.id.buttonL)
        val buttonM = findViewById<Button>(R.id.buttonM)
        val buttonN = findViewById<Button>(R.id.buttonN)
        val buttonO = findViewById<Button>(R.id.buttonO)
        val buttonP = findViewById<Button>(R.id.buttonP)
        val buttonQ = findViewById<Button>(R.id.buttonQ)
        val buttonR = findViewById<Button>(R.id.buttonR)
        val buttonS = findViewById<Button>(R.id.buttonS)
        val buttonT = findViewById<Button>(R.id.buttonT)
        val buttonU = findViewById<Button>(R.id.buttonU)
        val buttonV = findViewById<Button>(R.id.buttonV)
        val buttonW = findViewById<Button>(R.id.buttonW)
        val buttonX = findViewById<Button>(R.id.buttonX)
        val buttonY = findViewById<Button>(R.id.buttonY)
        val buttonZ = findViewById<Button>(R.id.buttonZ)


        val intent = Intent(this, LetterActivity::class.java)



        val images = intArrayOf(R.drawable.slide01, R.drawable.slide02, R.drawable.slide03,
            R.drawable.slide04, R.drawable.slide05, R.drawable.slide06, R.drawable.slide07,
            R.drawable.slide08, R.drawable.slide09, R.drawable.slide10, R.drawable.slide11,
            R.drawable.slide12, R.drawable.slide13, R.drawable.slide14, R.drawable.slide15,
            R.drawable.slide16, R.drawable.slide17, R.drawable.slide18, R.drawable.slide19,
            R.drawable.slide20, R.drawable.slide21, R.drawable.slide22, R.drawable.slide23,
            R.drawable.slide24, R.drawable.slide25, R.drawable.slide26)
        for(i in 0..25){
            val bitmap = BitmapFactory.decodeResource(resources,images[i])
           // val bit = img.setImageBitmap(bitmap)
            //saveImage(bitmap)
        }

        buttonA.setOnClickListener{

            val bitmap = BitmapFactory.decodeResource(resources,R.drawable.slide01)
            // val bit = img.setImageBitmap(bitmap)
           // saveImage(bitmap)


            intent.putExtra("POSITION", 0)
            startActivity(intent)
        }

        buttonB.setOnClickListener{
            intent.putExtra("POSITION", 1)
            startActivity(intent)
        }

        buttonC.setOnClickListener{
            intent.putExtra("POSITION", 2)
            startActivity(intent)
        }

        buttonD.setOnClickListener{
            intent.putExtra("POSITION", 3)
            startActivity(intent)
        }

        buttonE.setOnClickListener{
            intent.putExtra("POSITION", 4)
            startActivity(intent)
        }

        buttonF.setOnClickListener{
            intent.putExtra("POSITION", 5)
            startActivity(intent)
        }

        buttonG.setOnClickListener{
            intent.putExtra("POSITION", 6)
            startActivity(intent)
        }

        buttonH.setOnClickListener{
            intent.putExtra("POSITION", 7)
            startActivity(intent)
        }

        buttonI.setOnClickListener{
            intent.putExtra("POSITION", 8)
            startActivity(intent)
        }

        buttonJ.setOnClickListener{
            intent.putExtra("POSITION", 9)
            startActivity(intent)
        }

        buttonK.setOnClickListener{
            intent.putExtra("POSITION", 10)
            startActivity(intent)
        }

        buttonL.setOnClickListener{
            intent.putExtra("POSITION", 11)
            startActivity(intent)
        }

        buttonM.setOnClickListener{
            intent.putExtra("POSITION", 12)
            startActivity(intent)
        }

        buttonN.setOnClickListener{
            intent.putExtra("POSITION", 13)
            startActivity(intent)
        }

        buttonO.setOnClickListener{
            intent.putExtra("POSITION", 14)
            startActivity(intent)
        }

        buttonP.setOnClickListener{
            intent.putExtra("POSITION", 15)
            startActivity(intent)
        }

        buttonQ.setOnClickListener{
            intent.putExtra("POSITION", 16)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            intent.putExtra("POSITION", 17)
            startActivity(intent)
        }

        buttonS.setOnClickListener{
            intent.putExtra("POSITION", 18)
            startActivity(intent)
        }

        buttonT.setOnClickListener{
            intent.putExtra("POSITION", 19)
            startActivity(intent)
        }

        buttonU.setOnClickListener{
            intent.putExtra("POSITION", 20)
            startActivity(intent)
        }

        buttonV.setOnClickListener{
            intent.putExtra("POSITION", 21)
            startActivity(intent)
        }

        buttonW.setOnClickListener{
            intent.putExtra("POSITION", 22)
            startActivity(intent)
        }

        buttonX.setOnClickListener{
            intent.putExtra("POSITION", 23)
            startActivity(intent)
        }

        buttonY.setOnClickListener{
            intent.putExtra("POSITION", 24)
            startActivity(intent)
        }

        buttonZ.setOnClickListener{
            intent.putExtra("POSITION", 25)
            startActivity(intent)
        }


    }

}