package com.engineer.imitate.ui.fragments


import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.engineer.imitate.R
import com.engineer.imitate.ui.list.adapter.LargeImageAdapter
import com.engineer.imitate.ui.list.adapter.SimpleImageAdapter
import com.engineer.imitate.ui.list.decoration.OverLapDecoration
import com.engineer.imitate.ui.list.layoutmanager.FocusLayoutManager
import com.engineer.imitate.ui.widget.more.DZStickyNavLayouts
import com.engineer.imitate.util.dp2px
import kotlinx.android.synthetic.main.fragment_layout_manager.*
import kotlinx.android.synthetic.main.fragment_recycler_view.*

/**
 * https://github.com/Spikeysanju/ZoomRecylerLayout
 */
@Route(path = "/anim/recycler_view")
class RecyclerViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter = SimpleImageAdapter(getList())
        recyclerView.addItemDecoration(OverLapDecoration(context))
        recyclerView.adapter = adapter

        val _context = context ?: return

        val focusLayoutManager = FocusLayoutManager.Builder()
            .layerPadding(_context.dp2px(14f))
            .normalViewGap(_context.dp2px(14f))
            .focusOrientation(FocusLayoutManager.FOCUS_LEFT)
            .isAutoSelect(true)
            .maxLayerCount(3)
            .setOnFocusChangeListener { focusdPosition, lastFocusdPosition -> }
            .build()

        val emojiStr = String(Character.toChars(Integer.parseInt("1F5F3", 16)))
        emoji.setText("emoji $emojiStr")
        Toast.makeText(context, "value is ${text2.text}", Toast.LENGTH_SHORT).show()

        recyclerView_1.layoutManager = focusLayoutManager
        recyclerView_1.adapter = LargeImageAdapter(getList())

        recyclerView_2.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_2.adapter = LargeImageAdapter(getList())
        head_home_layout.setOnStartActivity(object : DZStickyNavLayouts.OnStartActivityListener {
            override fun onStart() {
                drawer_layout.openDrawer(GravityCompat.END)
            }
        })
        btn_close_right.setOnClickListener {
            drawer_layout.closeDrawer(GravityCompat.END)
        }


        for (i in 1..5) {
            val view = LayoutInflater.from(context).inflate(R.layout.image_item, null)
            container_vertical.addView(view)
        }


        for (i in 1..5) {
            val view = LayoutInflater.from(context).inflate(R.layout.image_item, null)
            container_horizontal.addView(view)
        }

        stack_view_layout_1.layoutDirection = View.LAYOUT_DIRECTION_LTR
        stack_view_layout_2.layoutDirection = View.LAYOUT_DIRECTION_RTL


    }

    // <editor-fold defaultstate="collapsed" desc="prepare datas">
    private fun getList(): MutableList<String> {
        val datas = ArrayList<String>()
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        datas.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555581149653&di=5912dd2fe4db77ce303569b3e8f34d7b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201406%2F08%2F20140608161225_VYVEV.jpeg")
        return datas
    }
    // </editor-fold>


}
