package me.xiaocao.model_a

import android.os.Bundle
import me.xiaocao.library_common.BaseActivity

/**
 * @author 　xiaocao
 * Description　　
 * Date:2019/9/29 0029 14:05
 */
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.model_a_activity_main)
    }

    override fun isRouter():Boolean{
        return false
    }
}