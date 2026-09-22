package com.pemmob.putriisnainilaksitautami.data.dummy

import com.pemmob.putriisnainilaksitautami.data.model.Category
import com.pemmob.putriisnainilaksitautami.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 50, img = "prod_kripik_singkong"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Mendoan asli Purbalingga", price = 20000.0, stock = 30, img = "prod_mendoan"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale pisang manis", price = 25000.0, stock = 20, img = "prod_sale_pisang"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk khas", price = 30000.0, stock = 40, img = "prod_getuk_goreng"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Nopia rasa coklat", price = 20000.0, stock = 60, img = "prod_nopia"),

        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet segar", price = 10000.0, stock = 100, img = "prod_es_dawet"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Robusta", description = "Kopi bubuk", price = 45000.0, stock = 20, img = "prod_kopi_robusta"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Jahe instan", price = 12000.0, stock = 50, img = "prod_wedang_jahe"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Poci", description = "Teh melati", price = 15000.0, stock = 40, img = "prod_teh_poci"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Sirup Stroberi", description = "Sirup rasa", price = 35000.0, stock = 15, img = "prod_sirup_stroberi"),

        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain batik", price = 150000.0, stock = 10, img = "prod_batik_purbalingga"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal awet", price = 40000.0, stock = 25, img = "prod_sandal_bandol"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai", price = 25000.0, stock = 100, img = "prod_sapu_glagah"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Gantungan Kunci", description = "Gantungan kayu", price = 5000.0, stock = 150, img = "prod_gantungan_kunci"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Tas Rajut", description = "Tas wanita rajut", price = 85000.0, stock = 5, img = "prod_tas_rajut")
    )
}
