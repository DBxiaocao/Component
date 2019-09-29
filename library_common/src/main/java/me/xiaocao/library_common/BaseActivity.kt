package me.xiaocao.library_common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author 　xiaocao
 * Description　　
 * Date:2019/9/29 0029 13:29
 */
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isRouter())
            ARouter.getInstance().inject(this)
    }

    protected open fun isRouter(): Boolean {
        return true
    }
}