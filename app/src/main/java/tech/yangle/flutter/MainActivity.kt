package tech.yangle.flutter

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

/**
 * Flutter
 * <p>
 * Created by YangLe on 2023/6/14.
 * Website：http://www.yangle.tech
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_flutter).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = FlutterActivity
            .withCachedEngine("default_engine_id")
            .build(this)
        startActivity(intent)
    }
}