package me.xiaocao.model_b

import android.os.Bundle
import me.xiaocao.library_common.BaseActivity

/**
 * @author 　xiaocao
 * Description　　
 * Date:2019/9/29 0029 14:05
 */
class MainActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.model_b_activity_main)
    }
    override fun isRouter():Boolean{
        return false
    }
}