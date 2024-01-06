package com.example.prueba1.MaxiQuiroz

class CuentaMesa(val mesa: Int)
{
    private val _items = mutableListOf<ItemMesa>()
    var aceptaPropina: Boolean = true

    fun agregarItem(itemMenu: ItemMenu, cantidad: Int)
    {
        val itemMesa = ItemMesa(cantidad, itemMenu)
        _items.add(itemMesa)
    }

    fun agregarItem(itemMesa: ItemMesa)
    {
        _items.add(itemMesa)
    }

    fun calcularTotalSinPropina(): Int
    {
        return _items.sumBy { it.calcularSubtotal() }
    }

    fun calcularPropina(): Int
    {
        if (aceptaPropina) {
            return (calcularTotalSinPropina() * 0.1).toInt()
        }
        return 0
    }

    fun calcularTotalConPropina(): Int
    {
        return calcularTotalSinPropina() + calcularPropina()
    }
}