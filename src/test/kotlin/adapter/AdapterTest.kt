package adapter

import org.junit.Test
import org.junit.Assert.*

class AdapterTest {

    @Test
    fun adapter_test() {

        val list = RecyclerView<Int>()
        val items = listOf(2, 7, 0)

        list.setAdapter(object : Adapter<Int> {
            override fun getItem(position: Int) = items[position]
            override fun getItemCount() = items.size
        })

        val drawItems = list.draw()
        assertEquals(items, drawItems)
    }
}