package com.app.androidapp.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.androidapp.R
import com.app.androidapp.adapter.AdapterUser
import com.app.androidapp.service.RetrofitFactory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import com.app.androidapp.databinding.*;
import com.app.androidapp.model.Model

class MainFragment : Fragment(), IMainFragment {

    companion object {
        fun newInstance(name: String): MainFragment {
            val f = MainFragment();
            val arg = Bundle();
            arg.putString("name", name)
            f.arguments = arg
            return f;
        }
    }

    private lateinit var viewModel: MainFragmentViewModel
    private lateinit var binding: MainFragmentBinding
    private lateinit var linearLayoutManager: LinearLayoutManager;
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        viewModel = ViewModelProviders.of(this).get(MainFragmentViewModel::class.java)
        viewModel.navigator = (this)
        viewModel.getUsersFromServer()

    }


    override fun showError(error: Throwable?) {
        System.out.println(error.toString());

    }


    override fun showResult(result: Any) {
        System.out.println(result);
//        binding.root.tv.setText(result.toString())
        linearLayoutManager = LinearLayoutManager(this.context);
        binding.rv.layoutManager = linearLayoutManager;
        val user = result as Model.Users;
        binding.rv.adapter = AdapterUser(user.users)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        return binding.root;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainFragmentViewModel::class.java)

    }

}
