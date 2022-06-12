package com.appsid.meshcare.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.appsid.meshcare.R
import com.appsid.meshcare.adapter.NearByAdapter
import com.appsid.meshcare.data.DoctorData
import com.appsid.meshcare.detail.DetailActivity
import com.appsid.meshcare.itemview.NearByItemView
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment(), NearByItemView.OnClickList {

    private lateinit var homeViewModel: HomeViewModel

    private val nearByData: MutableList<DoctorData> = arrayListOf()

    private val adapterNearBy = NearByAdapter()

    private val fresherAdapter = NearByAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        initData()
        setDataNearBy(view)
        setDataFresher(view)
        return view
    }

    private fun setDataNearBy(view: View) {
        val manager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        view.rv_near_by_doctor.layoutManager = manager
        view.rv_near_by_doctor.adapter = adapterNearBy
        adapterNearBy.setListener(this)
        adapterNearBy.setData(nearByData)
    }

    private fun setDataFresher(view: View) {
        val manager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        view.rv_fresher_doctor.layoutManager = manager
        view.rv_fresher_doctor.adapter = fresherAdapter
        fresherAdapter.setListener(this)
        fresherAdapter.setData(nearByData)
    }

    private fun initData() {
        val doctor1 = DoctorData(
            "DR Amanda Roar",
            R.drawable.img_doctor_1,
            "MBBS, DNB -  Ophthalmology",
            4.0f
        )
        nearByData.add(doctor1)

        val doctor2 = DoctorData(
            "DR Joyan Recobba",
            R.drawable.img_doctor_2,
            "MBBS, DNB -  Ophthalmology",
            4.5f
        )
        nearByData.add(doctor2)

        val doctor3 = DoctorData(
            "DR Manuel Salvagore",
            R.drawable.img_doctor_3,
            "MBBS, DNB -  Ophthalmology",
            4.0f
        )
        nearByData.add(doctor3)

        val doctor4 = DoctorData(
            "DR Rebbeca Altis",
            R.drawable.img_doctor_1,
            "MBBS, DNB -  Ophthalmology",
            3.9f
        )
        nearByData.add(doctor4)

        val doctor5 = DoctorData(
            "DR Lionel Igor",
            R.drawable.img_doctor_2,
            "MBBS, DNB -  Ophthalmology",
            4.5f
        )
        nearByData.add(doctor5)

        val doctor6 = DoctorData(
            "DR Lisa Amartha",
            R.drawable.img_doctor_3,
            "MBBS, DNB -  Ophthalmology",
            4.8f
        )
        nearByData.add(doctor6)
    }

    override fun onSelect(data: DoctorData) {
        val intent = Intent(activity, DetailActivity::class.java)
        activity?.startActivity(intent)
    }

}