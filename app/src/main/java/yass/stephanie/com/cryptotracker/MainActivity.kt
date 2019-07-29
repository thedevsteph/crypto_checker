package yass.stephanie.com.cryptotracker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val ethereum: Currencies = Currencies("ETH", "34.34", R.drawable.abc_ab_share_pack_mtrl_alpha, "Ethereum")
    val bitcoin: Currencies = Currencies("BTC", "31,113.44", R.drawable.abc_ab_share_pack_mtrl_alpha, "Bitcoin")
    val fakeData = arrayListOf(ethereum, bitcoin, ethereum, ethereum, bitcoin, bitcoin, ethereum, ethereum, bitcoin)

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = HomeAdapter(fakeData)

        recyclerView = findViewById<RecyclerView>(R.id.home_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter

        }
    }
}
