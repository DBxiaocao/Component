package me.xiaocao.model_a

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import me.xiaocao.library_common.BaseActivity
import me.xiaocao.library_common.RoutingHelper

@Route(path = RoutingHelper.MODEL_A)
class ModelAActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.model_a_activity_main)
    }
}
