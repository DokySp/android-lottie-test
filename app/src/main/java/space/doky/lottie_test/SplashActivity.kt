package space.doky.lottie_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import space.doky.lottie_test.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.lottieView.visibility = View.VISIBLE
        binding.lottieView.speed = 1.0f

        Thread {
            Thread.sleep(1000)
            runOnUiThread {
                binding.lottieView.playAnimation()
            }
        }.start()

    }


}