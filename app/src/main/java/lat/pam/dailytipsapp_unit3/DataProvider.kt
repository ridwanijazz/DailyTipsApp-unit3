package lat.pam.dailytipsapp_unit3.data

import lat.pam.dailytipsapp_unit3.R

data class Tip(val title: String, val description: String, val imageResource: Int)

object DataProvider {
    val tipsList = listOf(
        Tip("Membaca", "Tips hari pertama adalah membaca buku. Membaca buku membantu kita untuk fokus dan dapat menghindari overthinking", R.drawable.img),
        Tip("Olahraga", "Olahraga membantu kita melepaskan stress dan dapat menaikan mood juga", R.drawable.img_1),
        // Tambahkan tip lainnya sesuai kebutuhan
    )
}
