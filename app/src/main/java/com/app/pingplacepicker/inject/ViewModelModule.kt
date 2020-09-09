package com.app.pingplacepicker.inject

import com.app.pingplacepicker.viewmodel.PlaceConfirmDialogViewModel
import com.app.pingplacepicker.viewmodel.PlacePickerViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { PlacePickerViewModel(get()) }

    viewModel { PlaceConfirmDialogViewModel(get()) }

}