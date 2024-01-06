package com.example.prueba1.MaxiQuiroz

data class ItemMesa(val cantidad: Int, val itemMenu: ItemMenu) {
    fun calcularSubtotal(): Int {
        return cantidad * itemMenu.precio.toInt()
    }
}