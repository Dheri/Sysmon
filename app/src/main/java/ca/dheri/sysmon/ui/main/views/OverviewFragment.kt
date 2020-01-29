package ca.dheri.sysmon.ui.main.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import ca.dheri.sysmon.R
import ca.dheri.sysmon.databinding.OverviewFragmentBinding
import ca.dheri.sysmon.ui.main.viewmodels.OverviewViewModel


class OverviewFragment : Fragment() {

    companion object {
        fun newInstance() = OverviewFragment()
    }

//    private lateinit var binding: OverviewFragmentBinding;
    private lateinit var viewModel: OverviewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: OverviewFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.overview_fragment, container, false)


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OverviewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
