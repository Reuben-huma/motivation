package eu.tutorials.motivation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import eu.tutorials.motivation.adapter.MotivationAdapter
import eu.tutorials.motivation.databinding.FragmentMotivationBinding
import eu.tutorials.motivation.model.Motivation
import eu.tutorials.motivation.model.MotivationViewModel

class MotivationFragment : Fragment() {

    private val viewModel: MotivationViewModel by viewModels()
    private lateinit var binding: FragmentMotivationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMotivationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val motivationsList = listOf(
            Motivation(picture = R.drawable.image1, message = getString(R.string.message1)),
            Motivation(picture = R.drawable.image2, message = getString(R.string.message2)),
            Motivation(picture = R.drawable.image3, message = getString(R.string.message3)),
            Motivation(picture = R.drawable.image4, message = getString(R.string.message4)),
            Motivation(picture = R.drawable.image5, message = getString(R.string.message5)),
            Motivation(picture = R.drawable.image6, message = getString(R.string.message6)),
            Motivation(picture = R.drawable.image7, message = getString(R.string.message7)),
            Motivation(picture = R.drawable.image8, message = getString(R.string.message8)),
            Motivation(picture = R.drawable.image9, message = getString(R.string.message9)),
            Motivation(picture = R.drawable.image10, message = getString(R.string.message10))
        )

        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            motivationViewModel = viewModel
            motivationFragment = this@MotivationFragment
            recyclerView.adapter = MotivationAdapter(motivationsList)
            recyclerView.setHasFixedSize(true)
        }
    }

}