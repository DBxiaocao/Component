package me.xiaocao.library_common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author 　xiaocao
 * Description　　
 * Date:2019/9/29 0029 13:28
 */
class App :Application(){
    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
    }
}