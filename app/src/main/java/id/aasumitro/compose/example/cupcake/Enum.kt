package id.aasumitro.compose.example.cupcake

import androidx.annotation.StringRes
import id.aasumitro.compose.R

enum class CupcakeScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Flavor(title = R.string.choose_flavor),
    Pickup(title = R.string.choose_pickup_date),
    Summary(title = R.string.order_summary)
}