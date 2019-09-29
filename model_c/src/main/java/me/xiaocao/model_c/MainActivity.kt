package me.xiaocao.model_c

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import me.xiaocao.library_common.BaseActivity

/**
 * @author 　xiaocao
 * Description　　
 * Date:2019/9/29 0029 14:05
 */
class MainActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.model_c_activity_main)
    }
    override fun isRouter():Boolean{
        return false
    }
}