package tech.yangle.flutter

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

/**
 * Application
 * Created by YangLe on 2023/6/16.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // 创建 Flutter 引擎
        val flutterEngine = FlutterEngine(this)
        // 指定要跳转的flutter页面
        flutterEngine.navigationChannel.setInitialRoute("main")
        flutterEngine.dartExecutor.executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        // 这里做一个缓存，可以在适当的时候执行它，例如app里，在跳转前执行预加载
        val flutterEngineCache = FlutterEngineCache.getInstance()
        flutterEngineCache.put("default_engine_id", flutterEngine)
    }
}