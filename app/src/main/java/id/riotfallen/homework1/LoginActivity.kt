package id.riotfallen.homework1

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.vid_login_background)

        videoViewBackgroundLogin.setVideoURI(uri)
        videoViewBackgroundLogin.start()
        videoViewBackgroundLogin.setOnPreparedListener {
            it.isLooping = true
        }
    }
}
